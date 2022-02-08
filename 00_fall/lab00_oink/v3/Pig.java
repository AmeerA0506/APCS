// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// L00: Etterbay Odingcay Oughthray Ollaborationcay
// 2021-11-09
// time spent: 0.5 hrs

/*
DISCOVERIES
    0. We can use String.toLowerCase() and String.toUpperCase() to make a String lowercased/uppercased

UNRESOLVED QUESTIONS
    0. Are we allowed to modify final variables in future versions?
        ex: VOWELS to AaEeIiOoUuYy
    1. How do we know if a y in a string is a vowel?
    2. How do we handle cases where there are multiple consonants in a word?
    2. How do we handle punctuation in the middle of a word?

TODO
    - [X] Feed Pig
    - [X] Debug Thluffy's translator
    - [X] Add new methods from library to Pig
    - [X] Implement support for basic words
    - [X] Use Scanner to read from in.words
    - [X] Implement support for phrases
    - [X] Implement support for capitalization
    - [ ] Implement support for y
    - [ ] Implement support for multiple consonants at beginning of word
    - [ ] Implement support for punctuation

NEW IN v3
    - Implement support for capitalization
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

import java.util.Scanner;

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

          while (w.indexOf(" ") != -1) {
              String word = w.substring(0, w.indexOf(" "));
              boolean capitalize = false;
              String translatedWord;

              if (isUpperCase(word.substring(0, 1))) {
                  capitalize = true;
              }

              // retain any capitalization in middle of the word
              word = (word.substring(0, 1)).toLowerCase() + word.substring(1);

              if ( beginsWithVowel(word) )
                  translatedWord = word + "way ";
              else {
                  int vPos = word.indexOf( firstVowel(word) );
                  translatedWord = word.substring(vPos) + word.substring(0,vPos) + "ay ";
              }

              if (capitalize) {
                  ans += (translatedWord.substring(0, 1)).toUpperCase() + translatedWord.substring(1);
              } else {
                  ans += translatedWord;
              }

              w = w.substring(w.indexOf(" ") + 1);
          }

          boolean capitalize = false;
          String translatedWord;

          if (isUpperCase(w.substring(0, 1))) {
              capitalize = true;
          }

          // retain any capitalization in middle of the word
          w = (w.substring(0, 1)).toLowerCase() + w.substring(1);

          if ( beginsWithVowel(w) )
              translatedWord = w + "way ";
          else {
              int vPos = w.indexOf( firstVowel(w) );
              translatedWord = w.substring(vPos) + w.substring(0,vPos) + "ay ";
          }

          if (capitalize) {
              ans += (translatedWord.substring(0, 1)).toUpperCase() + translatedWord.substring(1);
          } else {
              ans += translatedWord;
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
      Scanner sc = new Scanner(System.in);

      while (sc.hasNextLine()) {
          String line = sc.nextLine();
          String translatedLine = engToPig(line);
          System.out.println(line + " -> " + translatedLine);
      }
  }
}
