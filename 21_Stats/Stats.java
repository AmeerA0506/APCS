/**
   AJR: Aliens Jogging Rowdily (Ameer Alnasser, Ryan Lau, Jefford Shau)
    APCS
    HW21 -- STAtisTically Speaking...
    2021-10-21
    xtra: harmonic mean is the reciprocal of the
    arithmetic mean of the reciprocals

DISCO
    0. Implemented conditionals into mean, max, and geoMean methods. 
    1. Considered extreme test cases (negative values, zero value, positive values).
    2. Imported java.lang.math to help perform basic operations. 
    3. Whenever you perform an operation with ints, the result will be stored as type double. 
QCC
    0. Is there a way for a method (not overloaded) to have two possible return types?
    1. How can we convert a double to an int without type casting?
**/

import java.util.Math;

public class Stats {

    public static int mean(int a, int b) {
        return (a + b) / 2;
    }

    public static double mean(double a, double b) {
        return (a + b) / 2;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int geoMean(int a, int b) {
        return Math.sqrt(a * b);
    }

    public static double geoMean(double a, double b) {
        return Math.sqrt(a * b);
    }

    public static int max(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static double max(double a, double b, double c) {
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }
    }

    public static int geoMean(int a, int b, int c) {

    }

    public static double geoMean(double a, double b, double c) {

    }


    //main method for testing functionality
    public static void main( String[] args ) {
        Stats s = new Stats();
        // int mean()
        System.out.println(s.mean(2, 2)); // 2
        System.out.println(s.mean(2, 4)); // 3
        System.out.println(s.mean(0, 0)); // 0
        System.out.println(s.mean(0, -2)); // -1
        System.out.println(s.mean(-4, -2)); // -3
        // double mean()
        System.out.println(s.mean(2.0, 2.0)); // 2.0
        System.out.println(s.mean(2.0, 4.0)); // 3.0
        System.out.println(s.mean(0.0, 0.0)); // 0.0
        System.out.println(s.mean(0.0, -2.0)); // -1.0
        System.out.println(s.mean(-4.0, -2.0)); // -3.0
        // int max()
        System.out.println(s.max(2, 2)); // 2
        System.out.println(s.max(2, 4)); // 4
        System.out.println(s.max(0, 0)); // 0
        System.out.println(s.max(0, -2)); // 0
        System.out.println(s.max(-4, -2)); // -2
        // double max()
        System.out.println(s.max(2.0, 2.0)); // 2.0
        System.out.println(s.max(2.0, 4.0)); // 4.0
        System.out.println(s.max(0.0, 0.0)); // 0.0
        System.out.println(s.max(0.0, -2.0)); // 0.0
        System.out.println(s.max(-4.0, -2.0)); // -2.0
        // int geoMean()
        System.out.println(s.geoMean(18, 18)); // 18
        System.out.println(s.geoMean(2, 18)); // 6
        System.out.println(s.geoMean(0, 0)); // 0
        System.out.println(s.geoMean(-2, 18)); // error: cannot handle imaginary numbers
        System.out.println(s.geoMean(-2, -18)); // 6
        // double geoMean()
        System.out.println(s.geoMean(18.0, 18.0)); // 18.0
        System.out.println(s.geoMean(2.0, 18.0)); // 6.0
        System.out.println(s.geoMean(0.0, 0.0)); // 0.0
        System.out.println(s.geoMean(-2.0, 18.0)); // error: cannot handle imaginary numbers
        System.out.println(s.geoMean(-2.0, -18.0)); // 6.0
    }

}//end class
