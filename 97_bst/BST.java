// Non-Men Alcoholics Anonymous: Nora Miller, Ameer Alnasser
// APCS pd6
// HW96 -- reverse engineering
// 2022-05-10w
// time spent: 2 hrs

/**
 * class BST
 * v1:partial
 * SKELETON
 * Implementation of the BINARY SEARCH TREE abstract data type (ADT)
 *
 * A BST maintains the invariant that, for any node N with value V,
 * L<V && V<R, where L and R are node values in N's left and right
 * subtrees, respectively.
 * (Any value in a node's left subtree must be less than its value,
 *  and any value in its right subtree must be greater.)
 *
 * This BST implementation only holds ints (its nodes have int cargo)
 */

public class BST
{

  //instance variables / attributes of a BST:
  TreeNode _root;

  /**
   * default constructor
   */
 BST()
  {
    _root=null;
  }

  /**
   * void insert( int )
   * Adds a new data element to tree.
   */
  public void insert( int newVal )
  {
    TreeNode newNode = new TreeNode( newVal );
    if(_root!=null){
    insert(_root,newNode);
    }
    else{
      _root=newNode;
    }
  }
    /*** YOUR IMPLEMENTATION HERE ***/

  //recursive helper for insert(int)
  public void insert( TreeNode stRoot, TreeNode newNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    TreeNode one,two;
        if (newNode.getValue()<stRoot.getValue()){
          if(stRoot.getLeft()==null){
          stRoot.setLeft(newNode);
        }
        else{
          one=stRoot.getLeft();
          insert(one,newNode);
        }
      }

    else{
      if(stRoot.getRight()==null){
      stRoot.setRight(newNode);
    }
    else{
      two=stRoot.getRight();
      insert(two,newNode);
    }
}
}


  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~v~~TRAVERSALS~~v~~~~~~~~~~~~~~~~~~~~~

  // each traversal should simply print to standard out
  // the nodes visited, in order

  //process root, recurse left, recurse right
  public void preOrderTrav()
  {
    preOrderTrav( _root );
  }
  public void preOrderTrav( TreeNode currNode )
    {
      System.out.println(currNode.getValue());
      if (currNode.getLeft() != null) {
        preOrderTrav(currNode.getLeft());
      }
      if(currNode.getRight() != null) {
        preOrderTrav(currNode.getRight());
      }
    }

  //recurse left, process root, recurse right
  public void inOrderTrav()
  {
    inOrderTrav(_root);
  }
  public void inOrderTrav( TreeNode currNode )
  {
    /*** YOUR IMPLEMENTATION HERE ***/
    if (currNode.getLeft() != null) {
      preOrderTrav(currNode.getLeft());
    }
    System.out.println(currNode.getValue());

    if(currNode.getRight() != null) {
      preOrderTrav(currNode.getRight());
    }

  }

  //recurse left, recurse right, process root
  public void postOrderTrav()
  {
  postOrderTrav(_root);
  }
  public void postOrderTrav( TreeNode currNode )
  {
    if (currNode.getLeft() != null) {
      preOrderTrav(currNode.getLeft());
    }
    if(currNode.getRight() != null) {
      preOrderTrav(currNode.getRight());
    }
    System.out.println(currNode.getValue());

  }

  //~~~~~~~~~~~~~^~~TRAVERSALS~~^~~~~~~~~~~~~~~~~~~~~~
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  /*****************************************************
     * TreeNode search(int)
     * returns pointer to node containing target,
     * or null if target not found
     *****************************************************/
    TreeNode search( int target )
    {
      return search2(_root,target);
    }
    TreeNode search2(TreeNode check, int target )
    {

      if(check==null||check.getValue()==target){
        return check;
      }
      else if(check.getValue()<target){
        return search2(check.getRight(),target);
      }
      else{
        return search2(check.getLeft(),target);
      }
    }

    /*****************************************************
     * int height()
     * returns height of this tree (length of longest leaf-to-root path)
     * eg: a 1-node tree has height 1
     *****************************************************/
    public int height()
    {
     return  height2(_root);
    }
    public int height2(TreeNode check)
    {
    	if(check.getRight()!=null&&check.getLeft()==null){
        return 1+height2(check.getRight());
      }
     else if(check.getLeft()!=null&&check.getRight()==null){
        return 1+height2(check.getLeft());
      }
     else if(check.getLeft()!=null&&check.getRight()!=null){
       if(height2(check.getLeft())>height2(check.getRight())){
         return height2(check.getLeft());
       }
       else{
        return 1+height2(check.getRight());
       }
     }
     else{
      return 1;
    }
}

    /*****************************************************
     * int numLeaves()
     * returns number of leaves in tree
     *****************************************************/
    public int numLeaves()
    {
      return numLeaves2(_root);
    }

      public int numLeaves2(TreeNode check) {

          if (check==null){
            return 0;
          }
          if (check.getLeft()==null&&check.getRight()==null) {
              return 1;
          }

          return numLeaves2(check.getLeft())+numLeaves2(check.getRight());
      }


      public void remove(TreeNode check){
        
      }
  //main method for testing
  public static void main( String[] args )
  {

    BST arbol = new BST();

          //PROTIP: sketch state of tree after each insertion
          //        ...BEFORE executing these.
          arbol.insert( 4 );
          arbol.insert( 2 );
          arbol.insert( 5 );
          arbol.insert( 6 );
          arbol.insert( 1 );
          arbol.insert( 3 );

          System.out.println( "\n-----------------------------");
          System.out.println( "pre-order traversal:" );
          arbol.preOrderTrav();

          System.out.println( "\n-----------------------------");
          System.out.println( "in-order traversal:" );
          arbol.inOrderTrav();

          System.out.println( "\n-----------------------------");
          System.out.println( "post-order traversal:" );
          arbol.postOrderTrav();

          System.out.println( "\n-----------------------------");

          System.out.println("testing height....");
          System.out.println(arbol.height() + " ... should be 2");

          System.out.println( "\n-----------------------------");
          System.out.println("testing search....");
          System.out.println(arbol.search(4).getValue());
          System.out.println(arbol.search(2).getValue());
          System.out.println(arbol.search(5).getValue());
          System.out.println(arbol.search(6).getValue());
          System.out.println(arbol.search(1).getValue());
          System.out.println(arbol.search(3).getValue());
          System.out.println(arbol.search(9));

          System.out.println( "\n-----------------------------");
          System.out.println("testing numLeaves....");
          System.out.println(arbol.numLeaves() + "... should be 3");

          BST a = new BST();

          a.insert( 4 );
          a.insert( 2 );
          a.insert( 5 );
          System.out.println(a.numLeaves() + "... should be 2");

          BST b = new BST();
          b.insert( 6 );
          b.insert( 3 );
          b.insert( 1 );
          System.out.println(b.numLeaves() + " ...should be 1");
}//end class
}
