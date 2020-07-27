package by.jonline.branche;

public class Task4 {
    /* 
     * 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
     * Определить, пройдет ли кирпич через отверстие.
     */
    public static void main(String[] args) {
        double A = 2;
        double B = 4;
        double x = 2;
        double y = 1.5;
        double z = 5;

        boolean result;
        if (A >= x) {
            result = (B >= y) || (B >= z); 
        } else if (A >= y) {
            result = (B >= x) || (B >= z);
        } else if (A >= z) {
            result = (B >= x) || (B >= y);
        } else {
            result = false;
        }
            
        System.out.println("Branche. Task 4. Result: " + result);
        System.out.println("Does a brick fit? " + result);
    }
    
}
