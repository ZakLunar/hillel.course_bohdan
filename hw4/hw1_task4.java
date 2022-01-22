package git.homework.hw4;

import java.util.Scanner;

public class hw1_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter adistance in meters and press Enter");
        double m = scanner.nextInt();
        System.out.println("Please, enter a hours and press Enter");
        double hour = scanner.nextInt();
        System.out.println("Please, enter a minutes and press Enter");
        double min = scanner.nextInt();
        System.out.println("Please, enter a seconds and press Enter");
        double sec = scanner.nextInt();


        double s = seconds(hour, min, sec); //all in seconds
        double h = hours(hour, min, sec); //all in hours
        double km = kilometers(m); //distance in kilometres

        float mS = metersOnSeconds(m, s);
        float kmH = kilometersOnHours(km, h);
        System.out.println("Your speed in meters/second is " + mS);
        System.out.println("Your speed in km/h is " + kmH);
    }
    //================all in seconds======================
    static double seconds (double hour, double min, double sec){
        return (((hour * 60) + min) * 60) + sec;
    }
    //==================all in hours======================
    static double hours (double hour, double min, double sec) {
        return (((sec / 60) + min) / 60) + hour;
    }
    //================distance in kilometres==============
    static double kilometers (double x){
        return x / 1000;
    }
    //=================meters/second======================
    static float metersOnSeconds(double dis, double s){
        return (float) ((float) dis / s);
    }
    //======================km/h==========================
    static float kilometersOnHours(double km, double h){
        return (float) ((float) km / h);
    }
}
