public class noX{
  //Given a string, compute recursively a new string where all the 'x' chars have been removed.
public String noX(String str) {
  if (str.length()==0){
    return "";
  }
  if (str.substring(0,1).equals("x")){
    return noX(str.substring(1));
  }
  return str.charAt(0)+noX(str.substring(1));
}
public static void main(String[] args) {
  System.out.println(noX("xaxb") + ", " + "ab" + ", " +noX("abc") + ", " + "abc" + ", " + noX("xx"), "");
}
}
