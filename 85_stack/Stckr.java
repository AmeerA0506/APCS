// (FA)FSA -- Fang, Sophia, Ameer
// APCS Pd06
// HW 85 -- Pancakes
// 2022-03-30
// time spent: 0.5 hrs

/**
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    //Stack<String> cakes = new ALStack<String>();
    Stack<String> cakes = new LLStack<String>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

     System.out.println("Empty? " + cakes.isEmpty());
     cakes.push("ameer");
     System.out.println(cakes.peekTop());
     cakes.pop();
     cakes.push("fang");
     System.out.println(cakes.peekTop());
     cakes.pop();
     cakes.push("sophia");
     System.out.println(cakes.peekTop());
     cakes.pop();
     cakes.push("(FA)FSA");
     System.out.println(cakes.peekTop());
     cakes.pop();
     System.out.println("Empty? " + cakes.isEmpty());
    //...

  }//end main

}//end class
