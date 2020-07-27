package by.jonline.branche;

import java.lang.Math;

public class Task2 {
    /* 
     * 2. Найти max{min(a, b), min(c, d)}
     */
    public static void main(String[] args) {
        double a = 5.0;
        double b = 6.0;
        double c = 7.0;
        double d = 10.0;

        double result = Math.max(Math.min(a, b), Math.min(c, d));
        System.out.println("Branche. Task 2. Result: " + result);
    }

}
