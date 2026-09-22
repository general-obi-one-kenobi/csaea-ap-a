//package CrashCourse;

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
    private int reportCount;

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

        public void dislikeSong() {
        dislikes += 1;
        dislikedByYou = true;
        if (likedByYou = true) {
            likes -= 1;
            likedByYou = false;
        }
    }

    public void remix() {
        remixCount += 1;
        System.out.println("Song remixed!");
    }

    public void share() {
        shareCount += 1;
        System.out.println("Song shared!");
    }

    public void writeReview(String userReview) {
        System.out.println("New review: " + userReview);
    }

    public void reportSong() {
        reportCount += 1;
        System.out.println("Song reported!");
        if (reportCount >= 1) {
            isExplicit = true;
        }
    }

    public void viewInfo() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Length: " + length + " minutes");
        System.out.println("Number of Plays: " + numberOfPlays);
        System.out.println("Explicit: " + isExplicit);
        System.out.println("Number of Likes: " + likes);
        System.out.println("Number of Dislikes: " + dislikes);
        System.out.println("Number of Shares: " + shareCount);
        System.out.println("Number of Remixes: " + remixCount);
    }





    
}
