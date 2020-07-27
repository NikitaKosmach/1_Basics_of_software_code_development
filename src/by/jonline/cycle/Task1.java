package by.jonline.cycle;

//import java.io.*;
import java.util.Scanner;

public class Task1 {
    /* 
     * 1. Напишите программу, где пользователь вводит любое целое положительное 
     * число. А программа суммирует все числа от 1 до введенного пользователем числа.
     */
    public static void main(String[] args) {
        int maxNumber = Task1.getIntFromConsole("Write max length of sequence: ");

        int result = 0;
        for (int i = 1; i <= maxNumber; i++) {
            result += i;
        }
        
        System.out.println("Cycle. Task 1. Result: " + result);
    }
    
    public static int getIntFromConsole(String outputPhrase) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int inputValue = 0;
        boolean validResult = false;
        
        do {
            System.out.println(outputPhrase);
            if (sc.hasNextInt()) {
                inputValue = sc.nextInt();
                if (inputValue > 0) {
                    validResult = true;
                } else {
                    System.out.println("Invalid input data. Use only integer value more than 0.");
                }
            } else {
                System.out.println("Invalid input data. Use only integer value more than 0.");
                sc.next();
            }
        } while (!validResult);
        
        return inputValue;
    }
    
}
