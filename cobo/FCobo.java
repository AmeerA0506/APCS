public class FCobo{
  public static String happy(String o){
    return "I'm sure " + o + " is really enjoying this lab!";
  }
  public static String sad(String o){
    return "I'm sure " + o + " is really hating this lab!";
  }
  public static boolean feeling(String o){
    int charcount=0;
    for(char e: o){
      int+=1;
    }
    if(charcount%2==0){
      return true;
    }
    else{
      return false;
    }
  }
  public static String vibes(String o){
    if(feeling(o)==true){
      return happy(o);
    }
    else{
      return sad(o);
    }
  }
  public static void main(String[] args){
    a= new FCobo();
    System.out.println(happy(Ameer));
    System.out.println(happy(Ben));
    System.out.println(sad(Ameer));
    System.out.println(sad(Ben));
    System.out.println(feeling(Ameer));
    System.out.println(feeling(Ben));
    System.out.println(vibes(Ameer));
    System.out.println(vibes(Ben));
    System.out.println(happy(MichaelK));
    System.out.println(sad(MichaelK));
    System.out.println(feeling(MichaelK));
    System.out.println(vibes(MichaelK));

  }
}
