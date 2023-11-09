package guru.qa;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {//Арифметические операторы
        byte a = 56;
        byte b = -45;


        System.out.println("Арифметические операторы: \n");
        int sum = a + b;
        int subtr = b - a;
        int multipl = b * a;
        int divis = a / b;
        int rem = a % b;
        System.out.println("Сумма = " + sum);
        System.out.println("Разность = " + subtr);
        System.out.println("Умножение = " + multipl);
        System.out.println("Деление = " + divis);
        System.out.println("Остаток от деления = " + rem);

        System.out.println("\nОператоры сравнения: \n");
        boolean q = a == b;
        boolean w = a != b;
        boolean e = a > b;
        boolean r = a < b;
        boolean t = a >= b;
        boolean y = a <= b;
        System.out.println("Равенство = " + q);
        System.out.println("Неравенство = " + w);
        System.out.println("Больше = " + e);
        System.out.println("Меньше = " + r);
        System.out.println("Меньше или равно = " + t);
        System.out.println("Больше или равно = " + y);

        System.out.println("\nЛогические операторы: \n");
        boolean tr = true;
        boolean fl = false;
        System.out.println("AND = " + (tr&&fl));
        System.out.println("OR = " + (tr||fl));
        System.out.println("NONE = " + !(tr&&fl));


        byte x = Byte.MAX_VALUE;
        byte c =  2;
        byte summ = (byte) (x + c);
        System.out.println("Переполнение = " + summ);

        System.out.println("\nВычисления комбинаций типов данных");
        int o = 5;
        double k = 2.5;
        System.out.println("Сумма = " + (o+k));
        System.out.println("Разность = " + (k-o));
        System.out.println("Умножение = " + (o*k));
        System.out.println("Деление = " + (k/o));


    }
}