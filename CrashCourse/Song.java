package CrashCourse;

public class Song {
    private String title;
    private String artist;
    private int numberOfPlays;
    private double length;
    private int likes;
    private int dislikes;
    private boolean isExplicit;
    private int remixCount;
    private int shareCount;
    private boolean likedByYou;
    private boolean dislikedByYou;
    private String review;
    private int reportCount

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;

        numberOfPlays = 0;
        likes = 0;
        dislikes = 0;
        isExplicit = false;
        remixCount = 0;
        shareCount = 0;
        likedByYou = false;
        dislikedByYou = false;
    }

    public void playSong() {
        numberOfPlays += 1;
    }

    public void likeSong() {
        likes += 1;
        likedByYou = true;
        if (dislikedByYou = true) {
            dislikes -= 1;
            dislikedByYou = false;
        }
    }

        public void likeSong() {
        dislikes += 1;
        dislikedByYou = true;
        if (likedByYou = true) {
            likes -= 1;
            likedByYou = false;
        }
    }

    public void remix() {
        remixCount += 1;
    }

    public void share() {
        shareCount += 1;
    }

    public void writeReview(String userReview) {
        System.out.println("New review: " + userReview);
    }

    public void reportSong() {
        reportCount += 1;
        if (reportCount >= 10000) {
            isExplicit = true;
        }
    }



    
}
