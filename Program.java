// 1. Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("введите число: ");
        int i = scanner.nextInt();
        System.out.printf("Треугольное число: %d\n", enterTheNumber(i));
        scanner.close();
    }

    public static int enterTheNumber(int a) {
        return (a * (a + 1)) / 2;
    }
}