import java.util.ArrayList;

public class MovieCollectionRunner
{
  public static void main(String arg[])
  {
    MovieCollection movies = new MovieCollection("src\\movies_data.csv");
//    ArrayList<Movie> movieList = movies.getMovies();
//    for (Movie movie : movieList)
//    {
//      System.out.println(movie);
//    }
    movies.menu();

  }
}