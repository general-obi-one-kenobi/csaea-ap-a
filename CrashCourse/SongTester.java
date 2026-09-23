public class SongTester {

    public static void main(String[] args) {

        Song hello = new Song("Hello","SeptembersRich feat. Yeat", 2.98);
        Song myron = new Song("Myron","Lil Uzi Vert",3.77);

        hello.reportSong();
        hello.viewInfo();
        myron.reportSong();
        myron.viewInfo();


    }

}