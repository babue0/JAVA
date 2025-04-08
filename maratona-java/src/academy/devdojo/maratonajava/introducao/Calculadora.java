package academy.devdojo.maratonajava.introducao;

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
    System.out.println("a) soma");
    System.out.println("b) subtracao");
    System.out.println("c) multiplicacao");
    System.out.println("d) divisao");
    char operation = scanner.next().charAt(0);

    if (operation == 'a'){
      System.out.println(num1 + num2);
    }else if (operation == 'b'){
      System.out.println(num1 - num2);
    }else if (operation == 'c') {
      System.out.println(num1 * num2);
    }else if (operation == 'd') {
      System.out.println(num1 / num2);
    }
  }
}
