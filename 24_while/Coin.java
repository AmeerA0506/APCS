/**
Aristocratic Hippos :: Ameer Alnasser, Hugo Jenkins
APCS
HW24
2021-10-24
time spent: 1.4 hr (excluding class time)
DISCO:
the syntax of conditionals (IE: || in java ==or in python)
how to compare different objects of same class
How to effectively utilize Pair Programming && compiling per step of the way
How to change values initilaized with a defined constructor
QCC:
There was an issue when we set the boolean functon to return "other.flip()==upF>
Is there a more seameless way to organize brackets so you dont get lost in the >
is there a quicker way to check if a value is one of a certain list (IE: we com>
**/

public class Coin {

  //attributes aka instance vars
  //changed to private because we don't like them being public for no reason
  private String name, upFace;
  private double value;
  public int flipCtr, headsCtr, tailsCtr; //Changed to public so we can compare in Driver.java
  private double bias = .5;



  /***
   *  Coin() -- default constuctor
   *  precond:
   *  postcond:
   ***/
  public Coin() {
    reset("heads",0.5);
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
    this();//avoids unnecessary coding
    name =s ;
    assignValue(s);
}



  /***
      Coin(String,String) --
      precond:
      postcond:
  ***/
  public Coin( String s, String nowFace ) {
    this(s);//avoids unnecessary coding
    upFace = nowFace;
}


  // Accessors...
  // ----------------------------
  public String getUpFace() {
    return upFace;
  }

  public int getFlipCtr() {
    return flipCtr;
  }

  public double getValue() {
    return value;
  }

  public int getHeadsCtr() {
    return headsCtr;
  }

  public int getTailsCtr() {
    return tailsCtr;
  }
  // ----------------------------


  /***
   * assignValue() -- set a Coin's monetary value based on its name
   * precond:  input String is a valid coin name ("penny", "nickel", etc.)
   * postcond: instvar value gets appropriate value
   * Returns value assigned.
   ***/
 private double assignValue( String s ) {
    if(s == "penny"){
      value = .01;
    }
    else if(s == "nickel"){
      value = .05;
    }
    else if(s == "dime"){
      value = .10;
    }
    else if(s=="quarter"){
      value = .25;
    }
    else if(s== "half dollar"){
      value = .50;
    }
    else if(s == "dollar"){
      value = 1.00;
    }
    return value;
  }


  /***
      reset() -- initialize a Coin
      precond:  s is "heads" or "tails", 0.0 <= d <= 1.0
      postcond: Coin's attribs reset to starting vals
  ***/
  public void reset( String s, double d ) {
    if((s == "heads")|| (s == "tails") && (0<=d) && (d<=1)){
    upFace = s;
    flipCtr=0;
    headsCtr=0;
    tailsCtr=0;
    bias = d;
  }
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
   double v;
    v=Math.random();
    if (v >= .5){
      headsCtr+=1;
      upFace="heads";
      flipCtr+=1;
    }
    else{
      tailsCtr+=1;
      upFace="tails";
      flipCtr+=1;
    }
    return upFace;

    }



  /***
   * boolean equals(Coin) -- checks to see if 2 coins have same face up
   * precond: other is not null
   * postcond: Returns true if both coins showing heads
   * or both showing tails. False otherwise.
   ***/
  public boolean equals( Coin other ) {

    return upFace.equals(other.upFace); //upFace is the instance variabl;e, .eq>
}
  /***
   * String toString() -- overrides toString() provided by Java
   * precond: n/a
   * postcond: Return String comprised of name and current face
   ***/
  public String toString() {
    return name + " -- " + upFace;
  }

}//end class
