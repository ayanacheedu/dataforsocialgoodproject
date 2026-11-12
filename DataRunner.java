import java.util.Scanner;

/* Creates a new public class called DataRunner */
public class DataRunner {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

/* Creates a dataset for UserStory */
  UserStory story = new UserStory();

/* Welcomes the user */
  System.out.println("Welcome to the Book Finder!");

/* Asks user to enter a publication year */
  System.out.println("Enter a publication year: ");
  int year = input.nextInt();

/* Finds and displays the title, author, and average rating of the highest-rated book for that specific year */
  Book b = story.findBestBook(year);
  if (b == null) {
    System.out.println("No books found for that year.");
  } else {
    System.out.println(b.toString());
    System.out.println("I reccomend checking out " + b.getTitle() + " by " + b.getAuthor() + "!");o
  }

/* Closes the Scanner */
  input.close();    
  }
}