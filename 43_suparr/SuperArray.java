// (Do Not) Consume Arsenic :: Ameer Alnasser & Corina Chen
// APCS pd6
// HW43 -- encapsulation (basic SuperArray functionality)
// 2021-12-07

/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

/**
Disco:
pre and post-operand can change a code's functionality, we had an issue where the population of curtis started with 2 and not 0

QCC:
How does _data get overriden in expand? Is it like an overwriting of the code when the new keyword is triggered?
**/
public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
    _size=0;
    _data=new int[10];
  }


  //output SuperArray in [a,b,c] format
  public String toString()
  {
    String n="";
    n+="[";

for(int i=0;i<_size-1;i++){
    n+=_data[i]+", ";
  }
  n+=_data[_size-1]+"]\n";
return n;
}


  //double capacity of SuperArray
  private void expand()
  {
    _size=_data.length*2;
    _data=new int[_size];
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
    return _data[index];
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
    int holder=_data[index];
  _data[index]=newVal;
  return holder;
  }


  //main method for testing
  public static void main( String[] args )
  {
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );
      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }
      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);
      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
    //  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
