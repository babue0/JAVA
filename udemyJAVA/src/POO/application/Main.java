package POO.application;

import POO.EX1.entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Triangle x, y;
    x = new Triangle();
    y = new Triangle();

    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();

    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    double areaX = x.area();

    double areaY = y.area();

    System.out.printf("AreaX: %.4f\n", areaX);
    System.out.printf("AreaY: %.4f\n", areaY);

    if (areaX > areaY) {
      System.out.println("X");
    }else{
      System.out.println("Y");
    }
    sc.close();
  }
}



