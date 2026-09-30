public class Movie {
   private String title;
   private int rating; // declare instance variables here
 
   public Movie(String title, int rating) {
this.title = title;
this.rating = rating; // write the constructor here
}
   public void printInfo() {
      System.out.println(title + " — Rating: " + rating);
   }
}
