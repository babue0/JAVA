package Section11.Enum.EX2.app;

import Section11.Enum.EX2.entities.Comment;
import Section11.Enum.EX2.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) throws ParseException {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comment c1 = new Comment("Have na nice trip!");
    Comment c2 = new Comment("Woww!");
    Post p1 = new Post(
            sdf.parse("21/06/2018 13:05:44"),
            "Traveling to Brazil",
            "Going to visit this country",
            12);

    p1.addComment(c1);
    p1.addComment(c2);

    System.out.println(p1);



  }
}
