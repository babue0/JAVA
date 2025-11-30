package Fundamentos;

import java.util.Scanner;

public class ParImpar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("par ou impar");
    System.out.println("digite um numero inteiro: ");
    int num = sc.nextInt();

    if (num % 2 == 0) {
      System.out.println("par");
    } else {
      System.out.println("impar");
    }
  }
}
