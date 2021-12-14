// And Then There Were Two :: Ameer Alnasser and HUUUUUGOOOO JENKINS
// APCS pd06
// HW47 -- Guess a Number!
// 2021-12-15w
// time spent: .25 hrs excluding class time

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
    SOPln does not end a function. Values can be modified after the fact
    -
    QCC:
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
    System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
    int guess = sc.nextInt();
    _guessCtr++;
    //3 cases: we either found it, too hi, too lo

    /* YOUR CODE HERE */
    if((guess< _lo)||(guess>_hi)){
      System.out.println("Guess has been eliminated already, try guessing again");
      playRec();
    }
    else{
    if (_lo == _hi) {
System.out.println("Unfortunate... The number was " + _target);
}
 else {
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
      System.out.print("Guess a num bt " + _lo + " & " + _hi + ": ");
      guess = sc.nextInt();

      //3 cases: we either found it, too hi, too lo

      /* YOUR CODE HERE */
      _guessCtr++;
      if((guess< _lo)||(guess>_hi)){
        System.out.println("Guess has been eliminated already, try guessing again");
      }
      else{
       if (guess == _target) {
        System.out.println("Correct! It took " + _guessCtr + " guesses");
        break;
      } else if (guess < _target) {
        System.out.println("Too low");
        _lo = guess + 1;
      }else {
        System.out.println("Too high");
        _hi = guess - 1;
      }
      if (_lo == _hi) {
        System.out.println("Unfortunate... The number was " + _target);
        break;
    }
  }
}
}

  //wrapper for playRec/playIter to simplify calling
  public void play()
  {
    //use one or the other below:
  //  playRec();
    playIter();
  }


  //main method to run it all
  public static void main( String[] args )
  {

    //instantiate a new game
    GuessNumber g = new GuessNumber(1,100);
    //start the game
    g.play();
    /*-----------------------------
    -----------------------------*/
  }

}//end class GuessNumber
