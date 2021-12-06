/**
(Do Not) Consume Arsenic:: Ameer Alnasser & Corina Chen
APCS pd6
HW42: Be Rational!
2021-12-3
time taken: .5hrs

/*
DISCOS
- According to Mr.Mykolyk, "this" is good for making sure things are told apart.
QCCS
- Something completely unrelated to the work, but why does DISCOS and QCCS turn
  two different shades of orange while uncommented?
- Is there a way to have a floor/ceiling function? IE for compareTo, i wanted to return calling - param but thatd be a double. when i typecasted it all went to 0 for reasons I dont understand
*/

public class Rational {

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
      System.out.println( "Denominator cannot be zero. It will take default value of one until you reconsider." );
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
  public int compareTo ( Rational input ) {
    double calling = this.floatValue();
    double param = input.floatValue();
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

  public static void main ( String[] args ) {
    Rational r = new Rational(2,3); // Stores rational number 2/3
    Rational s = new Rational(1,2); // Stores rational number 1/2
    Rational t = new Rational(4,18); //Stores the rational number 4/18

    // Testing the toString
    System.out.println( r.toString() ); // Should print out 2/3
    System.out.println( s.toString() ); //Should print out 1/2

    // Testing floatValue
    System.out.println( r.floatValue() ); // Should print out 0.66666...
    System.out.println ( s.floatValue() ); // Should print out 0.5

    // Testing multiply
    r.multiply(s); //Multiplies r by s, changes r to 2/6.  s remains 1/2
    System.out.println( r.toString() ); // To check out what r is after running through multiply
    System.out.println( s.toString() ); // To check that s remains 1/2

    // Testing divide
    r.divide(s);
    System.out.println( r.toString() ); // Should return 4/6 because r is 2/6
    System.out.println( s.toString() ); //Should still return 1/2

    // Testing add
    r.add(s);
    System.out.println ( r.toString() ); // Should return 7/6
    System.out.println( s.toString() ); // Should return 1/2

    // Testing subtract
    r.subtract(s);
    System.out.println ( r.toString() ); // Should return 8/12
    System.out.println( s.toString() ); // Should return 1/2

    // Testing Reduce
    t.reduce(); //Changes t to 2/9
    System.out.println(t);

    // Testing compareTo
    Rational e = new Rational( 1, 2 );
    System.out.println(r.compareTo(s)); // Should return 1
    System.out.println(t.compareTo(s)); // Should return -1
    System.out.println(e.compareTo(s)); // Should return 0
  }

}

}
