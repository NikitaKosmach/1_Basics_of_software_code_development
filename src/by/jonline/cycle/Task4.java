package by.jonline.cycle;

public class Task4 {
    /* 
     * 4. Составить программу нахождения произведения квадратов первых двухсот 
     * чисел
     */
    public static void main(String[] args) {
        double result = 1;
        for (int i = 1; i <= 200; i++) {
            if (result == Double.POSITIVE_INFINITY) {
                System.out.println("Limit of double type was exiting result == " + result);
                break;
            } else {
                result *= Math.pow(i, 2);
            }
            
        }
        System.out.println("Cycle. Task 4. Result: " + result);
    }
    
}
