
/**
Ameer Alnasser
APCS
HW28::PPMP
2021-10-28
time taken:1hr
**/

public class DancingQueen{
    public static void main(String[] args) {
        System.out.println(makeAbba("Hi", "Bye")); // "HiByeByeHi"
        System.out.println(makeAbba("Yo", "Alice")); // "YoAliceAliceYo"
        System.out.println(makeAbba("What", "Up")); // "WhatUpUpWhat"
    }

    /**
     * Given two strings, a and b, return the result of putting them together in
     * the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
     */
    public static String makeAbba(String a, String b) {
        String output="";
        output+=a;
        output+=b;
        output+=b;
        output+=a;
        return output;

}
}
