public class array220{
public boolean array220(int[] nums, int index) {
    if(index>=nums.length-1){
    return false;
  }

  if(nums[index+1]==10*nums[index]){
    return true;
  }
  return array220(nums,index+1);
}

}
