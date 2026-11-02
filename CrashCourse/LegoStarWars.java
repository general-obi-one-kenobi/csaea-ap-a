public class LegoStarWars {
    private String name;
    private int idNumber;
    private int numberOfSales;
    private int pieceCount;
    private double price;
    private boolean retired;

    public LegoStarWars(String name, int idNumber, int pieceCount, double price, boolean retired) {
        this.name = name;
        this.idNumber = idNumber;
        this.pieceCount = pieceCount;
        this.price = price;
        this.numberOfSales = 0;
        this.retired = retired;
    }

    public void sell() {
        numberOfSales++;
    }

    public String isRetired() {
        return "Retired: " + this.retired;
        }

    public void raisePrice(double amount) {
        price += amount;
    }

    public String toString() {
        return "Name: " + name + "\nID Number: " + idNumber + "\nPiece Count: " + pieceCount + "\nPrice: $" + price + "\nNumber of Sales: " + numberOfSales + "\nRetired: " + retired;
    }

    public String getName() {
        if (isUCS()) {
            return name.substring(0, name.indexOf("UCS")) + " " + name.substring((name.indexOf(" UCS") + 4));
        }
        else {
            return name;
        }
    }

    public String compareNames(LegoStarWars other) {
        return "Same name: " + this.getName().equals(other.getName());
    }


    public String compareIdNumbers(LegoStarWars other) {
        return "Same ID Number: " + (this.idNumber == other.idNumber);
    }

    public String comparePieceCounts(LegoStarWars other) {
        return "Same Piece Count: " + (this.pieceCount == other.pieceCount);
    }

    public String comparePrice(LegoStarWars other) {
        return "Same Price: " + (this.price == other.price);
    }

    public boolean isUCS() {
        return (this.name.indexOf("UCS") != -1);
}
}