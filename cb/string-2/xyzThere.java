/**
Ameer Alnasser
APCS
HW28::PPMP
2021-10-28
time taken:1hr
**/

// https://codingbat.com/prob/p136594

public class xyzThere {
  /**
   * Return true if the given string contains an appearance of "xyz" where the
   * xyz is not directly preceeded by a period (.). So "xxyz" counts but
   * "x.xyz" does not.
   */
public static boolean xyzThere(String str) {
  for (int counter=0; counter < (str.length()-2); counter++) {
   if (str.substring(counter,(counter+3)).equals("xyz")){
     if (counter!=0){
     if (str.substring(counter-1,counter).equals(".")){
       continue;
     }
     else{
       return true;
     }
     }
     else{
     return true;
   }
   }
   else{
     continue;
   }
}
return false;
}
  public static void main(String[] args) {
        System.out.println(xyzThere("abcxyz")); // true
        System.out.println(xyzThere("abc.xyz")); // false
        System.out.println(xyzThere("xyz.abc")); // true
    }
}
