/**
   Clyde "Thluffy" Sinclair
   APCS pd0
   HW18 -- building a more meaningful class
   2021-10-18

   instance variables for storing...
   account holder's full name
   account password
   4-digit PIN
   9-digit account number
   account balance

   and methods for...
   setting each attribute
   printing out all of an account’s info at once
   depositing money
   withdrawing money
**/

public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    if (newPin > 1000 && newPin < 9999) {
    short oldPin = pin;
    pin = newPin;
    return oldPin;
  }
    else{
    pin=9999;
    System.out.println("Pin out of limits. Automatically set to 9999")  ;
    }
  }

  public int setAcctNum( int newAcctNum ) {
  if (newAcctNum > 100000000 && newAcctNum < 999999999) {
    int oldAcctNum = acctNum;
    acctNum = newAcctNum;
    return oldAcctNum;
  } else {
    acctNum=999999999;
    System.out.println("Error: Account number outside of interval. Automatically set to 999999999")
  }

  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public boolean withdraw( double withdrawAmount ) {
    if (withdrawAmount <= balance){
      balance=balance-withdrawAmount;
      return true;
    }
    else{
      System.out.println("Not enough money in balance")
      return false;
    }
  }
public boolean authenticate(int acctNum1, String password1){

if (acctNum1==acctNum && password1==passwd){
  return true;
else{
  return false
}
}

  //overwritten toString()
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


  //main method for testing
  public static void main( String[] args ) {

    BankAccount ba = new BankAccount();
    ba.setAcctNum(293014650);
    ba.setBalance(1000);
    ba.deposit(500);
    System.out.println(ba.balance);
    ba.withdraw(300);
    ba.setName("Ameer");
    ba.setPin((short) 4324);
    ba.setPasswd("AJR4521");

    System.out.println(ba.toString());
  }//end main()

}//end class BankAccount
