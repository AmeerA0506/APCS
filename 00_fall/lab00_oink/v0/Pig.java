// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// L00: Etterbay Odingcay Oughthray Ollaborationcay
// 2021-11-08
// time spent: 0.5 hrs

/*
DISCOVERIES
    0. isAVowel() had to be modified so that uppercased vowels would return true

UNRESOLVED QUESTIONS
    0. Are we allowed to modify final variables in future versions?
        ex: VOWELS to AaEeIiOoUuYy
    1. How do we implement the DemoScanner to take in lines from in.words?
    2. How do we know if a y in a string is a vowel?
    3. What constitutes a word as having multiple consonants at the beginning of the word?

TODO
    - [X] Feed Pig
    - [X] Debug Thluffy's translator
    - [X] Add new methods from library to Pig
    - [X] Implement support for basic words
    - [ ] Implement support for y
    - [ ] Implement support for multiple consonants at beginning of word
    - [ ] Implement support for capitalization
    - [ ] Implement support for punctuation
    - [ ] Use Scanner to read from in.words
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
      private static final String VOWELS = "aeiouy";
      private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
      private static final String PUNCS = ".,:;!?";

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
          letter = letter.toLowerCase();
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

      /**
        String firstVowel(String) -- returns first vowel in a String
        pre:  w != null
        post: firstVowel("") --> ""
        firstVowel("zzz") --> ""
        firstVowel("meatball") --> "e"
        **/
      public static String firstVowel( String w ) {

          String ans = "";

          if ( hasAVowel(w) ) //Q: Why this necess?
              ans = allVowels(w).substring(0,1);

          return ans;
      }

      /**
        boolean beginsWithVowel(String) -- tells whether a String begins with a vowel
        pre:  w != null and w.length() > 0
        post: beginsWithVowel("apple")  --> true
        beginsWithVowel("strong") --> false
        **/
      public static boolean beginsWithVowel( String w ) {
          return isAVowel( w.substring(0,1) );
      }


      /**
        String engToPig(String) -- converts an English word to Pig Latin
        pre:  w.length() > 0
        post: engToPig("apple")  --> "appleway"
        engToPig("strong") --> "ongstray"
        engToPig("java")   --> "avajay"
        **/
      public static String engToPig( String w ) {

          String ans = "";

          if ( beginsWithVowel(w) )
              ans = w + "way";

          else {
              int vPos = w.indexOf( firstVowel(w) );
              ans = w.substring(vPos) + w.substring(0,vPos) + "ay";
          }

          return ans;
      }

      /*=====================================
        boolean isPunc(String) -- tells whether a character is punctuation
        pre:  symbol.length() == 1
        post: isPunc(".") -> true
        isPunc("b") -> false
        =====================================*/
      public static boolean isPunc( String symbol ) {
          return PUNCS.indexOf( symbol ) != -1;
      }

      /*=====================================
        boolean isUpperCase(String) -- tells whether a letter is uppercase
        pre:  letter.length() == 1
        post: isUpperCase("a") -> false
        isUpperCase("A") -> true
        =====================================*/
      public static boolean isUpperCase( String letter ) {
          return CAPS.indexOf(letter) != -1;
      }

      /*=====================================
        boolean hasPunc(String) -- tells whether a String contains punctuation
        pre:  w != null
        post: hasPunc(“cat.”) -> true
        hasPunc(“cat”) -> false
        =====================================*/
      public static boolean hasPunc( String w ) {
          for (int i = 0; i < w.length(); i++) {
              if (isPunc(w.substring(i, i+1))) {
                  return true;
              }
          }
          return false;
      }

      /*=====================================
        boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
        pre:  w != null and w.length() > 0
        post: beginsWithUpper("Apple") -> true
        beginsWithUpper("apple") -> false
        =====================================*/
      public static boolean beginsWithUpper( String w ) {
          return isUpperCase(w.substring(0,1) );
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
      System.out.println("isAVowel(\"A\") -> " + isAVowel("A"));
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
      System.out.println();

      System.out.println("firstVowel(\"lol\") -> " + firstVowel("lol"));
      System.out.println("firstVowel(\"my name is jeff\") -> " + firstVowel("my name is jeff"));
      System.out.println("firstVowel(\"xyz\") -> " + firstVowel("xyz"));
      System.out.println("firstVowel(\"\") -> " + firstVowel(""));
      System.out.println();

      System.out.println("beginsWithVowel(\"ameer\") -> " + beginsWithVowel("ameer"));
      System.out.println("beginsWithVowel(\"Ameer\") -> " + beginsWithVowel("Ameer"));
      System.out.println("beginsWithVowel(\"lol\") -> " + beginsWithVowel("lol"));
      System.out.println();

      System.out.println("engToPig(\"apple\") -> " + engToPig("apple"));
      System.out.println("engToPig(\"strong\") -> " + engToPig("strong"));
      System.out.println("engToPig(\"java\") -> " + engToPig("java"));
      System.out.println();

      System.out.println("isPunc(\".\") -> " + isPunc("."));
      System.out.println("isPunc(\"b\") -> " + isPunc("b"));
      System.out.println();

      System.out.println("isUpperCase(\"x\") -> " + isUpperCase("x"));
      System.out.println("isUpperCase(\"X\") -> " + isUpperCase("X"));
      System.out.println();

      System.out.println("hasPunc(\"hello world!\") -> " + hasPunc("hello world!"));
      System.out.println("hasPunc(\"hello, world\") -> " + hasPunc("hello, world"));
      System.out.println("hasPunc(\"hello world\") -> " + hasPunc("hello world"));
      System.out.println("hasPunc(\"\") -> " + hasPunc(""));
      System.out.println();

      System.out.println("beginsWithUpper(\"Ameer\") -> " + beginsWithUpper("Ameer"));
      System.out.println("beginsWithUpper(\"ameer\") -> " + beginsWithUpper("ameer"));
  }//end main()
}//end class Pig
