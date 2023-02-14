/**
 * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры
 * могут быть заменены знаком вопроса, например 2? + ?5 = 69. Требуется
 * восстановить выражение до верного равенства. Предложить хотя бы
 * одно решение или сообщить, что его нет
 */

public class task_04 {
    public static void main(String[] args) {
        String equation = "2? + ?5 = 69";
        String[] equ = equation.trim().split(" ");
        // System.out.println(equ[0].charAt(0));   ==> 2

        // if (equ[0].charAt(0).equals("?") && equ[2].charAt(0).equals("?")) {
        //     int arg1 = Integer.parseInt(String.valueOf(equ[0].charAt(0)));
        //     int arg2 = Integer.parseInt(String.valueOf(equ[2].charAt(0)));
        //     if (equ[0].charAt(0).equals("?")) {
                
        //     }

        // } else if (equ[0].charAt(1).equals("?") && equ[2].charAt(1).equals("?")) {         //решил пока оставить
        //     int arg1 = Integer.parseInt(String.valueOf(equ[0].charAt(0)));
        //     int arg2 = Integer.parseInt(String.valueOf(equ[2].charAt(0)));

        // } else if (equ[0].charAt(0).equals("?") && equ[2].charAt(1).equals("?")) {

        // } else if (equ[0].charAt(1).equals("?") && equ[2].charAt(0).equals("?")) {

        // }
    }
}
