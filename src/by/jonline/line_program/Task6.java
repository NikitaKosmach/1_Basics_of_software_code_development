package by.jonline.line_program;

public class Task6 {
    /* 
     * 6. Для данной области составить линейную программу, которая печатает true,
     * если точка с координатами (х, у) принадлежит закрашенной области, и 
     * false — в противном случае: 
     */
    public static void main(String[] args) {
        
        int x = 5;
        int y = 0;
        
        boolean result = ((Task6.checkInRange(x, -4, 4) && 
                           Task6.checkInRange(y, -3, 0)) || 
                          (Task6.checkInRange(x, -2, 2) && 
                           Task6.checkInRange(y, 0, 4)));
                           
        String stringResutl = "does not belong";
        if (result) {
            stringResutl ="belongs";
        }
        
        System.out.println("Line program. Task 6. Result: " + result + "." +
                           "\nXY point " + stringResutl + " to area.");
    }

    private static boolean checkInRange(int x, int minValue, int maxValues) {
        return x >= minValue && x <= maxValues;
    }

}
