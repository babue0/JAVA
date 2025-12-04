package IntroPOO.Exercicio2;



import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Empregados emp = new Empregados();

    System.out.print("Name: ");
    emp.nome = sc.nextLine();
    System.out.print("Gross salary: ");
    emp.salarioBruto = sc.nextDouble();
    System.out.print("Tax: ");
    emp.Taxa = sc.nextDouble();
    System.out.println();
    System.out.println("Employee: " + emp);
    System.out.println();
    System.out.print("Which percentage to increase salary? ");
    double percentage = sc.nextDouble();
    emp.increaseSalary(percentage);
    System.out.println();
    System.out.println("Updated data: " + emp);

    System.out.println();





  }
}
