/**
Not Chewing Around :: Ameer Alnasser, Corina Chen, Nada Hameed (with the GUDFAMness of Sophia and Gabriel)
APCS
HW26::For Loops and string edits!!
2021-10-28
time taken:1.3hr

DISCO:
need to do String.length() to return the int value of length

QCC:
is there a shorter way to reverse a string?

**/

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
  if (s.length()==0){
    return output;
  }
  else{
    output = s.substring((s.length()-1),(s.length()))+ reverseR(s.substring(0,(s.length()-1)));

}
return output;
}
public static void main(String[] args){

  System.out.println(fenceF(0));
  System.out.println(fenceF(1));
  System.out.println(fenceF(2));
  System.out.println(reverseF("stressed dog"));
  System.out.println(reverseR("stressed dog"));

}

}
