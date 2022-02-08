/**
Ameer Alnasser
APCS
HW28::PPMP
2021-10-28
time taken:1hr
**/
// https://codingbat.com/prob/p165312

public class doubleChar {

    /**
     * Given a string, return a string where for every char in the original,
     * there are two chars.
     */
    public static String doubleChar(String str) {
      String output="";
      for (int counter=0;counter<str.length();counter+=1){
        output +=  str.substring(counter,(counter+1))+str.substring(counter,(counter+1));
}
return output;
}


    public static void main(String[] args) {
        System.out.println(doubleChar("The")); // "TThhee"
        System.out.println(doubleChar("AAbb")); // "AAAAbbbb"
        System.out.println(doubleChar("Hi-There")); // "HHii--TThheerree"
    }
}
