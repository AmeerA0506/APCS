public class countX{
//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
public int countX(String str) {
  if(str.length()==0){
    return 0;
  }
  if(str.charAt(0)==120){
  return 1 + countX(str.substring(1,str.length()));
}
 return countX(str.substring(1,str.length()));
}
public static void main(String[] args) {
  System.out.println(countX("xxhixx") + ", " + 4 + ", " + countX("xhixhix") + ", " + 3 + ", " + countX("hi") + ", " + 0);
}
}
