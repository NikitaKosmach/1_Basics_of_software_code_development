package by.jonline.line_program;

import java.lang.Math; 

public class Task4 {
    /* 
     * 4. ���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � 
     * ������� � ����� ������). �������� ������� ������� � ����� ����� ����� � 
     * ������� ���������� �������� �����.
     */
    public static void main(String[] args) {
        double x = 123.321; // real number R of the form nnn.ddd
        
        double intPart = Math.floor(x); 
        double fractionalPart = Math.round((x - intPart) * 1000.0);
        intPart = intPart * 0.001;
        
        double result = fractionalPart + intPart;
        
        System.out.print("Line program. Task 4. Result: " + result);
    }

}
