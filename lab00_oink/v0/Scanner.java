/**
Aliens Jogging Rapidly:: Ameer Alnasser, Ryan Lau, Jefford Shau
APCS
LAB00--Pig Latin translator 
2021-11-09
**/

import java.util.Scanner;  //Scanner is not part of java's std lib

public class DemoScanner {

  public static void main( String[] args ) {
    Pig scanner= new Pig();
    Scanner sc = new Scanner( System.in );

    while( sc.hasNext() ) {
      System.out.println( scanner.engToPig(sc.next() ));
    }

  }//end main()

}//end class DemoScanner
