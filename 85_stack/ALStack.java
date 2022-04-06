// (FA)FSA -- Fang, Sophia, Ameer
// APCS Pd06
// HW 85 -- Pancakes
// 2022-03-30
// time spent: 0.5 hrs

public class ALStack<PANCAKE> implements Stack<PANCAKE> {

  private ArrayList<PANCAKE> _stack;

  public ALStack(){
    _stack=new ArrayList<PANCAKE>();
  }

  public int size() {
    return _stack.size();
  }

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty()
  {
    return size() == 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop()
  {
    return _stack.get(size() - 1);
  }

  //Pop and return top element of stack.
  public PANCAKE pop()
  {
    return _stack.remove(size() - 1);
  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x )
  {
    _stack.add(x);
  }


}
