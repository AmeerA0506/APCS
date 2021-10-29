

public class Rof{
  static String fenceF(int posts){
    String output="";
    if (posts ==0){
      return " ";
    }
    else{
      for (int counter=1;counter<posts; counter+=1){
        output+="|--";
      }
      output+="|";
    return output;
  }
    }
static String reverseF(String s){
String output="";
  for (int amon=0;amon<(s.length());amon+=1){
    output+=s.substring((s.length()-(amon+1)),(s.length()-(amon)));
  }
return output;
}
static String reverseR(String s){
  String output="";
  if (s.length()==1){
    System.out.println(output);
  }
  else{
  output+=s.substring((s.length()-1),(s.length()));
  reverseR(s.substring(0,(s.length()-1)));
}
return output;
}
public static void main(String[] args){

  System.out.println(fenceF(0));
  System.out.println(fenceF(1));
  System.out.println(fenceF(2));
  System.out.println(reverseF("stressed"));
System.out.println(reverseR("stressed"));

}

}
