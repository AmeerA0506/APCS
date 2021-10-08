/*Team: Ameer Alnasser, Sophia Eiden, Jacob Kirmayer
APCS
HW14 -- Customize Your Creation / overloaded constructors
2021-10-07
DISCO:
Same as 13_hatch 
*/

public class BigSib {
  String helloMsg;

  public BigSib(String message){
    helloMsg = message;
  }

  public String greet(String name){
    return(helloMsg + " " + name);
  }

}
