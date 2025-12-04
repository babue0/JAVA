package IntroPOO.Exercicio2;

public class Empregados {
  public String nome;
  public double salarioBruto;
  public double Taxa;

  public double netSalary(){
    return salarioBruto - Taxa;
  }

  public void increaseSalary(double percentage){
    salarioBruto += salarioBruto * percentage / 100;
  }

  public String toString() {
    return nome + ", $ " + String.format("%.2f", netSalary());
  }
}
