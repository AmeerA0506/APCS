/**Ameer Alnasser
*APCS
*HW08
*2021-09-29
*

*DISCOVERIES
*secondary functions can be defined before or after the main function
*follows the same-ish structure as python 
*
*Unresolved questions:
*Is there a way to make it stop at every greeting instead of all outputting at once? 
* is a secondary function necessary? 
*/
public class Greet {

	public static void greet(String input){
		System.out.println("How is it going, fellow thinker"+input);
}

	public static void main(String[] args){
		greet(" Ameer! How is the weather holding up?");
		greet(" Jacob! Hope you woke up on the right side of bed :D");
		greet(" Josiah! How was your transport to school today?");
}

}
