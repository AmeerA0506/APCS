// YAH :: Ameer Alnasser + TurtleBoi and HUUUUUGOOOO JENKINS + Boary
// APCS pd06
// HW49 -- Rational Standards Compliance (Equals method)
// 2021-12-22W
// time spent: 1 hrs including class time

/*
Disco:
instanceof is an operator that tells us if an object is an instance of another object or a class :).
If we add a boolean of instanceof, we can shortcircuit the equals method when the parameter given is not an instance of the Rational class

QCC:
How would we take in floating type inputs of equals? We have a general idea on how to do other numerical representations, but due to double having a 64-bit precision, it would be difficult in determining the denominator

*/
public class Rational implements Comparable{

  private int p; // Tis a denominator
  private int q; // Tis a numberator

  public Rational () {
    //Creates a rational with 0/1
    p = 0;
    q = 1;
  }

  public Rational ( int a, int b ) {
    //Creates a rational number of a/b unless b is equal to zero
    p = a;
    q = b;
    if ( b == 0 ) {
      System.err.println( "Denominator cannot be zero. It will take default value of one until you reconsider." );
      q = 1;
    }
  }

  //Returns a string representation of the rational number
  public String toString() {
    return p + "/" + q;
  }

  // Returns floating point approximation of the number using the most precise
  // floating point primitive
  public double floatValue() {
    return (double) p / q; //type-casting the int into a double
  }

  // Returns the gcd of the numerator and denominator
  // Imported from 26_gcd/Stats.java
  public static int gcd( int a, int b) {
    int min;
    if (a <= b) {
      min = a;
    }
    else { min = b;}

    int currentNum = 1;
    int guess = 1;

    while ( currentNum < min ) {
      if ( a % currentNum == 0 && b % currentNum ==0 ) {
        guess = currentNum;
      }
      currentNum += 1;
    }

    return guess;
  }

  // Reducing with gcd
  public void reduce() {
    int low = gcd ( p, q );
    p = p / low;
    q = q / low;
  }

  // Compare two nums
  public int compareTo ( Object input ) {
    if ( ! (input instanceof Rational) ) {
      // ClassCastException specified by Java API.
      // Input String is optional; gives diagnostics info.
      throw new ClassCastException("\nMy first error message! "
                                   + " compareTo() input not a Rational");
    }

    double calling = this.floatValue();
    double param = ((Rational)input).floatValue();
    if ( calling == param ) {
      return 0;
    }
    else if ( calling > param ) {
      return 1;
    }
    else {
      return -1;
    }
  }

  // Simply fraction multiplication
  public void multiply( Rational input ) {
    p *= input.p;
    q *= input.q;
  }

  // Dividing fractions is equal to muliplying by the inverse of the divisor
  public void divide ( Rational input ) {
    if ( input.p != 0 ) {
      p *= input.q;
      q *= input.p;
    }
    else {
      System.out.println( "Illegal. Division by 0 error.");
    }
  }

  // Takes 1 Rational object and adds onto current num
  public void add ( Rational input ) {
      int num1 = p * input.q;
      int num2 = q * input.p;
      p = num1 + num2;
      q *= input.q;
  }

  // Takes 1 Rational object and subtracts from current num
  public void subtract ( Rational input ) {
      int num1 = p * input.q;
      int num2 = q * input.p;
      p = num1 - num2;
      q *= input.q;
  }
/*
returns true if object is equal to this instance
*/

  public boolean equals(Object input){
    return (input instanceof Rational) && (this.compareTo((Rational) input)==0);
  }



}
