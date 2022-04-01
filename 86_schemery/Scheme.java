// (FA)FSA -- Fang, Sophia, Ameer
// APCS Pd06
// HW 86 -- What A Racket!!!!!!!! Scheme Sophomoric
// 2022-03-30
// time spent: 2.5 hrs


/*
DISCO:
it is hard to make a language compiler in a different language.
It was difficult to chaneg the operands
stealing underpants is bad
Strings are cringe
Integers have a valueOf method, a parseInt method, and a toString method

QCC:
how change operand :(
/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. Get arrested
 *   3. Pay bail
 *   4. convert string into string[], then for each element of string[] use conditionals to decide wat to do with the element: continue pushing or to unload.
 *   5. Profit!
 *
 * STACK OF CHOICE: ALSTACK by us :)
 * b/c ALStack looks nicer
 **/

public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/
  public static String evaluate( String expr )
  {
     Stack<String> stack = new ALStack<String>(); //numbers and open paranthesis
     String[] parsed = expr.split("\\s+"); //everythign
     String operand = "";

     for (int i = 0; i < parsed.length; i++){
       System.out.println(stack);
         if (parsed[i].equals( ")")){
         if (operand.equals( "+")){
           stack.push(unload(1, stack));
         }
         else if (operand.equals( "-")){
           stack.push(unload(2, stack));
         }
         else if (operand.equals( "*")){
           stack.push(unload(3, stack));
         }
         else{ return "i think something went wrong";}
       }
       else if (isNumber(parsed[i])){
         stack.push(parsed[i]);
       }
       else{
          operand = parsed[i];
        stack.push(operand);
       }
     }
     System.out.println(stack);
     return ""+(stack.peekTop());

    }//end evaluate()



  /***
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   **/
  public static String unload( int op, Stack<String> numbers )
  {
    String tmp1=numbers.pop();
    String tmp2=numbers.pop();

    if(!(numbers.peekTop().equals("("))){
         if(op==1){
        numbers.push(Integer.toString(Integer.parseInt(tmp1)+Integer.parseInt(tmp2)));

      }
      if(op==2){
        numbers.push(Integer.toString(Integer.parseInt(tmp1)-Integer.parseInt(tmp2)));
      }
      if(op==3){
      numbers.push(Integer.toString(Integer.parseInt(tmp1)*Integer.parseInt(tmp2)));
    }
    return unload(op,numbers);
  }

  else{
    numbers.pop();
  return tmp1;
  }
}



  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
  }
  catch( NumberFormatException e ) {
  return false;
  }
  }



  //main method for testing
  public static void main( String[] args )
  {

      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17
      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29
      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
