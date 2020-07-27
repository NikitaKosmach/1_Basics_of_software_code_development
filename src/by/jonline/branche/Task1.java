package by.jonline.branche;

public class Task1 {
    /* 
     * 1. ���� ��� ���� ������������ (� ��������). ����������, ���������� �� 
     * ����� �����������, � ���� ��, �� ����� �� �� �������������.
     */
    public static void main(String[] args) {
        // Degree of triangle angle
        float angle1 = 0f;
        float angle2 = 45f;
        float triangleFullDegree = 180f;
        
        float angle3 = triangleFullDegree - (angle1 + angle2);
        boolean triangleExist = angle1 > 0 && angle2 > 0 && angle3 > 0;
        boolean rightTriangle = triangleExist && 
                                (angle1 == 90 || angle2 == 90 || angle3 == 90); 
        
        System.out.println("Branche. Task 1. Result:");
        System.out.println("Does triangle exist? " + triangleExist);
        System.out.println("Is it right triangle? " + rightTriangle);
    }
}
