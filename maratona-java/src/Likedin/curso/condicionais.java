package Likedin.curso;

import java.util.Scanner;

public class condicionais {
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Qual sua idade? ");

    int idade = scanner.nextInt();
    System.out.println("Voce tem" + " " + idade + " " + "anos");

    if(idade < 18){
      System.out.println("Voce é menor de idade");
      } else{
      System.out.println("Voce é maior de idade");
    }


  }

}
