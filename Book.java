import java.util.Scanner;

/* Creates a new public class named Book that represents a book and stores its title, author, publication year, and average rating */
public class Book {
  private String title;
  private String author;
  private int year;
  private double rating;

/* No-argument constructor creating a Book object with default values
Intializes the title and author to empty Strings and the publication year and rating to zero */
  public Book() {
    title = "";
    author = "";
    year = 0;
    rating = 0;
  }

/* Parameterized constructor creating a Book object using the title, author, year, and average rating data types
Assigns the provided title, author, publication year, and rating to the object's instance variables */
  public Book(String t, String a, int y, double r) {
    title = t;
    author = a;
    year = y;
    rating = r;
  }

/* Accessor method for title
Accesses and returns the private author instance variable */
  public String getTitle() {
    return title;
  }

/* Accessor method for author
Accesses and returns the private author instance variable */
  public String getAuthor() {
    return author;
  }

/* Accessor method returning publication year of the book 
Accesses and returns the private year instance variable */
  public int getYear() {
    return year;
  }

/* Accessor method returning average rating of the book 
Accesses and returns the private rating instance variable */
  public double getRating() {
    return rating;
  }
  
/* toString
Returns book information including the title, author, publication year, and average rating */
  public String toString() {
    return "Book Name: " + title + "\nAuthor: " + author + "\nPublication Year: " + year + "\nAverage Rating: " + rating;
  }
}