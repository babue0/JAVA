package academy.devdojo.maratonajava.introducao;

public class Estudante {
  public String nome;
  public int anoFormatura;
  public double media;


  public Estudante(String nome, int anoFormatura, double media){
    this.nome = nome;
    this.anoFormatura = anoFormatura;
    this.media = media;
  }

  public void setAnoFormatura(int anoFormatura) {
    this.anoFormatura = anoFormatura;
  }
}
