// (FA)FSA: Fang, Sophia, Ameer
// APCS pd06
// HW 91: DEQUE THE HALLS
// 2022-04-13
// time spent: 0.7 hrs

public class DequeDriver{
public static void main(String[] args)
{
    MyDeque<String> test = new MyDeque<String>();

    System.out.println("Empty? " + test.isEmpty());

    test.addFirst("Fang");
    test.addFirst("Sophia");
    test.addLast("Ameer");
    System.out.println("Empty? " + test.isEmpty());
    System.out.println("Size: " + test.size());

    System.out.println(test.peekFirst());
    System.out.println(test.peekLast());
    System.out.println("Size: " + test.size());

    test.removeFirst();
    System.out.println(test.peekFirst());
    System.out.println(test.peekLast());
    System.out.println("Size: " + test.size());

    test.removeLast();
    System.out.println(test.peekFirst());
    System.out.println(test.peekLast());
    System.out.println("Size: " + test.size());

    test.removeLast();
    System.out.println(test.peekFirst());
    System.out.println(test.peekLast());
    System.out.println("Size: " + test.size());
}
}
