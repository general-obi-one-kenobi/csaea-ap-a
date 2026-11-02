public class LegoStarWarsTester {
    public static void main(String[] args) {
        LegoStarWars set1 = new LegoStarWars("Millennium Falcon UCS", 75192, 7541, 799.99, true);
        LegoStarWars set2 = new LegoStarWars("Death Star", 10188, 4016, 499.99, false);
        LegoStarWars set3 = new LegoStarWars("Boba Fett's Slave I UCS", 75060, 1996, 199.99, true);
        LegoStarWars set4 = new LegoStarWars("UCS Millennium Falcon", 10179, 5197, 499.99, true);
        LegoStarWars set5 = new LegoStarWars("UCS Millennium Falcon", 75192, 7541, 799.99, true);

        System.out.println(set1.toString());
        System.out.println(set2.toString());
        System.out.println(set3.toString());
        System.out.println(set4.toString());
        System.out.println(set5.toString());
        System.out.println("Expected output: true Actual output: " + set1.compareNames(set4));
        System.out.println("Expected output: false Actual output: " + set1.compareIdNumbers(set4));
        System.out.println("Expected output: false Actual output: " + set1.comparePieceCounts(set4));
        System.out.println("Expected output: true Actual output: " + set1.comparePieceCounts(set5));
        System.out.println("Expected output: false Actual output: " + set1.comparePrice(set4));
        System.out.println("Expected output: true Actual output: " + set1.comparePrice(set5));
        System.out.println("Expected output: Retired: true Actual output: " + set1.isRetired());
        System.out.println("Expected output: Retired: false Actual output: " + set2.isRetired());
        System.out.println("Expected output: Retired: true Actual output: " + set3.isRetired());
        System.out.println("Expected output: Retired: true Actual output: " + set4.isRetired());
        System.out.println("Expected output: Retired: true Actual output: " + set5.isRetired());
        System.out.println("Expected output: true Actual output: " + set1.isUCS());
        System.out.println("Expected output: false Actual output: " + set2.isUCS());
        System.out.println("Expected output: true Actual output: " + set3.isUCS());
        System.out.println("Expected output: true Actual output: " + set4.isUCS());
        System.out.println("Expected output: true Actual output: " + set5.isUCS());
    }
}