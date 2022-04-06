public class IntCheck{
 public static boolean moop(){
  Integer x = new Integer(3);
  int y = 3;
  return x==y;
 }
 public static boolean map(){
  Integer x = new Integer(3);
  Integer y = 3;
  return x==y;
 }
 public static boolean boop(){
  Integer x = new Integer(3);
  int y = 3;
  return x.equals(y);
 }
 public static boolean zoop(){
  Integer Y = 3;
  int y = 3;
  return Y.equals(y);
 }
 public static boolean zap(){
  Integer Y = 3;
  int y = 3;
  return Y==y;
 }
 public static void main(String[] args){
   System.out.println(moop());
   System.out.println(map());
   System.out.println(boop());
   System.out.println(zoop());
   System.out.println(zap());


 }
}
