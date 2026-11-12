import java.util.Scanner;

/* Creates a new public class called UserStory and stores Book information by using 1D arrays */
public class UserStory extends Book{
  private String[] titles;
  private String[] authors;
  private int[] years;
  private double[] ratings;

/* No-argument constructor and stores the book titles, authors, publication years, and average ratings in 1D arrays 
Reads book titles, authors, publication years, and average ratings from four text files and stores them in corressponding 1D arrays */
  public UserStory() {
    titles = FileReader.toStringArray("BookName.txt");
    authors = FileReader.toStringArray("Author.txt");
    years = FileReader.toIntArray("PublishingYear.txt");
    ratings = FileReader.toDoubleArray("AverageRating.txt");
  }  

/* Parameterized constructor that intializes the UserStory object using the titles, authors, years, and ratings arrays 
Assigns the provided arrays to the instance variables to intialize the dataset */
  public UserStory(String[] t, String[] a, int[] y, double[] r) {
    titles = t;
    authors = a;
    years = y;
    ratings = r;
  }

/* Finds the index of the highest-rated book published in the chosen year while iterating through the publican years array
Precondition: All arrays have matching lengths
Postcondition: Returns the best index */
public int bestBook(int year) {
  int bestIndex = -1;
  double highestRating = -1;

for (int i = 0; i < years.length; i++) {
  if (years[i] == year) {
    if(ratings[i] > highestRating) {
      highestRating = ratings[i];
      bestIndex = i;
    }
  }
}
return bestIndex;
}

/* Finds and returns the title, author, publication year, and average rating of the highest-rated book for a given year
Precondition: The arrays have matching lengths
Postcondition: Returns the book's information or a message if no books were found for that year */
  public Book findBestBook(int year) {
  int index = bestBook(year);
  if (index == -1) {
    return null;
  }
  return new Book(titles[index], authors[index], years[index], ratings[index]);
}
}