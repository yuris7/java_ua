package ua.stqa.pft.sandbox;

import java.lang.Math;

public class Point2Variant {

  public static void main(String[] args) {
    Point2Variant p1 = new Point2Variant();
    Point2Variant p2 = new Point2Variant(2,3);
    System.out.println("Растстояние между точками "+p1+" и "+p2+" равно "+p1.length(p2));
  }
  public double x; // абсцисса точки
  public double y; // ордината точки

  // возвращает строку с описанием точки
  public String toString() {

    return "(" + x + ";" + y + ")";
  }

  // выводит на экран описание точки
  public void printPoint() {
    System.out.print(this.toString());
  }

  // конструктор, создающий точку в начале координат
  public Point2Variant() {
    x = 0.0;
    y = 0.0;
  }

  // конструктор, создающий точку с указанными координатами
  public Point2Variant(double a, double b) {
    x = a;
    y = b;
  }

  // метод вычисляющий расстояние между точками
  public double length(Point2Variant p) {

    return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
  }

  // метод проверяющий совпадают ли точки
  public boolean equalsPoint(Point2Variant p) {
    if (this.x == p.x && this.y == p.y) {
      return true;
    } else {
      return false;
    }
  }
}
