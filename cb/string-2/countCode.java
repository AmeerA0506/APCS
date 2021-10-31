/**
Ameer Alnasser
APCS
HW28::PPMP
2021-10-28
time taken:1hr
**/
// https://codingbat.com/prob/p123614

public class countCode {

    /**
     * Return the number of times that the string "code" appears anywhere in the
     * given string, except we'll accept any letter for the 'd', so "cope" and
     * "cooe" count.
     */
    public static int countCode(String str) {
      int code=0;
      for (int counter=0; counter < (str.length()-3); counter++) {
        if (str.substring(counter,(counter+2)).equals("co")){
          if (str.substring(counter+3,counter+4).equals("e")){
            code +=1;

          }
    }
}
return code;

}
public static void main(String[] args) {
    System.out.println(countCode("aaacodebbb")); // 1
    System.out.println(countCode("codexxcode")); // 2
    System.out.println(countCode("cozexxcope")); // 2
}

    }
