package by.jonline.line_program;

import java.lang.Math; 

public class Task5 {
    /* 
     * 5. Дано натуральное число Т, которое представляет длительность прошедшего
     *  времени в секундах. Вывести данное значение длительности в часах, 
     *  минутах и секундах в следующей форме: ННч ММмин SSc
     */
    public static void main(String[] args) {
        int timeFullSeconds = 3670; 
        int secondsInHour = 3600;
        int secondsInMinute = 60;
        
        int timeHours = (int) Math.floor(timeFullSeconds / secondsInHour);
        int partTimeSeconds = timeFullSeconds - (timeHours * secondsInHour);
        int timeMinutes = (int) Math.floor(partTimeSeconds / secondsInMinute);
        int timeSeconds = partTimeSeconds - (timeMinutes * secondsInMinute);
        
        System.out.print("Line program. Task 5. Result: " +
                         timeHours + "h " + timeMinutes + 
                         "m " + timeSeconds + "s");
    }

}
