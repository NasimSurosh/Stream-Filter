package exercise;

import java.util.List;
import java.util.function.Predicate;

class Book{
  String title;
  int year;
  public Book(String title, int year) {
    
    this.title = title;
    this.year = year;
  }
  public String getTitle() {
    return title;
  }
  public int getYear() {
    return year;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setYear(int year) {
    this.year = year;
  }
  @Override
  public String toString() {
    return "title = " + title + ", year = " + year;
  }
  
  
}

public class StreamFilterCountExercise {
  public static long filterAndCount(List<Book> books, Predicate<Book> predicate) {
    
    long count = books.stream().filter(predicate).count();
    return count;
    
  }

  public static void main(String[] args) {
    
    var listOfBooks = List.of(new Book("History", 2004), 
        new Book("History1",1950)
        ,new Book("History2",1986)
        ,new Book("History3",1999)
        ,new Book("History4",2001));
    listOfBooks.forEach(System.out::println);
  
    System.out.println();
    Predicate<Book> pre = c -> c.getYear() <= 2000;
    long result = filterAndCount(listOfBooks, pre);
    System.out.println("The result are: ("+ result + ") books");
    

  }

}
