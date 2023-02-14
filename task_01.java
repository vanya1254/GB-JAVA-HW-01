import java.util.stream.IntStream;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!
 * (произведение чисел от 1 до n)
 */

public class task_01 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        int facN = 1;

        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;                                                     // заполняет массив числами от 1 до n
        }
        int sum = IntStream.of(arr).sum();                                      // считает сумму элементов массива
        System.out.printf("Сумма от 1 до %d = %d", n, sum);

        System.out.println();

        for (int i = 1; i <= n; i++) {
            facN *= i;                                                          // считает факториал числа n
        }
        System.out.printf("Факториал от 1 до %d = %d", n, facN);
    }
}