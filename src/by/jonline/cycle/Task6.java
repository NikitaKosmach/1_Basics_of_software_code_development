package by.jonline.cycle;

public class Task6 {
    /* 
     * 6.������� �� ����� ������������ ����� ��������� � �� ���������� 
     * ������������� � ������ ����������.
     */
    public static void main(String[] args) {
                
        System.out.println("Cycle. Task 6. Result: ");
        System.out.println("int  char");
        
        for (int i = ' '; i <= 127; i++) {
            char result = (char) i;
            System.out.println(i + "       " + result);
        }
        
        for (int i = 160; i <= 187; i++) {
            char result = (char) i;
            System.out.println(i + "       " + result);
        }
    }
    
}
