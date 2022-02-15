public class sumDigits{
public int sumDigits(int n) {
  if(n<10){
    return n;
  }
  return n%10 + sumDigits((n-n%10)/10);
} 
}
