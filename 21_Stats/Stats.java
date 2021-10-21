// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW21 -- STAtisTically Speaking...
// 2021-10-20

/*
DISCOVERIES
    0. Implemented conditionals into mean, max, and geoMean methods. 
    1. Considered extreme test cases (negative values, zero value, positive values).
    2. Imported java.lang.math to help perform basic operations. 
    3. Whenever you perform an operation with ints, the result will be stored as type double. 
UNRESOLVED QUESTIONS
    0. Is there a way for a method (not overloaded) to have two possible return types?
    1. How can we convert a double to an int without type casting?
*/

import java.lang.Math;

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
        if (a >= 0 && b >= 0) {
            int x = Math.pow(a * b, 1/2); 
            return x;
        } else {
            System.out.println("geoMean() does not work with negative inputs");
            return -1;
        }
    }

    public static double geoMean(double a, double b) {
        if (a >= 0 && b >= 0) {
            return Math.pow(a * b, 1/2);
        } else {
            System.out.println("geoMean() does not work with negative inputs");
            return -1.0;
        }
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
        if (a >= 0 && b >= 0) {
            int x = Math.pow(a * b * c, 1/3);
            return x;
        } else {
            System.out.println("geoMean() does not work with negative inputs");
            return -1;
        }
    }

    public static double geoMean(double a, double b, double c) {
        if (a >= 0 && b >= 0) {
            return Math.pow(a * b * c, 1/3);
        } else {
            System.out.println("geoMean() does not work with negative inputs");
            return -1;
        }
    }
}//end class
