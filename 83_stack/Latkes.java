// (FA)FSA: Fang, Sophia, Ameer
// APCS pd06
// HW 83 -- Latke.
// 2022-03-28m
// time spent: 0.5 hrs

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO
    Latkes taste really good
    QCC
    Should we expand the capacity of the Latkes?
 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stack = new String[initCapacity];
    _stackSize=0;
  }// O(?) (O(1))


  //means of insertion
  public void push( String s )
  {
    if(!isFull()){
      _stack[_stackSize]=s;
      _stackSize+=1;
    }
    else{
      String[] tmp= new String[_stackSize+1];
      for(int i=0; i< _stack.length-1; i++){
        tmp[i]=_stack[i];
      }
      tmp[tmp.length-1]=s;
      _stack=new String [_stackSize+1];
      _stack=tmp;
    }
  }// O(?)


  //means of removal
  public String pop( )
  {
    //[5,3,2]
    //[3,2,0]
    String output=null;
    if(!isEmpty()){
      output=_stack[_stackSize-1];
      _stack[_stackSize-1]=null;
      _stackSize--;
    }
    return output;
  }// O(?)


  //chk for emptiness
  public boolean isEmpty()
  {
    return _stackSize==0;
  }// O(?)


  //chk for fullness
  public boolean isFull()
  {
    return _stackSize==_stack.length;

  }// O(?)

  public String toString(){
    String output="[";
    for(String s: _stack){
      output+=", " + s;
    }
    output+="]";
    return output;
  }
  //main method for testing
  public static void main( String[] args )
  {
    Latkes tastyStack = new Latkes(10);
    tastyStack.push("aoo");
    System.out.println( tastyStack );

    tastyStack.push("boo");
    System.out.println( tastyStack );

    tastyStack.push("coo");
    System.out.println( tastyStack );

    tastyStack.push("doo");
    System.out.println( tastyStack );

    tastyStack.push("eoo");
    System.out.println( tastyStack );

    tastyStack.push("foo");
    System.out.println( tastyStack );

    tastyStack.push("goo");
    System.out.println( tastyStack );

    tastyStack.push("hoo");
    System.out.println( tastyStack );

    tastyStack.push("ioo");
    System.out.println( tastyStack );

    tastyStack.push("joo");
    System.out.println( tastyStack );

    tastyStack.push("coocoo");
    System.out.println( tastyStack );

    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack );

    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack );

    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );
    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
  }//end main()

}//end class Latkes
