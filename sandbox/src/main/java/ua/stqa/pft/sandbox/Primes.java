package ua.stqa.pft.sandbox;

/**
 * Created by yurii.voina on 2/12/2017.
 */
public class Primes {

    public static  boolean isPrimeFast(int n){
        int m = (int) Math.sqrt(n);
        for(int i = 2; i < m / 2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeWhile(int n){
        int i = 2;
        while(i < n && n % i != 0){
            i++;
        }
        return i == n ;
    }
    public static  boolean isPrime(long n){
        for(long i = 2; i < n; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
