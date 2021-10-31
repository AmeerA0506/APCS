/**
Ameer Alnasser
APCS
HW28::PPMP
2021-10-28
time taken:1hr
**/

// https://codingbat.com/prob/p111624

public class meowbark {


    /**
     * Return true if the string "cat" and "dog" appear the same number of times
     * in the given string.
     */
    public static boolean catDog(String str) {
          int meow=0;
          int bark=0;
           for (int counter=0; counter < (str.length()-2); counter++) {
            if (str.substring(counter,(counter+3)).equals("cat")){
              meow +=1;
            }
            else if (str.substring(counter,(counter+3)).equals("dog")){
              bark +=1;
            }
          }
            if (meow==bark){
              return true;
            }
            else{
              return false;
            }
            }


public static void main(String[] args) {
    System.out.println(catDog("catdog")); // true
    System.out.println(catDog("catcat")); // false
    System.out.println(catDog("1cat1cadodog")); // true
}
}
