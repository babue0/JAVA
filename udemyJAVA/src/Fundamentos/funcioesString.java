package Fundamentos;

public class funcioesString {
  public static void main(String[] args) {

    String texto = "ASD asd asd   ";

    String min = texto.toLowerCase();
    String max = texto.toUpperCase();
    String trim = texto.trim();
    String sub = texto.substring(0,1);
    String replace = texto.replace("a", "C");
    int i = texto.indexOf("a");
    int j = texto.lastIndexOf("a");

    // split salva em vetores
    String[] split = texto.split(" ");
    String word1 = split[0];
    String word2 = split[1];
    String word3 = split[2];

    System.out.println(texto);
    System.out.println(min);
    System.out.println(max);
    System.out.println(trim);
    System.out.println(sub);
    System.out.println(replace);
    System.out.println(i);
    System.out.println(j);
    System.out.println(word1);
    System.out.println(word2);
    System.out.println(word3);


  }
}
