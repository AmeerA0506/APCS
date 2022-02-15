public class countHi{
//Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.
public int countHi(String str) {
  if(str.length()<2){
    return 0;
  }
  if(str.substring(0,2).equals("hi")){
  return 1 + countHi(str.substring(1,str.length()));
}
 return countHi(str.substring(1,str.length()));
}
}
