package by.jonline.line_program;

import java.lang.Math; 

public class Task2 {
    /* 
     * 2. Вычислить значение выражения по формуле 
     * (все переменные принимают действительные значения):
     * ((b + sqrt(b^2 + 4ac)) / 2a) - a^3 * c + b^-2
     */
    public static void main(String[] args) {
        double a = 2.0;
        double b = 3.2;
        double c = 5.2;
        
        double dividend = b + Math.sqrt(Math.pow(b, 2.0) + 4.0 * a * c); // 9.2
        double divider = 2.0 * a;                                        // 4
        double result = (dividend / divider) - Math.pow(a, 3.0) * c + 
                        Math.pow(b, -2.0);                               // -38.90...
        System.out.print("Line program. Task 2. Result: " + result);
    }
}
