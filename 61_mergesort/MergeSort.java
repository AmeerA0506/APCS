// BA Mitzvah:: Ameer Alnasser, ben Belotser, Ryan Lau, Michael Kamela\
// Ameer Alnasser
// APCSpd6
// HW61:Instructions so Simple...
//2022-02-06
/***
  class MergeSort
  Implements mergesort on array of ints.
  Summary of Algorithm:
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] Merge=new int[a.length+b.length];
    int AIndex=0;
    int BIndex=0;
    int CIndex=0;
    while (1==1){
      if(a[AIndex]>b[BIndex]){
        Merge[CIndex]=b[BIndex];
        BIndex+=1;
      }
      else{
        Merge[CIndex]=a[AIndex];
        AIndex+=1;
      }
      CIndex+=1;
      if(AIndex==a.length){
        while (1==1){
          Merge[CIndex]=b[BIndex];
          BIndex+=1;
          CIndex+=1;
        }
      }
      else if(BIndex==b.length){
        while (1==1){
          Merge[CIndex]=a[AIndex];
          AIndex+=1;
          CIndex+=1;

        }
      }
    }
    return Merge;
  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr)
  {
    int[] sort1=new int[(arr.length)/2];
    int[] sort2=new int[arr.length-(arr.length/2)];
    int[] output= new int[arr.length];
    int counter=0;
    for(int i=0;i<(arr.length/2);i++){
      sort1[i]=arr[i];
      sort2[i]=arr[i+(arr.length/2)];
    }
    if (sort1.length==1&&sort2.length==1){
     int[] merge= new int[2];
     merge=merge(sort1,sort2);
     output[counter]=merge[0];
     output[counter+1]=merge[1];
     counter+=2;
    }
    else{
      sort(sort1);
      sort(sort2);
    }
    return output;
  }//end sort()



  //-------------------HELPERS-------------------------
  //tester function for exploring how arrays are passed
  //usage: print array, mess(array), print array. Whaddayasee?
  // It clears the array :D
  public static void mess( int[] a ) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }

  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};
      System.out.println("\nTesting mess-with-array method...");
      printArray( arr3 );
      mess(arr3);
      printArray( arr3 );
      System.out.println("\nMerging arr1 and arr0: ");
      printArray( merge(arr1,arr0) );
      System.out.println("\nMerging arr4 and arr6: ");
      printArray( merge(arr4,arr6) );
      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*~~~~~~~~~~~~~~ Ye Olde Tester Bar ~~~~~~~~~~~~~~

      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()
}
