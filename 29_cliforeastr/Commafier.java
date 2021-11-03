/** 
TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
APCS
HW29 -- Which Way Do You Roll?
2021-11-01
 time spent: 0.5 hrs
**/
/**
DISCO
    0. We decided a for loop was more suitable than a while loop for the iteration part of this problem.
    1. It is possible to convert an int by adding a empty string to it.
QCC
    0. What is the difference between Integer.parseInt(arg) and (int)arg?
**/

public class Commafier {


    public static String commafyF(int n) {
        String nString = "" + n;
        String commaedN = "";

        for (int i = nString.length(); i > 3; i-=3) {
            // add the last three "places" of nString following a comma to the beginning of commaedN
            commaedN = "," + nString.substring(i - 3) + commaedN;
            // remove the last three "places" of nString from nString
            nString = nString.substring(0, i - 3);
        }
        // add whatever is left in nString to commaedN and return it
        return nString + commaedN;
    }


    public static String commafyR(int n) {
        if (n < 1000) {
            return "" + n;
        }

        String nString = "" + n;
        int newN = Integer.parseInt(nString.substring(0, nString.length() - 3));

        return commafyR(newN) + "," + nString.substring(nString.length() - 3);
    }
      public static void main(String[] args) {
        /*
        System.out.println(commafyF(1));
        System.out.println(commafyF(10));
        System.out.println(commafyF(101));
        System.out.println(commafyF(1000));
        System.out.println(commafyF(12345));
        System.out.println(commafyR(1));
        System.out.println(commafyR(10));
        System.out.println(commafyR(101));
        System.out.println(commafyR(1000));
        System.out.println(commafyR(12345));
        */

        for (String arg : args) {
            System.out.println("commafyF(" + arg + ") -> " + commafyF(Integer.parseInt(arg)));
            System.out.println("commafyR(" + arg + ") -> " + commafyR(Integer.parseInt(arg)));
        }
    }
}
