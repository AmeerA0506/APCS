// (FA)FSA: Fang, Sophia, Ameer
// APCS pd06
// HW 83 -- Latke.
// 2022-03-28m
// time spent: 0.5 hrs


public class LatKtS
{

  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    String output=s.substring(s.length()-1,s.length());
    Latkes soo= new Latkes(s.length());
    for(int x=1;x<s.length();x++){
      soo.push(s.substring(x-1,x));
      output+=(s.substring(s.length()-x-1,s.length()-x));
      }
    return output;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    String[] open={"(","{","["};
    String[] close={"}",")","]"};
      if(s.length()>=1&&(s.substring(0,1)!='('||s.substring(0,1)!='{'||s.substring(0,1)!='['){
      return false;
    }
    boolean x=true;
    return x;
  }
  //helper method to check if the parans inside of two paranthesis are closed

  //main method to test
  public static void main( String[] args )
  {
    System.out.println(flip("stressed"));
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
