import java.io.*;
import java.math.*;
import java.net.*;
import java.nio.file.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.prefs.*;
import java.util.regex.*;
import java.util.stream.*;
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
Song maskedUp = new Song("masked up","Nettspend feat. NBA YoungBoy",2.28);
maskedUp.reportSong()
maskedUp.playSong()
maskedUp.likeSong()
maskedUp.likeSong()
maskedUp.dislikeSong()
maskedUp.remix()
maskedUp.share()
maskedUp.writeReview("This song takes a few listens to get used to")
maskedUp.viewInfo()
Song xtraKrazy = new Song("Xtra Krazy","SeptembersRich feat. Yeat",2.87);
xtraKrazy.reportSong()
xtraKrazy.playSong()
xtraKrazy.likeSong()
xtraKrazy.likeSong()
xtraKrazy.likeSong()
xtraKrazy.dislikeSong()
xtraKrazy.remix()
xtraKrazy.share()
xtraKrazy.writeReview("Yeat and SeptembersRich should get back together and make more songs")
xtraKrazy.viewInfo()
maskedUp.title
maskedUp.artist
maskedUp.numberOfPlays
maskedUp.length
xtraKrazy.title
xtraKrazy.artist
xtraKrazy.length
Song flawless = new Song("Flawless","Yeat feat. Lil Uzi Vert", 2.93);
flawless.reportSong()
flawless.title
flawless.artist
flawless.length
flawless.playSong()
flawless.likeSong()
flawless.likeSong()
flawless.dislikeSong()
flawless.dislikeSong()
flawless.remix()
flawless.remix()
flawless.share()
flawless.share()
flawless.share()
flawless.writeReview("Yeat and Uzi should make more songs together")
flawless.viewInfo()
Song newTurban = newSong("New turban","Yeat",2.8);
Song newTurban = new Song("New turban","Yeat",2.8);
newTurban.reportSong()
newTurban.title
newTurban.artist
newTurban.length
newTurban.playSong()
newTurban.playSong()
newTurban.playSong()
newTurban.playSong()
newTurban.playSong()
newTurban.playSong()
newTurban.playSong()
newTurban.likeSong()
newTurban.likeSong()
newTurban.likeSong()
newTurban.likeSong()
newTurban.likeSong()
newTurban.likeSong()
newTurban.dislikeSong()
newTurban.remix()
newTurban.remix()
newTurban.remix()
newTurban.remix()
newTurban.remix()
newTurban.remix()
newTurban.remix()
newTurban.remix()
newTurban.share()
newTurban.share()
newTurban.share()
newTurban.share()
newTurban.share()
newTurban.writeReview("this is prime Yeat")
newTurban.viewInfo()
Song outside = new Song("Outside","Yeat feat. Young Thug",3.85);
outside.reportSong()
outside.title
outside.artist
outside.length
outside.playSong()
outside.playSong()
outside.playSong()
outside.playSong()
outside.playSong()
outside.playSong()
outside.dislikeSong()
outside.dislikeSong()
outside.dislikeSong()
outside.dislikeSong()
outside.likeSong()
outside.likeSong()
outside.likeSong()
outside.remix()
outside.remix()
outside.remix()
outside.remix()
outside.remix()
outside.share()
outside.share()
outside.share()
outside.share()
outside.share()
outside.share()
outside.writeReview("Yeat and Young Thug should make more songs together")
outside.viewInfo()