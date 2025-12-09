import java.util.Arrays;
​
public class Kata{
    public static int sumDigits(int number){
        return Arrays.stream(String.valueOf(Math.abs(number)).split(""))
                  .mapToInt((c) -> c.charAt(0) - 48)
                  .reduce(0, Integer::sum);
  }
}