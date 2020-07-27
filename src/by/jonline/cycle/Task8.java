package by.jonline.cycle;

import java.lang.Character;

public class Task8 {
    /* 
     * 8. Даны два числа. Определить цифры, входящие в запись как первого 
     * так и второго числа.
     */
    public static void main(String[] args) {
                
        int a = 84354;
        double b = 5.0;
                
        System.out.println("Cycle. Task 8. Result: ");
        String aDivededDigit = Task8.extractDigitFromNumber(a);
        String bDivededDigit = Task8.extractDigitFromNumber(b);
        System.out.println("A = " + aDivededDigit);
        System.out.println("B = " + bDivededDigit);
    }
    
    public static String extractDigitFromNumber(double input) {
        String fullStringNumber = String.valueOf(input);

        String divededDigit = " " + fullStringNumber + ": ";
        for (int i = 0; i < fullStringNumber.length(); i++) {
            char digit = fullStringNumber.charAt(i);
            if (digit != '.') {
                divededDigit = divededDigit + " " + Character.toString(digit);
            }
        }
        return divededDigit;
    }
    
}
