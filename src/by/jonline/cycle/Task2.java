package by.jonline.cycle;

public class Task2 {
    /* 
     * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
     *     [x, x > 2
     * y = {
     *     {-x, x <= 2
     */
    public static void main(String[] args) {
        double a = 0;
        double b = 5;
        double h = 0.1;
        double x = a;
        
        System.out.println("Cycle. Task 2. Result: ");
        System.out.println("Y           X");
        double y;
        while (x <= b) {
            if (x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println(x + "          " + y);
            x += h;
        }
    }
    
}
