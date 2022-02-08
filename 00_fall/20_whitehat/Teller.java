// TNPG: Aliens Jogging Rowdily (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW20 -- External Audit
// 2021-10-19

/*
DISCOVERIES
    0. Withdrawal returns a string when it should return a boolean.
    1. Authenticate uses short PIN as parameter when it should use String password.
    2. All mutators return the new values when they should return the old values.
    3. The conditionals in setAcctNum and setPin do not work because they are missing a return statement.
    4. It is possible to withdraw money through the deposit function by depositing a negative amount of money.
    5. It is possible to deposit money through the withdraw function by withdrawing a negative amount of money.
UNRESOLVED QUESTIONS
    0.
*/

public class Teller{
    public static void main(String[] args) {
        // test if methods work as is
        BankAccount ba = new BankAccount();
        ba.setAcctNum(293014650);
        ba.setBalance(1000);
        ba.setName("Ameer");
        ba.setPin((short) 4324);
        ba.setPasswd("AJR4521");
        ba.deposit(500);
        ba.withdraw(300);
        System.out.println(ba.toString() + "\n");

        // test authenticate()
        System.out.println("test authenticate():");
        System.out.println(ba.authenticate(293014650, (short) 4324)); // true
        System.out.println(ba.authenticate(293014651, (short) 4324)); // false
        System.out.println(ba.authenticate(293014650, (short) 1000) + "\n"); // false

        // test conditionals
        System.out.println("test conditionals:");
        ba.setAcctNum(100);
        ba.setPin((short) 100);
        ba.withdraw(2000);

        System.out.println("\nactual account info:" + ba.toString() + "\n");
        System.out.println("expected account info:");
        System.out.println("Account info:\n=======================\nName: Ameer\nPassword: AJR4521\nPIN: 4324\nAccount Number: 293014650\nBalance: 1200.0\n=======================");

        // exploit deposit and withdraw functions
        ba.withdraw(-10000);
        ba.deposit(-1000);
        System.out.println(ba.toString() + "\n");
    }
}
