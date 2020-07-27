package by.jonline.line_program;

import java.lang.Math; 

public class Task3 {
    /* 
     * 3. Вычислить значение выражения по формуле 
     * (все переменные принимают действительные значения):
     * ((sin(x) + cos(y))/cos(x) - sin(y)) * tg(x*y)
     */
    public static void main(String[] args) {
        double x = 2.0;
        double y = 3.2;
        
        double dividend = Math.sin(x) + Math.cos(y); 
        double divider = Math.cos(x) - Math.sin(y);
        double result = (dividend / divider) * Math.tan(y*x); 
        System.out.print("Line program. Task 3. Result: " + result);
    }

}
