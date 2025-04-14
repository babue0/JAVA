package academy.devdojo.maratonajava;

import java.util.Scanner;

public class DiaSemana {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Dia útil ou final de semana:");
    System.out.println("Qual o dia da semana(1-7)?");
    int dia = scanner.nextByte();

    switch (dia){
      case 1:
      case 7:
        System.out.println("Final de semana");
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
        System.out.println("Dia útil");
    }

    switch (dia){
      case 1:
        System.out.println("Segunda-feira");
        break;
      case 2:
        System.out.println("Terca-feira");
        break;
      case 3:
        System.out.println("Quarta-feira");
        break;
      case 4:
        System.out.println("Quinta-feira");
        break;
      case 5:
        System.out.println("Sexta-feira");
        break;
      case 6:
        System.out.println("Sabado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Dia da semana inválido");
        break;
    }
  }
}
