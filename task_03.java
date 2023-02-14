/**
 * Реализовать простой калькулятор
 */

public class task_03 {
    public static void main(String[] args) {
        String mathOperation = "5 - 1";
        String[] mathOper = mathOperation.trim().split(" ");
        int arg1 = Integer.parseInt(mathOper[0]);
        String oper = String.valueOf(mathOper[1]);
        int arg2 = Integer.parseInt(mathOper[2]);
        System.out.printf("%s = ", mathOperation);

        calc(arg1, oper, arg2);
    }

    public static void calc(int arg1, String oper, int arg2) {

        if (oper.equals("/")) {
            System.out.println(arg1 / arg2);
        } else if (oper.equals("*")) {
            System.out.println(arg1 * arg2);
        } else if (oper.equals("+")) {
            System.out.println(arg1 + arg2);
        } else if (oper.equals("-")) {
            System.out.println(arg1 - arg2);
        }
    }
}
