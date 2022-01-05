package hillel.course_bohdan.homework.hw1;

import java.util.Scanner;

/**
 * speed = distance / time
 */

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter adistance in meters and press Enter");
        double dis = scanner.nextInt();
        System.out.println("Please, enter a hours and press Enter");
        double hour = scanner.nextInt();
        System.out.println("Please, enter a minutes and press Enter");
        double min = scanner.nextInt();
        System.out.println("Please, enter a seconds and press Enter");
        double sec = scanner.nextInt();


        //double dis = 2500; //distance in meters
        //double hour = 5; //hours
        //double min = 56; //minutes
        //double sec = 23; //seconds

        double s = (((hour * 60) + min) * 60) + sec ; //all in sec
        double h = (((sec / 60) + min) / 60) + hour; //all in hour
        double km = dis / 1000; //distance in kilometres

        float mS = (float) (dis / s);
        float kmH = (float) (km / h);
        System.out.println("Your speed in meters/second is " + mS);
        System.out.println("Your speed in km/h is " + kmH);

        System.out.println("User: Zaklunnyi, added: 30.12.2021 11:49, resolved: 4.01.2022 21:17"); //info
    }
}
