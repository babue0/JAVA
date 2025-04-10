package Likedin.curso;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Calculadora:");
    System.out.println("Digite o primeiro numero: ");
    float num1 = scanner.nextFloat();
    System.out.println("Digite o segundo numero: ");
    float num2 = scanner.nextFloat();



    System.out.println("Qual operacao voce deseja utilizar?");
    System.out.println("1) soma");
    System.out.println("2) subtracao");
    System.out.println("3) multiplicacao");
    System.out.println("4) divisao");

    char operation = scanner.next().charAt(0);


    if (operation == '1'){
      System.out.println("Operacao escolhida: Soma");
      System.out.println(num1 + num2);
    }else if (operation == '2'){
      System.out.println("Operacao escolhida: Subtracao" );
      System.out.println(num1 - num2);
    }else if (operation == '3') {
      System.out.println("Operacao escolhida: Multiplicacao");
      System.out.println(num1 * num2);
    }else if (operation == '4') {
      System.out.println("Operacao escolhida: Divisao");
      System.out.println(num1 / num2);
    }
  }
}
