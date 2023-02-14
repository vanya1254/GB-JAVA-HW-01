import java.util.Arrays;

/**
 * Вывести все простые числа от 1 до 1000
 */

public class task_02 {
    public static void main(String[] args) {
        int[] arrSimple = new int[168];
        int index = 0;
        for (int i = 2; i <= 1000; i++) {
            if (checkSimple(i)) {
                arrSimple[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(arrSimple));
    }

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
    }

    // public static void main(String[] args) {
    // int[] arrSimple = new int[168];
    // int counter = 0;
    // int div = 2;
    // boolean flag = true;
    // int index = 0;

    // for (int i = 2; i <= 1000; i++) {
    // while (counter <= 2) {
    // if (i % div == 0) counter ++;
    // if (counter == 2 && div != i) flag = false;                              // не заработало
    // div++;
    // }
    // counter = 0;
    // div = 2;
    // if (flag) {
    // arrSimple[index] = i;
    // index++;
    // }
    // else continue;
    // }

    // System.out.println(Arrays.toString(arrSimple));
    // }
}
