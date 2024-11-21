package CarClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //2.1
        System.out.println("building car1");
        Car car1 = new Car();
        //2.2
        System.out.println("car1's info");
        System.out.println((car1.toString()));
        //2.3
        boolean validInput = false;
        int toAcc = 0;
        System.out.println("how much kph do you want to");
        do {
            if (scanner.hasNextInt()) {
                toAcc = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an number");
                scanner.next();
            }
        } while (!validInput);
        for(int i = 0;i<toAcc;i++){car1.accelerate();}
        //2.4
        System.out.println("car1's new info after acceleration");
        System.out.println(car1.toString());
        //2.5
        System.out.println("decelerating 2 kph");
        car1.decelerate();
        car1.decelerate();
        //2.6
        System.out.println("car1's new info");
        System.out.println(car1.toString());
        //2.7
        System.out.println("stopping car1");
        car1.stop();
        System.out.println(car1.toString());

    }
}
