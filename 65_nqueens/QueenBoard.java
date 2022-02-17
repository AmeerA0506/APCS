// BA Mitzvah :: Ameer Alnasser, Ben Belotser, Michael Kamela
// APCS pd6
// HW65 -- How Many Queens Can a Thinker Place, If a Thinker Can Place Queens...
// 2022-02-16w
// time spent: 1.0 hrs

/***
 * class QueenBoard
 * Generates solutions for N-Queens problem.
 * USAGE:
 * 1. Peruse. Transcribe your KtS verbiage into block comments preceding each method where necessary.
 * 2. Implement solver method.
 */

public class QueenBoard
{

  private int[][] _board;

  public QueenBoard( int size )
  {
    _board = new int[size][size];
  }


  /***
   * precondition: board is filled with 0's only.
   * postcondition:
   * If a solution is found, board shows position of N queens,
   * returns true.
   * If no solution, board is filled with 0's,
   * returns false.
   */
  public boolean solve()
  {
    boolean output = false;
    if (solveH(0)==true){
      printSolution();
      output=true;
    }
    return output;
  }


  /**
   *Helper method for solve.
   */
  private boolean solveH( int col )
  {
    if (col == _board.length) {
    return true;
}

for (int row = _board.length; row >0; row--) {
    if (addQueen(row, col)) {
        if (solveH(col + 1) == true) {
            return true;
        }
        removeQueen(row, col);
    }
}
    return false;
  }


  public void printSolution()
  {
    String output="";
    /** Print board, a la toString...
        Except:
        all negs and 0's replaced with underscore
        all 1's replaced with 'Q'
    */
    for (int[] row: _board) {
     for (int square: row) {
       if(square<1){
         output+="_\t";
       }
       else{
         output+="Q\t";
       }
      }
      System.out.println(output);
      System.out.println();
}
System.out.println();
}

  //================= YE OLDE SEPARATOR =================

  /***
   * adds a queen, all blocks being hit by the queen become subtracted by 1 so we know it cannot take in a queen
   * precondition: column must be 0 as we are working from left to right. also it must be within the grid
   * postcondition: Queen will be placed if it can, returns true. if it cant be place return falswe.
   */
  private boolean addQueen(int row, int col)
  {
    if(_board[row][col] != 0){
      return false;
    }
    _board[row][col] = 1;
    int offset = 1;
    while(col+offset < _board[row].length){
      _board[row][col+offset]--;
      if(row - offset >= 0){
        _board[row-offset][col+offset]--;
      }
      if(row + offset < _board.length){
        _board[row+offset][col+offset]--;
      }
      offset++;
    }
    return true;
  }


  /***
   * Removes queen, makes all blocks formerly attacked by it +1
   * precondition: must be within border lengths
   * postcondition: return false if there is no queen, then return true if there is.
   */
  private boolean removeQueen(int row, int col){
    if ( _board[row][col] != 1 ) {
      return false;
    }
    _board[row][col] = 0;
    int offset = 1;

    while( col+offset < _board[row].length ) {
      _board[row][col+offset]++;
      if( row - offset >= 0 ) {
        _board[row-offset][col+offset]++;
      }
      if( row + offset < _board.length ) {
        _board[row+offset][col+offset]++;
      }
      offset++;
    }
    return true;
  }


  /***
   * Prints out the board
   * board must be already initialized
   * postcondition: it loks ncie :)
   */
  public String  toString()
  {
    String ans = "";
    for( int r = 0; r < _board.length; r++ ) {
      for( int c = 0; c < _board[0].length; c++ ) {
        ans += _board[r][c]+"\t";
      }
      ans += "\n";
    }
    return ans;
  }


  //main method for testing...
  public static void main( String[] args )
  {
    QueenBoard b = new QueenBoard(5);
    System.out.println(b);
    /** should be...
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
       0	0	0	0	0
    */

    b.addQueen(3,0);
    b.addQueen(0,1);
    System.out.println(b);
    /** should be...
       0	1	-1	-2	-1
       0	0	-2	0	0
       0	-1	0	-1	0
       1	-1	-1	-1	-2
       0	-1	0	0	0
    */

    b.removeQueen(3,0);
    System.out.println(b);
    /** should be...
       0	1	-1	-1	-1
       0	0	-1	0	0
       0	0	0	-1	0
       0	0	0	0	-1
       0	0	0	0	0
    */

  }

}//end class
