package by.it.sc04_evening_tue_thu.sushchenja.lesson06;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
Новый способ ввода данных + поиск минимума

Текущая реализация:
Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.

Новая задача:
Программа вводит пять чисел с клавиатуры (через Enter) и выводит минимальное из них на экран.

Требования:
1. Программа должна считывать числа с клавиатуры.
2. Программа должна выводить строку, которая начинается на "Minimum = ".
3. Программа должна выводить строку, которая заканчивается минимальным из 5 введенных чисел.
*/

public class TaskB2 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());
        int e = Integer.parseInt(reader.readLine());
        if ((a<=b)&&(a<=c)&&(a<=d)&&(a<=e))
        System.out.println("Minimum = " +a);
        if ((b<a)&&(b<=c)&&(b<=d)&&(b<=e))
        System.out.println("Minimum = " +b);
        if ((c<=a)&&(c<=a)&&(c<=d)&&(c<=e))
        System.out.println("Minimum = " +c);
        if ((d<=a)&&(d<=b)&&(d<=c)&&(d<=e))
        System.out.println("Minimum = " +d);
        if ((e<=a)&&(e<=b)&&(e<=c)&&(e<=d))
        System.out.println("Minimum = " +e);
    }
}
