package by.jonline.cycle;

import java.io.*;

public class Task1 {
    /* 
     * 1. Напишите программу, где пользователь вводит любое целое положительное 
     * число. А программа суммирует все числа от 1 до введенного пользователем 
     * числа.
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
        
        /* int inputValue = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println(outputPhrase);
                Scanner myScanner = new Scanner(System.in);
                inputValue = myScanner.nextInt();
                myScanner.close();
                validInput = true;
            } catch (Exception  e) {
                System.out.println("Invalid input data. Use only integer value.");
            }
        }
        return inputValue;*/
        
        int inputValue = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println(outputPhrase);
                BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
                String inputLine  =  is.readLine();
                inputValue = Integer.valueOf(inputLine);
                validInput = true;
            } catch (Exception  e) {
                System.out.println("Invalid input data. Use only integer value.");
            }
        }
        return inputValue;
    }
    
}
