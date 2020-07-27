package by.jonline.branche;

import java.lang.Math;

public class Task5 {
    /* 
     * 5. Вычислить значение функции:
     *        [x^2 - 3x + 9, если x <= 3;
     * F(x) = {
     *        [1/(x^3 + 6),  если x > 3;
     */
    public static void main(String[] args) {
        //double x = Double.NaN;
        double x = 4; 
        double result;
        
        if (x <= 3.0) {
            result = Math.pow(x, 2.0) - (3.0 * x) + 9.0;
        } else {
            result = 1/(Math.pow(x, 3.0) + 6.0);
        }
            
        System.out.println("Branche. Task 5. Result: " + result);
    }
}
