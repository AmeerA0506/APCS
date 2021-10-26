/*
Aristocratic Hippos :: Ameer Alnasser, Hugo Jenkins
APCS
HW24: Get It While You Can
2021-10-25
Time Spent: 1.25 hours
Disco:
If statements work compeletely normally when inside a while loop -- Is this true for everything?
Qcc:
Is there a while not in java?
Is there a way to to banana.flip() and pineapple.flip() in one thing?
*/


public class Driver{
  public static void main (String[] args){
    int x = Integer.parseInt(args[0]);//learned from Platek homework
    int y = Integer.parseInt(args[1]);
    Coin banana = new Coin();
    Coin pineapple = new Coin();
    while (banana.headsCtr != x){
      banana.flip();
    }
    System.out.println("Flipped "+ banana.flipCtr + " times to reach " + x + " heads");
    banana.reset("heads",0.5);
    int apple = 0;
    while (apple != y){
      banana.flip();
      pineapple.flip();
      if (banana.equals(pineapple)){
        apple += 1;
      }
    }
    System.out.println("Flipped "+ banana.flipCtr + " times to reach " + y + " matches");
    banana.reset("heads",0.5);
    pineapple.reset("heads",0.5);
    apple = 0;
    while ((apple < 65536)||(apple%2005!=0)){
      banana.flip();
      pineapple.flip();
      if (banana.equals(pineapple)){
        apple += 1;
      }
    }
    System.out.println("Flipped "+ banana.flipCtr + " times to reach at least 65536 matches and number of matches is divisble by YOB. That number of matches was " + apple);
}
