package Likedin.curso;

public class Array {
  public static void main(String[] args) {

    int[] idade = new int[3];
    idade[0] = 10;
    idade[1] = 20;
    idade[2] = 30;

    int[] idade2 = {14,13,16};

    for (int i = 0; i < idade.length; i++) {
      System.out.println(idade[i]);

    }

    for(int i : idade2){
      System.out.println(i);
    }






    int [][] dias = new int[3][];

    dias[0] = new int[3];
    dias[1] = new int[2];
    dias[2] = new int[1];

    dias[0][0] = 31;
    dias[0][1] = 28;
    dias[0][2] = 31;

    dias[1][0] = 30;
    dias[1][1] = 31;


    dias[2][0] = 31;



    for (int i = 0; i < dias.length; i++) {
      for (int j = 0; j < dias[i].length; j++) {
        System.out.println(dias[i][j]);

      }
    }

  }
}


