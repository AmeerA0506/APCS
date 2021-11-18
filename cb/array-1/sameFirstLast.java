//Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.

public class sameFirstLast{
public static boolean sameFirstLast(int[] nums) {
  if ((nums.length>0) && (nums[0]==nums[nums.length-1]))
  {return true;}
  return false;
}
    public static void main(String[] args) {
    System.out.println(sameFirstLast([1, 2, 3]); //false
    System.out.println(sameFirstLast([1, 2, 3, 1]); // true
    System.out.println(sameFirstLast([1, 2, 1]); // true
  }
                       }
