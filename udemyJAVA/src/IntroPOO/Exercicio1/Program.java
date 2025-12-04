package IntroPOO.Exercicio1;

import java.util.Locale;
import java.util.Scanner;

public class Program {

  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Retaungulo rect = new Retaungulo();

    System.out.println("Digite a largura e sem seguida a altura: ");
    rect.largura = sc.nextDouble();
    rect.altura = sc.nextDouble();

    System.out.println("Area = " + rect.Area());
    System.out.println("Perimetro = " + rect.Perimetro());
    System.out.println("Diagonal = " + rect.Diagonal());

    sc.close();
  }

}
