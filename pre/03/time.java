public class Time {

  public static void main(String[] args) {
    int hour = 22;
    int minute = 25;
    int second = 30;
    int secondsSinceMidnight = ((hour * 3600) + (minute * 60) + second);
    System.out.println("Time now: " + hour + ":" + minute + ":" + second);
    System.out.println("Seconds since midnight: " + secondsSinceMidnight);
    System.out.println("Seconds remaining in the day: " + ((24 * 3600) - secondsSinceMidnight));
    System.out.println("Percent of the day passed: "+ (secondsSinceMidnight * 100) / (24 * 3600));
    hour = 22;
    minute = 45;
    second = 20;
    int newTime = ((hour * 3600) + (minute * 60) + second);
    System.out.println(newTime - secondsSinceMidnight + " seconds have passed");
  }
}
