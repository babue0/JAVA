import java.util.Locale;
import java.util.Scanner;

public class cobrancaTelefonica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Locale.setDefault(Locale.US);

    int min = sc.nextInt();

    double conta = 50.0;

    if (min > 100){
      conta = conta + (min - 100) * 2.0;
    }

    System.out.printf("Conta = R$ %.2f", conta);


  }
}
