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
public class Driver{
  public static boolean test1(){
    Rational test1a= new Rational(2,3);
    Rational test1b= new Rational(4,6);
    return test1a.equals(test1b);
  }
  public static boolean test2(){
    Rational test2a= new Rational(2,1);
    int test2b= 2;
    return (test2a.equals(test2b));
  }
  public static boolean test3(){
    Rational test3a= new Rational(2,1);
    String test3b="2";
    return (test3a.equals(test3b));
  }
public static void main ( String[] args ) {

  System.out.println(test1());
  System.out.println(test2());
  System.out.println(test3());
}
}
