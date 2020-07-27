package by.jonline.branche;

public class Task3 {
    /*
     * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они
     * расположены на одной прямой.
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
