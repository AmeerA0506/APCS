/**
(Do Not) Consume Arsenic:: Ameer Alnasser & Corina Chen with test cases from Thinker Gabriel Thompson
APCS pd6
HW41: Be Rational!
2021-12-1
time taken: .5hrs
**/
/**
DISCO:
protected seems like the best class for most variables, leaves very little to mess up in both directions
toString should not have parameters

QCC:
Visualizer is key, especially in mathematical situations in which there is a compiling. in one instance, we multiplied and divided a certain object and were wondering why the division was off. Unbeknownst to us at the time, it was because we multiplied first, then divided.

should the error message be before or after the output?
**/
public class Rational{
  protected int num;
  protected int dem;
  protected String output;
  public Rational(){
    num=0;
    dem=1;
  }
  public String toString(){
    output= num + "/" + dem;
    return output;
  }
  public Rational(int num2,int dem2){
    this();
    if(dem2 == 0){
      System.out.println("undefined, default constructor running instead");
    }
    else{
    num=num2;
    dem=dem2;
  }
  }
  public double floatValue(){
    double g= (double) num/dem;
    return g;
  }
  public void multiply(Rational factor){
    num = factor.num*num;
    dem = factor.dem*dem;
  }
  public void divide(Rational dvisor){
    if (divisor.num!=0){
    dem = dem*divisor.num;
    }
    else{
    System.out.println("undefined, returning dividend in untouched manner");
    }
    num = num*factor.dem;
  }

    public static int gcdER(int a, int b) {
        if (a == b) {
            return a;
        }
        if (a < b) {
            return gcdER(a, b - a);
        } else {
            return gcdER(a - b, b);
        }
    }
public void add(Rational addend){
  int b=dem;
  dem=dem*addend.dem;
  addend.dem=dem;
  num=num*addend.dem;
  addend.num=b*addend.num;
  num=addend.num+num;

}
public void subtract(Rational addend){
  int b=dem;
  dem=dem*addend.dem;
  addend.dem=dem;
  num=num*addend.dem;
  addend.num=b*addend.num;
  num=num-addend.num;
}
public void Simplify(){
  int gcd=gcdER(num,dem);
  num=num/gcd;
  dem=dem/gcd;
}
public Rational compareTo(Rational comparer){
int a=comparer.floatValue();
int b=floatValue();
return b-a;
}
  public static void main(String[] args){
    System.out.println("\ntoString() and constructor test cases:");
    Rational a = new Rational();
    System.out.println(a + " ...should be \"0 / 1\"");
    Rational b = new Rational(5, 2);
    System.out.println(b + " ...should be \"5 / 2\"");
    Rational c = new Rational(1, 0);
    System.out.println(c + " ...should yield error");

    System.out.println("\nfloatValue() test cases:");
    Rational d = new Rational(6, 3);
    System.out.println(d.floatValue() + " ...should be \"2.0\"");
    Rational e = new Rational(5, 3);
    System.out.println(e.floatValue() + " ...should be \"1.66666667\"");
    Rational f = new Rational(-18, 9);
    System.out.println(f.floatValue() + " ...should be \"-2.0\"");

    System.out.println("\nmultiply() test cases:");
    Rational g = new Rational(5, 4);
    Rational h = new Rational(6, 10);
    g.multiply(h);
    System.out.println(g + " ...should be \"30 / 40\"");
    Rational i = new Rational(5, 10);
    Rational j = new Rational();
    i.multiply(j);
    System.out.println(i + " ...should be \"0 / 10\"");

    System.out.println("\ndivide() test cases:");
    Rational k = new Rational(10, 3);
    Rational l = new Rational(6, 4);
    k.divide(l);
    System.out.println(k + " ...should be \"40 / 18\"");
    // This next test cases checks for how the class reacts to divison by 0 in the divide() function
    Rational m = new Rational(5, 5);
    Rational n = new Rational();
    m.divide(n);
    System.out.println(m + " ...should yield an error\n");
  }
}
