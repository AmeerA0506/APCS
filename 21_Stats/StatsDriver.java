// TNPG: AJR (Ameer Alnasser, Jefford Shau, Ryan Lau)
// APCS
// HW21 -- STAtisTically Speaking...
// 2021-10-20

public class StatsDriver{

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
     /*   // int geoMean()
        System.out.println(s.geoMean(18, 18)); // 18
        System.out.println(s.geoMean(2, 18)); // 6
        System.out.println(s.geoMean(0, 0)); // 0
        System.out.println(s.geoMean(-2, 18)); // geoMean() does not work with negative inputs
        System.out.println(s.geoMean(-2, -18)); // geoMean() does not work with negative inputs
        // double geoMean()
        System.out.println(s.geoMean(18.0, 18.0)); // 18.0
        System.out.println(s.geoMean(2.0, 18.0)); // 6.0
        System.out.println(s.geoMean(0.0, 0.0)); // 0.0
        System.out.println(s.geoMean(-2.0, 18.0)); // geoMean() does not work with negative inputs
        System.out.println(s.geoMean(-2.0, -18.0)); // geoMean() does not work with negative inputs
    }
    */
}
