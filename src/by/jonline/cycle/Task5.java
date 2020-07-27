package by.jonline.cycle;

import java.lang.Math;

public class Task5 {
    /* 
     * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, 
     * модуль которых больше или равен заданному е. Общий член ряда имеет вид:

     * an = (1/2^n) + (1/3^n)
     */
    public static void main(String[] args) {
        double eThreshold = 2E-7;
        int maxN = 100;
        
        double result = 0;
        System.out.print("Sequence: ");
        for (int n = 1; n <= maxN; n++) {
            double an = (1/Math.pow(2.0, n)) + (1/Math.pow(3.0, n));
            if (Math.abs(an) >= eThreshold) {
                result += an; 
            }
            System.out.println(an + " ");
        }
        System.out.println("Cycle. Task 5. Result: " + result);
    }
    
}
