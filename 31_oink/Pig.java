/***
 * Aliens jogging rowdily :: Ameer Alnasser, Ryan Lau, Jefford Shau
 * APCS
 * HW31 -- Pig Latin foundation
 * 2021-11-04
 * time spent: .75hrs
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

/**
DISCO:
If call function in other function, even though one function may return, you still need to write return. I had an issue with isAVowel() due to this.

QCC:
NA
**/ 

public class Pig{
  //Q: How does this initialization make your life easier?
  //With this initialization, it is now easier to check if each letter in a word is a vowel which is used for the first letter in a Pig Latin translator.
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter ) 
  {
  for(int counter=0; counter<w.length();counter++){
if(w.substring(counter,counter+1).equals(letter)){
return true;
}
}
return false;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter ) 
  {
return hasA(VOWELS,letter);
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w ) 
  
  {
  int vowelamnt=0;
for(int counter=0; counter<w.length();counter++){
if(hasA(VOWELS,w.substring(counter,counter+1))==true){
vowelamnt+=1;
  }
}
return vowelamnt;
}
  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) 
  {

if (countVowels(w)>0){
return true;

  }
else{
return false;
}
}

  


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w ) 
  {
    String output="";
for(int counter=0; counter<w.length();counter++){
if(hasA(VOWELS,w.substring(counter,counter+1))==true){
output+=w.substring(counter,counter+1);
  }
}
return output;
}

  public static void main( String[] args ) 
  {
  System.out.println(hasA("cat","a"));
  System.out.println(allVowels("meatball"));
  System.out.println(countVowels("monkeyballs"));
  

  }//end main()

}//end class Pig
