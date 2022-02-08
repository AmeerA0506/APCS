/**
Ameer Alnasser
APCS
HW28::PPMP
2021-10-28
time taken:1hr
**/
// https://codingbat.com/prob/p147448

public class Wave {

    /**
     * Return the number of times that the string "hi" appears anywhere in the
     * given string.
     */
    public static int countHi(String str) {
      int appear=0;
       for (int counter=0; counter < (str.length()-1); counter++) {
        if (str.substring(counter,(counter+2)).equals("hi")){
          appear +=1;
        }
        else{
          continue;
        }
        }
      return appear;
    }

public static void main(String[] args) {
    System.out.println(countHi("abc hi ho")); // 1
    System.out.println(countHi("ABChi hi")); // 2
    System.out.println(countHi("hihi")); // 2
}
}
