package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class CalculadoraSalario {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    System.out.println("Qual o valor da hora?");
    double valorHora = scanner.nextDouble();
    System.out.println("Quantas horas voce trabalhou?");
    double horas = scanner.nextDouble();

    double salario = calcularSalario(valorHora, horas);
    System.out.println(salario);




  }

  public static double calcularSalario(double valorHora, double horas){
    double salario = valorHora * horas;
    return salario;

  }
}
