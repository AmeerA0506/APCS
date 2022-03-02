// BA Mitzvah:: Ameer Alnasser, Ben Belotser, Michael Kamela
// APCS pd6 
// HW68 -- recursively probing for a closed cycle
// 2022-02-28m
// time spent:.5  hrs

/***
 * SKELETON
 * class KnightTour (and supporting class TourFinder)
 * Animates generation of a Knight's Tour on a square chess board.
 *
 * USAGE: (default N value: 8)
 * $ javac KnightTour.java
 * $ java KnightTour
 * $ java KnightTour [N]
 *
 * ALGO
 * Given a starting position and board size, this method ultimately displays a completed knight tour (if possible) using numbers tp depict the possible steps being done. Due to the "unusualness" of the knights' moves, we had to look at every possible knight tour in order to find a completed one. This program does this by finding one "line" of possible knight moves, then stopping when it hits a "dead end" (no moves are available) After hitting a dead end, the knight returns to the last square without dead ends and goes through to find if you are able to complete it from a different point. It repeats this process until all 0s in the 2DArray are replaced by a number.
 * DISC
 *The purpose of the system.exit part is to exit the program in case its taking too long
 * QCC
 * Have we worked with using "arguments" while compiling and running a java file before? we used args[0] today and I felt like ive never seen it
 * Whats the best way to measure time in terms of user/sys?
*  It seems to have exponentially gone up as n got bigger
 * Mean execution times for boards of size n*n:
 * n=5   .02s    across 5 executions
 * n=6   .15s    across 5 executions
 * n=7   1000s    across 1 executions
 * n=8   1500s    across 1 executions
 *
 * POSIX PROTIP: to measure execution time from BASH, use time program:
 * $ time java KnightTour 5
 *
 ***/


import java.io.*;
import java.util.*;


public class KnightTour
{
  public static void main( String[] args )
  {
    int n = 8;

    try {
      n = Integer.parseInt( args[0] );
    } catch( Exception e ) {
      System.out.println( "Invalid input. Using board size "
                          + n + "..." );
    }

    TourFinder tf = new TourFinder( n );

    //clear screen using ANSI control code
    System.out.println( "[2J" );

    //display board
    System.out.println( tf );

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for fixed starting location, use line below:
    tf.findTour( 2, 2, 1 );
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //for random starting location, use lines below:
    //int startX = (int) (n*Math.random())+2;
    //int startY = (int) (n*Math.random())+2;
    //tf.findTour( startX, startY, 1 );   // 1 or 0 ?  
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // PUSHING FARTHER...
    // Systematically attempt to solve from every position on the board?
    // We would need to do a for loop for y and a for loop for a startx and we were unable to do so with the time given
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  }//end main()

}//end class KnightTour


class TourFinder
{
  //instance vars
  private int[][] _board;
  private int _sideLength; //board has dimensions n x n
  private boolean _solved = false;

  //constructor -- build board of size n x n
  public TourFinder( int n )
  {
    _sideLength = n;

    //init 2D array to represent square board with moat
    _board = new int[n+4][n+4];

    //SETUP BOARD --  0 for unvisited cell
    //               -1 for cell in moat
    //---------------------------------------------------------
    for (int i=0; i<_board.length; i++){
	for(int j =0; j<_board.length; j++){
		if(i<2 || j<2 || i> _board.length-3 || j>_board.length -3){
			_board[i][j]=-1;
		}
}
}
    //---------------------------------------------------------

  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, then press ESC
    //emacs shortcut: M-x quoted-insert, then press ESC

    int i, j;
    for( i=0; i < _sideLength+4; i++ ) {
      for( j=0; j < _sideLength+4; j++ )
        retStr = retStr + String.format( "%3d", _board[j][i] );
      //"%3d" allots 3 spaces for each number
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void findTour(int x,int y,int moves) -- use depth-first w/ backtracking algo
   * to find valid knight's tour
   * @param x      starting x-coord
   * @param y      starting y-coord
   * @param moves  number of moves made so far
   **/
  public void findTour( int x, int y, int moves )
  {
    //delay(50); //slow it down enough to be followable

    //if a tour has been completed, stop animation
    if ( _solved ) System.exit(0);

    //primary base case: tour completed
    if ( moves==_sideLength*_sideLength+1 ) {
      _solved=true;
      System.out.println( this ); //refresh screen
      return;
    }
    //other base case: stepped off board or onto visited cell
    if ( _board[x][y]!=0) {
		return;
    }
    //otherwise, mark current location
    //and recursively generate tour possibilities from current pos
    else {

      //mark current cell with current move number
      _board[x][y] =moves;

      System.out.println( this ); //refresh screen

      //delay(1000); //uncomment to slow down enough to view

      /******************************************
       * Recursively try to "solve" (find a tour) from
       * each of knight's available moves.
       *     . e . d .
       *     f . . . c
       *     . . @ . .
       *     g . . . b
       *     . h . a .
      ******************************************/
      findTour(x-2,y+1,moves+1);
	findTour(x-1,y+2,moves+1);
	findTour(x+1,y+2,moves+1);
	findTour(x+2,y+1,moves+1);
	findTour(x+2,y-1,moves+1);
	findTour(x+1,y-2,moves+1);
	findTour(x-1,y-2,moves+1);
	findTour(x-2,y-1,moves+1);
	//given how similar they all look, i thinkt hat it is possible to do a for loop in a for loop from x-2 to x+2 with an embedded one with y-2-> y+2 excluding y to do this but thats no fun
      //If made it this far, path did not lead to tour, so back up...
      // (Overwrite number at this cell with a 0.)
        _board[x][y]=0;

      System.out.println( this ); //refresh screen
    }
  }//end findTour()

}//end class TourFinder
