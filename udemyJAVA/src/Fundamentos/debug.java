package Fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class debug {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    double largura = sc.nextDouble();
    double comprimento = sc.nextDouble();
    double metroQuadrado = sc.nextDouble();

    double area = largura * comprimento;
    double preco = area * metroQuadrado;

    System.out.printf("area = %.2f", area);
    System.out.printf("preco = %.2f", preco);

    sc.close();
  }
}
