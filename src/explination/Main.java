package explination;

import java.util.List;

public class Main {

  public static void main(String[] args) {
    
    var list = List.of(3,50,9,21,56,11);
    
    list
        .stream()
        .filter(n -> n % 5 == 0)
        .forEach(System.out::println);
    System.out.println();
    list.forEach(System.out::println);
  }

}
