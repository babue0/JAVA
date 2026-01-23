package Section10.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class AlturasEx {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);



    System.out.println("QUantas ppessoas serao? ");
    int n = sc.nextInt();

    String[] nomes = new String[n];
    int[] idades = new int[n];
    double[] alturas = new double[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Dados da " + (i+1) + "a pessoa: ");
      System.out.print("Nome: ");
      nomes[i] = sc.next();
      System.out.print("Idade: ");
      idades[i] = sc.nextInt();
      System.out.print("Altura: ");
      alturas[i] = sc.nextDouble();
    }

    double sum = 0;
    for (int i = 0; i < n; i++) {
      sum = sum + alturas[i];
    }
    double mediaAlturas = sum / n;

    System.out.println("Altura media: " + mediaAlturas);

    int cont = 0;
    for (int i = 0; i < n; i++) {
      if (idades[i] < 16){
        cont++;
      }
    }

    double percent = cont * 100.0 / n;

    System.out.println("Porcentagem de menores de 16: " + percent);

    for (int i = 0; i < n; i++) {
      if (idades[i] < 16){
        System.out.println(nomes[i]);
      }
    }

    sc.close();

  }
}
