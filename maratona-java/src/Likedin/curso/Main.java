package Likedin.curso;

import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    Estudante estudante1 = new Estudante("Estudante1", 2027, 8.5);
    Estudante estudante2 = new Estudante("Estudante2", 2029, 7.5);

    Scanner scanner = new Scanner(System.in);

    estudante1.setAnoFormatura(2026);
    System.out.println(estudante1.anoFormatura);
    System.out.println(estudante2.anoFormatura);

  }
}
