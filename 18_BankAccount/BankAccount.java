/*
AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
APCS
HW18 -- BankAccount
2021-10-14
*/

/*
DISCO:
We found out how to incorporate java.util.random into our code.
we can use both a default and overloaded constructor
QCC:
Team AJR's Latest and Greatest Q2 Response:
Because a constructor returns a instance of a class and because you can do:
ClassName <name> = new ClassName();
without any errors, it is safe to assume that there is already a constructor for all classes.

Team AJR's Latest and Greatest Q3 Response:
In order to test if Java can output a String representation of an object, we can add the line:
System.out.println(BankAccount.toString());
to the main() function. By doing so, we can see that it outputs "BankAccount@XXXXXXXX", meaning that Java has a way to output a String representation of an object. However, this string does not tell us about the instance variables involved, so it has limitations.

*/

import java.util.Random;

public class BankAccount {
	private String ownerFullName;
	private String password;
	private int PIN;
	private int acctNumber;
	private double acctBalance;

	public BankAccount() {
	    Random random = new Random();
	    ownerFullName = "Frist Lsat";
        password = "password";
	    PIN = 1234;
	    acctNumber = random.nextInt(100000000);
	}

	public BankAccount(String name, String pass, int pin) {
	    Random random = new Random();
	    ownerFullName = name;
        password = pass;
	    PIN = pin;
	    acctNumber = random.nextInt(1000000000);
	}

	public String setName(String newName) {
		ownerFullName = newName;
		return ownerFullName;
	}

	public String setPassword(String newPassword) {
		password = newPassword;
		return password;
	}

	public int setPin(int newPIN) {
		PIN = newPIN;
		return PIN;
	}

	public double checkBal() {
	    return acctBalance;
	}

	public String printInfo() {
	    return "owner full name: " + ownerFullName + "\npassword: " + password + "\npin: " + PIN + "\naccount number: " + acctNumber + "\nbalance: $" + acctBalance;
	}


	public double deposit(double amount) {
	    acctBalance = acctBalance + amount;
	    return acctBalance;
	}


	public double withdraw(double amount) {
	    acctBalance = acctBalance - amount;
	    return acctBalance;
	}

	public static void main(String[] args) {
	    BankAccount acc1 = new BankAccount();
	    String acc1Info = acc1.printInfo();
	    System.out.println(acc1Info);

	    BankAccount acc2 = new BankAccount("ameer alnasser", "@jR123", 5874);
	    String acc2Info = acc2.printInfo();
	    System.out.println(acc2Info);

	    acc2.deposit(1000000);
	    System.out.println(acc2.printInfo());

	}
}
