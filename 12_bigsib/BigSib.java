/**Aardvarks Are Just Kidding:: Ameer Alnasser,Jacob Kirmayer
*APCS
*HW12
*2021-10-05
*
*DISCO:
*string must be initialized in both Greet and BigSib
*Instance variables are called inside the class
*QCC: 
*What is the greet java file doing exactly? what is the point of richard?
/

public class BigSib {
    public String greeting;

    public void setHelloMsg(String message){
        greeting = message;
    }

    public String greet(String input){
        return (greeting+" "+input);
    }

}
