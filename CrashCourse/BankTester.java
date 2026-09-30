// Tester class that creates and updates bank accounts
public class BankTester {
   public static void main(String[] args) {
      // write code to create two BankAccount objects:
	BankAccount alex = new BankAccount("Alex",100.0); // one for "Alex" with $100
	BankAccount jamie = new BankAccount("Jamie",250.0); // one for "Jamie" with $250
	alex.deposit(50.0); // deposit $50 into Alex’s account
	alex.printInfo();
	jamie.printInfo(); // print both accounts’ information
   }
}
