public class NodeQueue<QUASAR> implements Queue<QUASAR>{

  LLNode<QUASAR> line;

  public NodeQueue(){
    line=new LLNode<QUASAR>(null,null);
  }

  public NodeQueue(QUASAR x){
    line=new LLNode<QUASAR>(x,null);
  }
//
  public QUASAR dequeue(){
    LLNode<QUASAR> tmp=line; //phosia
    QUASAR output=peekFront();//phosia
    if(isEmpty()){
    return null;
  }
    if(tmp.getNext()==null){ //phosia
      tmp=new LLNode(null,null);//
      return output;
    }
    while(tmp.getNext().getNext()!=null){
      tmp=tmp.getNext();
    }
    tmp.setNext(null);
    return output;
  }
// v,w,x,y,z
  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
    if(isEmpty()){
      line=new LLNode<QUASAR>(x, null);
    }
    line=new LLNode<QUASAR>(x, line);
  }
  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
    return (line.getCargo()==null);
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
    LLNode<QUASAR> tmp=line; //phosia
    if(isEmpty()){
      return null;
    }
    while(tmp.getNext()!=null){
      tmp=tmp.getNext();
    }
    QUASAR output=tmp.getCargo();
    return output;
    }

  public String toString(){
    String output="";
    LLNode<QUASAR> tmp=line;
    while(tmp.getNext()!=null){
      output+=tmp.getCargo()+"<-";
      tmp=tmp.getNext();
    }
    output+=tmp.getCargo();
    return output;
  }

  public class LLNode<QUASAR>
  {
    //instance vars
    private QUASAR _cargo;
    private LLNode<QUASAR> _nextNode;

    // constructor
    public LLNode( QUASAR value, LLNode<QUASAR> next )
    {
      _cargo = value;
      _nextNode = next;
    }


    //--------------v  ACCESSORS  v--------------
    public QUASAR getCargo()
    {
      return _cargo;
    }

    public LLNode<QUASAR> getNext()
    {
      return _nextNode;
    }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public QUASAR setCargo( QUASAR newCargo )
    {
      QUASAR foo = getCargo();
      _cargo = newCargo;
      return foo;
    }

    public LLNode<QUASAR> setNext( LLNode newNext )
    {
      LLNode<QUASAR> foo = getNext();
      _nextNode = newNext;
      return foo;
    }
    //--------------^  MUTATORS  ^--------------


    // override inherited toString
    public String toString()
    {
      return (String)_cargo;
    }
  }//end class LLNode

  public static void main(String[] args){
    NodeQueue fangMeanie= new NodeQueue("3");
    System.out.println(fangMeanie);
    fangMeanie.enqueue("Ameer");
    System.out.println(fangMeanie);
    fangMeanie.enqueue("Phosia");
    System.out.println(fangMeanie);
    fangMeanie.dequeue();
    System.out.println(fangMeanie);
    fangMeanie.dequeue();
    System.out.println(fangMeanie);
    fangMeanie.dequeue();
    System.out.println(fangMeanie);
  }
}
