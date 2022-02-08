// YAH: Hugo Jenkins + Boary, Ameer Alnasser + Turtleboi
// APCS pd6
// HW51 -- implementing bubblesort
// 2022-01-03
// time spent: 1 hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * Our goal is to sort a list by traversing throught the list starting at the right and moving left. We will compare each element to the element to the left of it and swap them in the left element is greater. We will do this as many times as we need to until the list is sorted.
 * DISCO
 * ArrayList coco should not be changed in the final output, it should only be a completely
 * ArrayList has a clone() method which makes and ArrayList of equal length but values are not copied
 * QCC
 * Why did our attempt at making a copy of the input ArrayList fail?
 * What will the final project be?
 * q0: If a pass requires no swaps, what do you know?
 * a0: we know that the list is sorted
 * q1: After pass p, what do you know?
 * a1: p values are sorted
 * q2: How many passes are necessary to completely sort?
 * a2: length-1 if length > 0
 *
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
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
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    boolean cont = false;
    for(int i=data.size()-1; i>0; i--){
      if((data.get(i).compareTo(data.get(i-1))) < 0){
        cont = true;
        Comparable x= data.get(i);
        data.set(i, data.get(i-1));
        data.set(i-1, x);
      }
    }
    if (cont == true) bubbleSortV(data);
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    //ArrayList<Comparable> copy = new ArrayList<Comparable>(input.size());
    ArrayList<Comparable> copy = (ArrayList<Comparable>) input.clone();
    if (copy.size()>0){
      for (int i = 0; i < copy.size();i++) {
        copy.set(i, input.get(i));
      }
    }

    bubbleSortV(copy);
    return copy;
  }

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
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      ============================================*/

      /*==========for AL-returning methods==========
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      //System.out.println(glen.size());
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n"
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n"
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      ============================================*/

  }//end main

}//end class BubbleSort
