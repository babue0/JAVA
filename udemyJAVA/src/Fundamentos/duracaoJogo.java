package Fundamentos;

import java.util.Scanner;

public class duracaoJogo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int j1 = sc.nextInt();
    int j2 = sc.nextInt();

    int duracao;
    if (j1 < j2){
      duracao = j2 - j1;
    }
    else{
      duracao = 24 - j1 + j2;
    }

    System.out.println("duracao = " + duracao);
  }
}
