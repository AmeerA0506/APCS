/*
*Aardvarks Are Just Kidding So Elegantly:: Ameer Alnasser, Sophia Eiden, Jacob Kirmayer
APCS
HW14
2021-10-07
DISCO
while working with overloaded constructors, there needs to be another function
QCC 
*/

public class BigSib {
  String helloMsg;

  public BigSib(){ // default greeting
    helloMsg = "Hello";
  }

  public BigSib(String message){ // overloaded constructor - for 'user' selection
    helloMsg = message;
  }

  public String greet(String name){
    return(helloMsg + " " + name);
  }//ends main
}//ends BigSib
