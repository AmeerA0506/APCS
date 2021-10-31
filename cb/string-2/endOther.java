/**
Ameer Alnasser
APCS
HW28::PPMP
2021-10-28
time taken:1hr
**/
// https://codingbat.com/prob/p126880

public class endOther {

    /**
     * Given two strings, return true if either of the strings appears at the
     * very end of the other string, ignoring upper/lower case differences (in
     * other words, the computation should not be "case sensitive"). Note:
     * str.toLowerCase() returns the lowercase version of a string.
     */
    public static boolean endOther(String a, String b) {
      int x=a.length();
      int y=b.length();
      a= a.toLowerCase();
      b= b.toLowerCase();
    if (x<y){
      if (b.substring(b.length()-a.length(),b.length()).equals(a)){
        return true;
      }
    }
    else if(y<x){
      if (a.substring(a.length()-b.length(),a.length()).equals(b)){
        return true;
    }
  }
    else{
      if (a.equals(b)){
        return true;
      }

    }

    return false;

  }
    public static void main(String[] args) {
        System.out.println(endOther("Hiabc", "abc")); // true
        System.out.println(endOther("AbC", "HiaBc")); // true
        System.out.println(endOther("abc", "abXabc")); // true
    }

}
