package IntroPOO.Exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Student student = new Student();

    student.name = sc.nextLine();
    student.grade1 = sc.nextDouble();
    student.grade2 = sc.nextDouble();
    student.grade3 = sc.nextDouble();

    System.out.println("Final Grade = " + student.finalGrade());
    if (student.missingPoints() != 0){
      System.out.println("Failed");
      System.out.println("Missing points : " + student.missingPoints());
    }
    else{
      System.out.println("Pass");
    }
    sc.close();
  }
}
