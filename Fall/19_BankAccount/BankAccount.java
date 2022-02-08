// TNPG: Aliens Jogging Rowdily (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW19 -- Mo Money Mo Problems ...MORE AWESOME
// 2021-10-18

/*
DISCOVERIES
    0. We are able to set parameter ranges for methods with if conditionals.
    1. A conditional does not work without parentheses around the boolean expression.
UNRESOLVED QUESTIONS
*/

public class BankAccount {
    // instance variables
    private String name;
    private String passwd;
    private short pin;
    private int acctNum;
    private double balance;
    // ---------------------------------------------

    // mutators
    public String setName(String newName) {
        String oldName = name;
        name = newName;
        return oldName;
    }

    public String setPasswd(String newPasswd) {
        String oldPasswd = passwd;
        passwd = newPasswd;
        return oldPasswd;
    }

    public short setPin(short newPin) {
        short oldPin = pin;
        if (newPin > 1000 && newPin < 9999) {
            pin = newPin;
            return oldPin;
        } else {
            pin = 9999;
            System.out.println("Pin out of limits. Automatically set to 9999");
            return oldPin;
        }
    }

    public int setAcctNum(int newAcctNum) {
        int oldAcctNum = acctNum;
        if (newAcctNum > 100000000 && newAcctNum < 999999999) {
            acctNum = newAcctNum;
            return oldAcctNum;
        } else {
            acctNum = 999999999;
            System.out.println("Error: Account number outside of interval. Automatically set to 999999999");
            return oldAcctNum;
        }

    }

    public double setBalance(double newBalance) {
        double oldBalance = balance;
        balance = newBalance;
        return oldBalance;
    }
    // ---------------------------------------------

    public void deposit(double depositAmount) {
        balance = balance + depositAmount;
    }

    public boolean withdraw(double withdrawAmount) {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            return true;
        } else {
            System.out.println("Not enough money in balance");
            return false;
        }
    }

    public boolean authenticate(int acctNum1, String password1) {
        if (acctNum1 == acctNum && password1 == passwd) {
            return true;
        } else {
            return false;
        }
    }

    // overwritten toString()
    public String toString() {
        String retStr = "\nAccount info:\n=======================";
        retStr = retStr + "\nName: " + name;
        retStr = retStr + "\nPassword: " + passwd;
        retStr = retStr + "\nPIN: " + pin;
        retStr = retStr + "\nAccount Number: " + acctNum;
        retStr = retStr + "\nBalance: " + balance;
        retStr = retStr + "\n=======================";
        return retStr;
    }

    // main method for testing
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAcctNum(293014650);
        ba.setBalance(1000);
        ba.deposit(500);
        ba.withdraw(300);
        ba.setName("Ameer");
        ba.setPin((short) 4324);
        ba.setPasswd("AJR4521");
        System.out.println(ba.toString() + "\n");

        System.out.println("test newly added conditionals:");
        ba.setAcctNum(100);
        ba.setPin((short) 100);
        ba.withdraw(2000);
        System.out.println(ba.toString() + "\n");

        System.out.println("test authenticate():");
        System.out.println(ba.authenticate(999999999, "password!"));
        System.out.println(ba.authenticate(999999999, "AJR4521"));
    } // end main()
} // end class BankAccount
