package academy.devdojo.maratonajava;

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite um numero: ");
    int num1 = scanner.nextInt();


    if((num1 & 2) == 0){
      System.out.println("Esse numero é par");
    }else {
      System.out.println("Esse numero e impar");
    }
  }
}
