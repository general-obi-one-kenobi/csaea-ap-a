/*
 * Song: blueprint for Song objects.
 * New method: toString()
 *
 * toString() returns a String that describes an object.
 * Header -- copy it exactly:   public String toString()
 * It RETURNS text. It does not print.
 */

public class Song {

    // ATTRIBUTES. intance variables . . . . hold DATA for each song instance

    private String title;
    private String artist;
    private int plays;

    // Constructor 

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;
        plays = 0;

    }
    
    // Methods. Behaviors 

    public void play() {
        plays++;
    }

    public int getPlays() {
        System.out.println(plays);
        return plays;
    }

    public String getStars() {
        String stars = "";
        for (int i = 1; i <= plays; i++) {
            stars = stars + "*";
        }
        if (plays == 1) {
            System.out.println("Rating: " + stars + " star");
        }
        else {
            System.out.println("Rating: " + stars + " stars");
        }
        return stars;
    }

    public String toString()
    {
        if (plays == 1) {
            return title + " by " + artist + " - " + plays + " play";
        }
        else {
            return title + " by " + artist + " - " + plays + " plays";
        }
    }

}
