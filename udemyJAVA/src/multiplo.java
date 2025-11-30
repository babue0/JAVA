import java.util.Scanner;

public class multiplo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    if (A % B == 0 || B % A == 0) {
      System.out.println("Multiplo");
    }
    else{
      System.out.println("nao Multiplo");
    }
  }
}
