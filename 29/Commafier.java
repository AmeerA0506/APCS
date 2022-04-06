/**
   Clyde Sinclair
   APCS
   HW29 -- CLI args, foreach, string parsing
   2021-11-03w
   time spent: .5hrs
**/

public class Commafier {

  /**
     String commafyR(int) -- inserts commas in a number, every 3rd digit,
     recursively.
     precondition:  n is non-negative integer
     postcondition: returns String version of n with commas inserted
  **/
  public static String commafyR( int n ) {

    //store String version of n
    String nAsStr = n + "";

    if (n < 1000)
      return nAsStr;
    else
      return commafyR( n/1000 ) + ","
        + nAsStr.substring( nAsStr.length() - 3 );
    //Q: why is (n%1000) insufficient after the comma?
  }


  /**
     String commafyF(int) -- inserts commas in a number, every 3rd digit,
     using a FOR Loop.
     precondition:  n is non-negative integer
     postcondition: returns String version of n with commas inserted
  **/
  public static String commafyF( int n ) {

    //store String version of n
    String nAsStr = n + "";

    //traverse String version of n fr R to L, inserting a comma 
    // at every 3rd position
    for( int pos = nAsStr.length()-3; pos > 0; pos-=3 ) {
      nAsStr = nAsStr.substring( 0 , pos ) + ","
        + nAsStr.substring( pos );
    }
    return nAsStr;
  }


  public static void main( String[] args ) {

    System.out.println();
    System.out.println( "Processing command-line args...");
    System.out.println("======================================");

    for( String s : args ) {
      int n = Integer.parseInt(s);
      System.out.println( "commafyR(" + n + "): \t" + commafyR(n) ); 
      System.out.println( "commafyF(" + n + "): \t" + commafyF(n) ); 	    
    }

    System.out.println();
    System.out.println();
    System.out.println("Hard-coded test calls...");	
    System.out.println("======================================");
    System.out.println( "commafyR(1): \t" + commafyR(1) ); 
    System.out.println( "commafyR(10): \t" + commafyR(10) ); 
    System.out.println( "commafyR(100): \t" + commafyR(100) ); 
    System.out.println( "commafyR(101): \t" + commafyR(101) ); 
    System.out.println( "commafyR(1000): \t" + commafyR(1000) ); 
    System.out.println( "commafyR(12345): \t" + commafyR(12345) ); 
    System.out.println( "commafyR(1234567890): \t" + commafyR(1234567890) ); 
    System.out.println( "commafyF(1): \t" + commafyF(1) ); 
    System.out.println( "commafyF(10): \t" + commafyF(10) ); 
    System.out.println( "commafyF(100): \t" + commafyF(100) ); 
    System.out.println( "commafyF(101): \t" + commafyF(101) ); 
    System.out.println( "commafyF(1000): \t" + commafyF(1000) ); 
    System.out.println( "commafyF(12345): \t" + commafyF(12345) ); 
    System.out.println( "commafyF(1234567890): \t" + commafyF(1234567890) ); 
    /*-------------------------------------------------------
      =======================================================*/
  }//end main

}//end class 
