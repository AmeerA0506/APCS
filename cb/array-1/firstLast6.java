//Given an array of ints, return true if 6 appears as either the first or last
//element in the array. The array will be length 1 or more.

public class firstLast6 {
  public static boolean firstLast6(int[] nums){
    if ( nums[0] == 6 || nums[nums.length - 1] == 6 ) {
      return true;
    }
    return false;
  }

  public static void main(String[] args) {
    int[] test = {1, 2, 6};
    System.out.println(firstLast6(test)); //returns true;
  }
}
