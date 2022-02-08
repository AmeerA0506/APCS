// Ameer Alnasser + Nakib Abedin + Alif Rahman
// APCS pd06
// HW52 -- implementing selection sort
// 2022-01-05w
// time spent:  1.0 hrs

/******************************
 *   class SelectionSort -- implements SelectionSort algorithm
 *
 * ALGO:
 *  1) Find the maximum value of the collection.
 *  2) After finidng the max value, swap the max value with the value at (length of the collection - passX)
 *  3) Look for the max value between index 0 and index (length of the collection -passX) and swap again.
 *  4) Repeat these steps until you complete (length of collection - 1) passes and the list will be sorted.
 *
 * DISCO
 *  1) SelectionSort's best case scenario and worst case scenario are both length of the array-1 (given that you do not check to see if the array is sorted)
 *  2) Using a temp variable is necessary when swapping values because otherwise a value would get lost.
 *
 * QCC
 * q0: How many passes to sort n elements?
 * a0: n-1 passes
 * q1: What do you know after pass p?
 * a1: p elements are sorted until p=n-1 where p+1 elements are sorted
 * q2: How do you know if sorted?
 * a2: after the n-1 pass, it has to be sorted.
 * q3: What does a pass boil down to?
 * a3: finding the minimum of a collection
 *
 * 1) When is it better to use SelectionSort over BubbleSort?
 ******************************/



import java.util.ArrayList;

public class SelectionSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi )
  {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void selectionSortV( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos;
    Comparable temp;

    for(int pass=data.size()-1; pass > 0 ;pass--) {
      // System.out.println( "\nbegin pass " + (data.size()-pass) );//diag

      maxPos=0;

      for(int i=0; i <= pass; i++) {
        if(data.get(i).compareTo(data.get(maxPos)) >= 0){
          maxPos = i;
        }

        // System.out.println( "maxPos: " + maxPos );//diag
        // System.out.println( data );//diag
      }

      temp = data.get(pass);
      data.set(pass, data.get(maxPos));
      data.set(maxPos, temp);
      // System.out.println( "after swap: " +  data );//diag
    }
  }//end selectionSort


  // ArrayList-returning selectionSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> selectionSort( ArrayList<Comparable> input )
  {
    //declare and initialize empty ArrayList for copying
    ArrayList<Comparable> data = new ArrayList<Comparable>();

    //copy input ArrayList into working ArrayList
    for( Comparable o : input )
      data.add( o );

    //sort working ArrayList
    selectionSortV( data );

    return data;
  }//end selectionSort


  public static void main( String [] args )
  {

    /*===============for VOID methods=============
    ArrayList glen = new ArrayList<Integer>();
    glen.add(7);
    glen.add(1);
    glen.add(5);
    glen.add(12);
    glen.add(3);
    System.out.println( "ArrayList glen before sorting:\n" + glen );
    selectionSortV(glen);
    System.out.println( "ArrayList glen after sorting:\n" + glen );
    ArrayList coco = populate( 10, 1, 1000 );
    System.out.println( "ArrayList coco before sorting:\n" + coco );
    selectionSortV(coco);
    System.out.println( "ArrayList coco after sorting:\n" + coco );
      ============================================*/

      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = selectionSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );

      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = selectionSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
  }//end main

}//end class SelectionSort
