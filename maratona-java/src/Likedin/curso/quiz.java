package Likedin.curso;

import java.util.Scanner;

public class quiz {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Questao 1:");
    System.out.println("Quanto é 15 * 3? :");
    System.out.println("a) 45");
    System.out.println("b) 30");
    System.out.println("c) 10");

    int resposta = scanner.nextInt();

    if (resposta == 45){
      System.out.println("Correto");
    }else{
      System.out.println("Errado");
    }

  }
}
