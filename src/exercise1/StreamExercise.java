package exercise1;

import java.util.List;
import java.util.stream.Collectors;

class Person{
  String name;
  int oldYear;
  public Person(String name, int oldYear) {

    this.name = name;
    this.oldYear = oldYear;
  }
  public String getName() {
    return name;
  }
  public int getOldYear() {
    return oldYear;
  }

  @Override
  public String toString() {
    return "Name = " + name + ", oldYear = " + oldYear;
  }
  
}

public class StreamExercise {
  
  public static void processData(List<Person> persons) {
    List<Person> list = persons
        .stream()
        .filter(p -> p.getOldYear() <= 30)
        .collect(Collectors.toList());
    System.out.println("\nFiltered by age: ");
    list.forEach(System.out::println);
   
    List<String> listedTheRest = persons
        .stream()
        .filter(p -> p.getOldYear() >= 30)
        .map(Person::getName)
        .collect(Collectors.toList());
    
    System.out.println("\nMapped List: " + listedTheRest);
    
    
  }

  public static void main(String[] args) {
    
    var listOfPerson = List.of(new Person("Daya",34)
        ,new Person("Rahimovich",22)
        ,new Person("Maya",24)
        ,new Person("Rahyl",14)
        ,new Person("Karim",29)
        ,new Person("Dimetry",36)
        ,new Person("Joo",19));
    System.out.println("Original list: ");
    listOfPerson.forEach(System.out::println);
    
    processData(listOfPerson);

  }

}
