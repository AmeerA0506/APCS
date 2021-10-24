/***
 *  class Coin
 *  by Clyde "Thluffy" Sinclair
 *  SKELETON
 ***/

public class Coin {

  //attributes aka instance vars
  String name;
  String upFace;
  int value;
  int flipCtr;
  int headsCtr;
  int tailsCtr;
  double bias;



  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
    name="coin";
    upFace="face";
    flipCtr=0;
    headsCtr=0;
    tailsCtr=0;
    value=0;
    bias=.5;
  }

  /***
      Coin(String) -- overloaded constructor
      precond: input is one of
      "penny",
      "nickel",
      "dime",
      "quarter",
      "half dollar",
      "dollar"
      postcond:
  ***/
  public Coin( String s ) {
    if ((s == "penny")|| (s == "nickel") || (s == "dime")|| (s=="quarter")|| (s== "half dollar" )|| (s == "dollar")){
            name = s;
    } else {
  System.out.println("Invalid coin name");
}
}


  }

  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    if ((s == "penny")|| (s == "nickel") || (s == "dime")|| (s=="quarter")|| (s== "half dollar" )|| (s == "dollar")){
            name = s;
    }
    if(){
      
    }

}


  // Accessors...
  // ----------------------------
  public String getUpFace() {

  }

  public int getFlipCtr() {

  }

  public double getValue() {

  }

  public int getHeadsCtr() {

  }

  public int getTailsCtr() {

  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
  private double assignValue( String s ) {

  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {

  }


  /***
   * String flip() -- simulates a Coin flip
   * precond:  bias is a double on interval [0.0,1.0]
   * (1.0 indicates always heads, 0.0 always tails)
   * postcond: upFace updated to reflect result of flip.
   * flipCtr incremented by 1.
   * Either headsCtr or tailsCtr incremented by 1, as approp.
   * Returns "heads" or "tails"
   ***/
  public String flip() {

  }


  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {

  }


  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {

  }

}//end class
