
public class MySorts {

/*
  Bubble ALGO:
 * 1) Create the bubble. Start from one end (in this case, index 0). Set n=0 and set the bubble as n and n+1.
 * 2) If n>n+1, swap the values. Then increment n by one and repeat until you reach the end of the list.
 * 3) Check if the list is sorted (if there are no swaps after one complete iterationm then it must be sorted).
*/
  public static void bubble( ArrayList<Comparable> data){
    for (int x = data.size()-1; x > 0; x--) {
      for (int i = 0; i < x; i++) {
        Comparable n = data.get(i);
        Comparable m = data.get(i+1);

        if (n.compareTo(m)>0) {
          data.set(i+1, n);
          data.set(i, m);
        }
      }
    }
  }

  /*
  Selection ALGO:
  *  1) Find the maximum value of the collection.
  *  2) After finidng the max value, swap the max value with the value at (length of the collection - passX)
  *  3) Look for the max value between index 0 and index (length of the collection -passX) and swap again.
  *  4) Repeat these steps until you complete (length of collection - 1) passes and the list will be sorted.
  */

  public static void selection( ArrayList<Comparable> data ){
     //note: this version places greatest value at "rightmost" end
     //maxPos will point to position of SELECTION (greatest value)
     int maxPos;
     Comparable temp;

     for(int pass=data.size()-1; pass > 0 ;pass--) {
       maxPos=0;
       for(int i=0; i <= pass; i++) {
         if(data.get(i).compareTo(data.get(maxPos)) >= 0){
           maxPos = i;
         }
       }

       temp = data.get(pass);
       data.set(pass, data.get(maxPos));
       data.set(maxPos, temp);
     }
   }
/*
   Insetion ALGO:
   *  1) Set the partition ( a marker which says all elements to one side are sorted ) to 1.
   *  2) For each element in the unsorted region (rightmost index up to the partition), set the element to the index of the partition and compare it with each value before it.
   *  3) if the value is less than the previous value, swap places with it. If you swap, repeat this step.
   *  4) Once the partition reaches the end of the collection, the collection will thusly be sorted.
*/
  public static void insertion( ArrayList<Comparable> data){
      for(int partition = 1; partition < data.size(); partition++) {
        //partition marks first item in unsorted region

        //traverse sorted region from right to left
        for( int i = partition; i > 0; i-- ) {

          // "walk" the current item to where it belongs
          // by swapping adjacent items
          if ( data.get(i).compareTo(data.get(i-1)) < 0 ) {
            Comparable temp = data.get(i);
            data.set(i, data.get(i-1));
            data.set(i-1, temp);
          }
          else
            break;
        }
      }
    }
}
