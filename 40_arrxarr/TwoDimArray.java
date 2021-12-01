/******************************
(Do Not) Consume Arsenic:: Ameer Alnasser & Corina Chen
APCS pd6
HW40 -- 2D arrays
2021-11-30
time taken:.5hrs
/*
DISCOS:
- Adding a pair of "" allows the array to be printed out without needing any
  other utilities.
QCC:
- How would one declare a 2D array where each row has a different number of
  values without manually initializing the values ourselves?
*/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
  String n="";
  for(int i=0;i<a.length;++i){
    n+="[";
    for(int j=0; j<a[i].length-1; ++j){
      n+=a[i][j]+", ";
    }
    n+=a[i][a[i].length-1]+"]\n";
  }
  System.out.println(n);
  }



  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    String post = "";
    for (int[] i : a ) {
      post+="[";
           for (int j : i ) {
             post += j+ " ";
           }
           post += "]\n";
         }
         System.out.println( post );
       }
     


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    int holder = 0;
    for ( int i = 0; i < a.length; i++ ) {
      for (int j = 0; j < a[i].length; j++ ) {
        holder += a[i][j];
      }
    }
    return holder;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    int holder = 0;
    for ( int i = 0; i < m.length; i++ ) {
      holder += sumRow( i, m );
    }
    return holder;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow( int r, int[][] a )
  {
    int holder = 0;
    for ( int i = 0; i < a[r].length; i++ ) {
      holder += a[r][i];
    }
    return holder;
  }


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2(int r, int[][] m)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int summer = 0;
    for ( int i : m[r] ) {
      summer += i;
    }
    return summer;
  }


  public static void main( String [] args )
  {
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);
      print2(m1);
      print2(m2);
      print2(m3);
      System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
