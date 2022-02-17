public class array11{
  //Given an array of ints, compute recursively the number of times that the value 11 appears in the array. We'll use the convention of considering only the part of the array that begins at the given index. In this way, a recursive call can pass index+1 to move down the array. The initial call will pass in index as 0.
<<<<<<< HEAD
public static int array11(int[] nums, int index) {
=======
public int array11(int[] nums, int index) {
>>>>>>> e0787a363aad97640d06ce38b9422ff8fb6487f8
  if(index==nums.length){
    return 0;
  }
  if(nums[index]==11){
    return 1+array11(nums,index+1);
  }
  return array11(nums,index+1);
}
public static void main(String[] args) {
  int[] apple = new int[3];
  apple[0] = 1;
  apple[1] = 2;
  apple[2] = 11;
  System.out.println(array11(apple, 0)+ ", "+ 1);
}
}
