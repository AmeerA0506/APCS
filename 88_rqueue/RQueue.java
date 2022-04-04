// (FA)FSA -- Fang, Sophia, Ameer
// APCS Pd06
// HW 88 -- BPC Kiddies Do Not Wait in Line Either
// 2022-04-04m
// time spent: 1.0 hrs

/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/

import java.util.NoSuchElementException;

public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
    //instance variables
    private LLNode<PIKACHU> _front, _end;
    private int _size;

    public RQueue()
    {
      _front = _end = null;
      _size = 0;
    }


    //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
    //means of removing an element from collection:
    //Dequeues and returns the first element of the queue.
    public PIKACHU dequeue()
    {
      LLNode tmp= _front;
      int random=(int)(Math.random()*size);
      for(int i=0; i<random-1;i++)
      if ( _front == null ){ //just moved past last node
        _end = null;      //update _end to reflect emptiness

      _size--;
    }
      PIKACHU retVal = _front.getCargo();

      return retVal;
    }

    //means of adding an element to collection:
    //Enqueue an element onto the back of this queue.
    public void enqueue( PIKACHU enQVal )
    {
      //special case: when enqueuing to an empty list,
      //make _front && _end point to same node
      if ( isEmpty() ) {
        _front = _end = new LLNode<PIKACHU>( enQVal, null );
      }
      else {
        _end.setNext( new LLNode<PIKACHU>( enQVal, null ) );
        _end = _end.getNext();
      }
      _size++;
      System.out.println("enqueued " + enQVal);
    }

    //Returns true if this queue is empty, otherwise returns false.
    public boolean isEmpty()
    {
      return _size == 0;
    }

    //Returns the first element of the queue without dequeuing it.
    public PIKACHU peekFront()
    {
      return _front.getCargo();
    }

    // override inherited toString
    public String toString()
    {
      String retStr = "FRONT :: ";
      LLNode<PIKACHU> tmp = _front; //init tr
      while( tmp != null ) {
        retStr += tmp.getCargo() + " ";
        tmp = tmp.getNext();
      }
      retStr += " :: END";
      return retStr;
    }



    /***
     * class LLNode
     * Implements a node, for use in lists and other container classes.
     * Stores its data as a T
     **/
    public class LLNode<T>
    {
      //instance vars
      private T _cargo;    //cargo may only be of type T
      private LLNode<T> _nextNode; //pointer to next LLNode<T>

      // constructor -- initializes instance vars
      public LLNode( T value, LLNode<T> next ) {
        _cargo = value;
        _nextNode = next;
      }


      //--------------v  ACCESSORS  v--------------
      public T getCargo() { return _cargo; }

      public LLNode<T> getNext() { return _nextNode; }
      //--------------^  ACCESSORS  ^--------------


      //--------------v  MUTATORS  v--------------
      public T setCargo( T newCargo ) {
        T foo = getCargo();
        _cargo = newCargo;
        return foo;
      }

      public LLNode<T> setNext( LLNode<T> newNext ) {
        LLNode<T> foo = getNext();
        _nextNode = newNext;
        return foo;
      }
      //--------------^  MUTATORS  ^--------------


      // override inherited toString
      public String toString() { return _cargo.toString(); }

    }//end class LLNode

  }//end class LList
