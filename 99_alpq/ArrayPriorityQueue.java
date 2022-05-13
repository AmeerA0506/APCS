// National Security Agency :: Nora Miller, Sophia Eiden, Ameer Alnasser
// APCS pd6
// HW99: Some Are More Equal Than Others, Codified
// 2022-05-13
import java.util.ArrayList;
public class ArrayPriorityQueue implements PriorityQueue{
  public ArrayList<Integer> _container;
  public int min;
  public ArrayPriorityQueue(){
    _container=new ArrayList<Integer>();
     min=10;
  }
  public void add(int x){
    _container.add(x);
    if(x<min){
      min=x;
    }
  }
  public boolean isEmpty(){
    return (_container.size()==0);
  }
  public int peekMin(){
    return min;
  }
  public int removeMin(){
    _container.remove(_container.get(min));
    return min;
  }
  public String toString(){
    return _container.toString();
  }
  public static void main(String[] args){
    ArrayPriorityQueue x=new ArrayPriorityQueue();
//  x.add(0);
//    x.add(1);
//    x.add(3);
//    x.add(7);
    x.add(11);
    x.add(12);
    x.add(13);

    System.out.println( x.peekMin());
    // System.out.println(x);
    // x.removeMin();
    // System.out.println(x);
    // x.removeMin();
    // System.out.println(x);
    // x.removeMin();
    // System.out.println(x);
    // x.removeMin();
    // System.out.println(x);


  }
}
