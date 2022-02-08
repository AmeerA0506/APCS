// YAH :: Ameer Alnasser + TurtleBoi and HUUUUUGOOOO JENKINS + Boary
// APCS pd06
// HW47 -- Guess Again
// 2021-12-15w
// time spent: .75 hrs including class time

/***
 * class GuessNumber -- fun fun fun!
 *
 * SKELETON
 *
 * eg, sample interaction with end user:
 *
 * Guess a # fr 1-100: 50
 * Too high
 * Guess a # fr 1-49: 25
 * Too low
 * Guess a # fr 26-49: 38
 * Correct! It took 3 guesses
 ***/

/***
DISCO:
0) SOPln does not end a method. Values can be modified after the fact
1) Breaks are important while impleemnting an iterative loop

QCC:
0) Besides personal preference, how do you know whether recursion or iteration is better?
1) Is this homework to demonstrate the efficiency of binary search to us?

 ***/
import java.util.Scanner;

public class GuessNumber
{

  //instance vars
  private int _lo, _hi, _guessCtr, _target;
  Scanner sc = new Scanner( System.in );


  /*==================================================
    constructor -- initializes a guess-a-number game
    pre:
    post: _lo is lower bound, _hi is upper bound,
    _guessCtr is 1, _target is random int on range [_lo,_hi]
    ==================================================*/
  public GuessNumber( int a, int b )
  {
    _lo = Math.min(a,b);
    _hi = Math.max(a,b);
    _guessCtr = 0;
    _target = (int) (Math.random() * (_hi - _lo + 1)) + _lo;
    //pick random number in range [a,b]

    /* YOUR CODE HERE */
  }


  /*==================================================
    void playRec() -- Prompts a user to guess until guess is correct.
    Uses recursion.
    ==================================================*/
  public void playRec()
  {
    //If _lo and _hi are the same, you lose
    if (_lo == _hi) {
      System.out.println("Unfortunate... The number was " + _target);
      return;
    }
    System.out.print("Guess a # fr " + _lo + "-" + _hi + ": ");
    int guess = sc.nextInt();
    _guessCtr++;
    //3 cases: we either found it, too hi, too lo

    /* YOUR CODE HERE */
    if((guess< _lo)||(guess>_hi)){ //Checks whether input is in range
      System.out.println("Guess has been eliminated already, try guessing again");
      playRec();
    }
   if (guess == _target) {
      System.out.println("Correct! It took " + _guessCtr + " guesses");
    } else if (guess < _target) {
      System.out.println("Too low");
      _lo = guess + 1;
      playRec();
    }else {
      System.out.println("Too high");
      _hi = guess - 1;
      playRec();
    }
  }
  /*==================================================
    void playIter() -- Prompts a user to guess until guess is correct.
    Uses iteration.
    ==================================================*/
  public void playIter()
  {

    int guess;

    while( true ) {
      //If _lo and _hi are the same, you lose
      if (_lo == _hi) {
        System.out.println("Unfortunate... The number was " + _target);
        break;
      }
      System.out.print("Guess a # fr " + _lo + "-" + _hi + ": ");
      guess = sc.nextInt();

      //3 cases: we either found it, too hi, too lo

      /* YOUR CODE HERE */
      _guessCtr++;
      if((guess< _lo)||(guess>_hi)){ //Checks whether input is in range
        System.out.println("Guess has been eliminated already, try guessing again");
      }else if (guess == _target) {
        System.out.println("Correct! It took " + _guessCtr + " guesses");
        break;
      } else if (guess < _target) {
        System.out.println("Too low");
        _lo = guess + 1;
      }else {
        System.out.println("Too high");
        _hi = guess - 1;
      }
}
}

  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
  //playRec();
  playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {

    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);
    //System.out.println(g._target);
    //start the game
    g.play();
    /*-----------------------------
    -----------------------------*/
  }

}//end class GuessNumber
