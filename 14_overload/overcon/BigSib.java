/*
*Aardvarks Are Just Kidding So Elegantly:: Ameer Alnasser, Sophia Eiden, Jacob Kirmayer
APCS
HW13
2021-10-06
DISCO
NEED TO REMEMBER WHERE I NEED TO CLOSE THE BRACKETS!!!
Constructors in the beginning allow for the "null" originally valued in greeting to Word up
QCC 
What is the issue with making greeting public or private? they both work code-wise
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
