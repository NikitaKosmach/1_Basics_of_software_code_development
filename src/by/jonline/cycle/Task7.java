package by.jonline.cycle;

public class Task7 {
    /* 
     * 7. Для каждого натурального числа в промежутке от m до n вывести 
     * все делители, кроме единицы и самого числа. m и n вводятся с клавиатуры.
     */
    public static void main(String[] args) { 
        int m;
        int n;
        
        m = Task1.getIntFromConsole("Write minimum value m:");
        n = Task1.getIntFromConsole("Write maximum value n:");
        
        System.out.print("Cycle. Task 7. Result: ");
        for (int i = m; i <= n; i++) {
            System.out.println("\nFor " + i  + " dividers are ");
            for (int j = 2; j <i; j++) {
                if ((double) (i % j) == 0) {
                    System.out.print(j + " ");
                }
            }
        }
    }
    
}
