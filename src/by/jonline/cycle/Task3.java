package by.jonline.cycle;

import java.lang.Math;

public class Task3 {
    /* 
     * 3. Найти сумму квадратов первых ста чисел.
     */
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 100; i++) {
            result += Math.pow(i, 2);
        }
        System.out.println("Cycle. Task 3. Result: " + result);
    }
    
}
