  import java.util.*;
public class Program {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i=0;i<10;i++) {
            int number = random.nextInt(10);
            numbers.add(number);
        }
        System.out.println(numbers);
    }
}