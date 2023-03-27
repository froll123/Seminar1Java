// 2. Вывести все простые числа от 1 до 1000
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите положительное число: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean theNumberIsPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    theNumberIsPrime = false;
                    break;
                }
            }
            if (theNumberIsPrime) {
                primes.add(i);
            }
        }
        System.out.println("простые числа: " + primes);
    }
}
