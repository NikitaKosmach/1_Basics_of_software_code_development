package by.jonline.branche;

public class Task3 {
    /* 
     * 3. ���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). 
     * ����������, ����� �� ��� ����������� �� ����� ������
     */
    public static void main(String[] args) {
        double x1 = 1;
        double y1 = 1;
        double x2 = 2;
        double y2 = 2;
        double x3 = 3;
        double y3 = 3;

        boolean result = (x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1);
        System.out.println("Branche. Task 3. Result: " + result);
        System.out.println("Do three points lie on one straight line? " + result);
    }
    
}
