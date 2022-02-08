// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
// 2021-11-03
// time spent: 0.5 hrs

/*
DISCOVERIES
    0. We were efficient by calling the other methods. We did not have to repeat unneccesary code twice.
    1. We incorporated the built-in Java method indexOf() in our hasA method.
UNRESOLVED QUESTIONS
    0. Where is the translator method?
    1. How will this code help us with our pig latin translator?
*/

/***
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(o_o)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    return w.indexOf(letter) >= 0;
  }


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
      for (int i = 0; i < VOWELS.length(); i++) {
          if (VOWELS.substring(i, i + 1).equals(letter)) {
              return true;
          }
      }

      return false;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
      int count = 0;
      for (int i = 0; i < w.length(); i++) {
          if (isAVowel(w.substring(i, i + 1))) {
              count++;
          }
      }

      return count;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
      if (countVowels(w) > 0) {
          return true;
      }

      return false;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
      String vowels = "";

      for (int i = 0; i < w.length(); i++) {
          if (isAVowel(w.substring(i, i + 1))) {
              vowels += w.substring(i, i + 1);
          }
      }

      return vowels;
  }

  public static void main( String[] args )
  {
      System.out.println("hasA(\"lol\", \"l\") -> " +  hasA("lol", "l"));
      System.out.println("hasA(\"lol\", \"r\") -> " +  hasA("lol", "r"));
      System.out.println();

      System.out.println("isAVowel(\"a\") -> " + isAVowel("a"));
      System.out.println("isAVowel(\"e\") -> " + isAVowel("e"));
      System.out.println("isAVowel(\"i\") -> " + isAVowel("i"));
      System.out.println("isAVowel(\"o\") -> " + isAVowel("o"));
      System.out.println("isAVowel(\"u\") -> " + isAVowel("u"));
      System.out.println("isAVowel(\"x\") -> " + isAVowel("x"));
      System.out.println();

      System.out.println("countVowels(\"lol\") -> " + countVowels("lol"));
      System.out.println("countVowels(\"my name is jeff\") -> " + countVowels("my name is jeff"));
      System.out.println("countVowels(\"xyz\") -> " + countVowels("xyz"));
      System.out.println("countVowels(\"\") -> " + countVowels(""));
      System.out.println();

      System.out.println("hasAVowel(\"lol\") -> " + hasAVowel("lol"));
      System.out.println("hasAVowel(\"my name is jeff\") -> " + hasAVowel("my name is jeff"));
      System.out.println("hasAVowel(\"xyz\") -> " + hasAVowel("xyz"));
      System.out.println("hasAVowel(\"\") -> " + hasAVowel(""));
      System.out.println();

      System.out.println("allVowels(\"lol\") -> " + allVowels("lol"));
      System.out.println("allVowels(\"my name is jeff\") -> " + allVowels("my name is jeff"));
      System.out.println("allVowels(\"xyz\") -> " + allVowels("xyz"));
      System.out.println("allVowels(\"\") -> " + allVowels(""));
  }//end main()
}//end class Pig
