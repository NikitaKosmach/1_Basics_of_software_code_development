package by.jonline.cycle;

public class Task7 {
    /* 
     * 7. ��� ������� ������������ ����� � ���������� �� m �� n ������� ��� 
     * ��������, ����� ������� � ������ �����. m � n �������� � ����������
     */
    public static void main(String[] args) { 
        
        int m = Task1.getIntFromConsole("Write minimum value m:");
        int n = Task1.getIntFromConsole("Write maximum value n:");
        
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
