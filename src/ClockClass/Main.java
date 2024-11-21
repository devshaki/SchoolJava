package ClockClass;

public class Main {
    public static void main(String[] args) {
        //4.1
        System.out.println("building a clock!");
        Clock c1 = new Clock(23,59,59);
        //4.2
        c1.showClock();
        //4.3
        System.out.println("moving the clock 2 seconds forwards!");
        c1.tick(2);
        //4.4
        System.out.println("the Clock's new time:");
        c1.showClock();
        //4.5
        System.out.println("Resetting the clock");
        c1.resetClock();
        //4.6
        System.out.println("clock after reset");
        c1.showClock();
    }
}
