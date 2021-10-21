/*
*Aardvarks Are Just Kidding:: Ameer Alnasser, Jacob Kirmayer
*APCS
*HW13
*2021-10-06
*DISCO
*NEED TO REMEMBER WHERE I NEED TO CLOSE THE BRACKETS!!!
*Constructors in the beginning allow for the "null" originally valued in greeting to Word up
*QCC 
*What is the issue with making greeting public or private? they both work code-wise
*/

public class BigSib {
    String greeting;
    public BigSib(){
             greeting="Word up";
	}
    public String greet(String input){
        return (greeting+" "+input);
    }

    public void setHelloMsg(String message){
        greeting = message;
    }


}
