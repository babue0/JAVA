package Section10.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ex1 {
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("Jose");
    list.add("Bob");
    list.add("JOa");
    list.add("Ian");
    list.add("Bernardo");

    list.add(2, "Alex");

    System.out.println(list.size());

    for (String x : list){
      System.out.println(x);
    }

    list.remove(5);
    list.removeIf(x -> x.charAt(0) == 'J');

    System.out.println("---------");

    for (String x : list){
      System.out.println(x);
    }

    System.out.println("---------");

    List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').toList();
    for (String x : result){
      System.out.println(x);
    }

    System.out.println("---------");

    String name = list.stream().filter(x -> x.charAt(0) == 'B').findFirst().orElse(null);
    System.out.println(name);

  }
}
