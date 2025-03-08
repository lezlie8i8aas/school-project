import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      int number = (int) (Math.random() * 10);
      numbers.add(number);
    }
    System.out.println(numbers);
  }
}
