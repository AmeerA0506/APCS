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

  public boolean equals(Object input){
    Rational a = (Rational) input;
    this.reduce();
    a.reduce();
    return (a.p==this.p&&a.q==this.q);
  }

  public static void main ( String[] args ) {
    Rational a= new Rational(2,3);
    Rational b= new Rational(4,6);
    System.out.println(a.equals(b));
    a = new Rational(4,5);
    System.out.println(a.equals(b));
  }

}
