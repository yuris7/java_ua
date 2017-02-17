package ua.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class ApplicationManager{
  WebDriver wd;

  private NavigationHelper navigationHelper;
  private GroupHelper groupHelper;
  private SessionHelper sessionHelper;
  private ContactHelper contactHelper;
  private String browser;

  public ApplicationManager (String browser){

    this.browser = browser;
  }
  public void init() {
//    if (browser.equals(BrowserType.FIREFOX)){
//      wd = new FirefoxDriver();
//    } else if (browser.equals(BrowserType.CHROME)){
//      wd = new ChromeDriver();
//    } else if (Objects.equals(browser, BrowserType.IE)){
//      wd = new InternetExplorerDriver();
//    }
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    wd.get("http://localhost:8077/addressbook");
    groupHelper = new GroupHelper(wd);
    navigationHelper = new NavigationHelper(wd);
    sessionHelper = new SessionHelper(wd);
    contactHelper = new ContactHelper(wd);
    sessionHelper.login("admin", "secret");
  }


  public void stop() {

    wd.quit();
  }

  public GroupHelper getGroupHelper() {

    return groupHelper;
  }

  public NavigationHelper getNavigationHelper() {

    return navigationHelper;
  }

  public ContactHelper getContactHelper() {

    return contactHelper;
  }

  public SessionHelper getSessionHelper() {

    return sessionHelper;
  }
}
