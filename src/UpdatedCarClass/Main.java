package UpdatedCarClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //8.1
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter License Number: ");
        String licenseNumber = scanner.nextLine();

        System.out.print("Enter cc: ");
        int engineCC = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Mileage: ");
        int mileage = scanner.nextInt();
        scanner.nextLine();
        Car car1 = new Car(licenseNumber,engineCC,mileage);

        //8.2
        System.out.print("Enter License Number: ");
        licenseNumber = scanner.nextLine();

        System.out.print("Enter cc: ");
        engineCC = scanner.nextInt();
        scanner.nextLine();


        Car car2 = new Car(licenseNumber,engineCC);

        //8.3
        System.out.println("what mileage do you want car2 to have? ");
        mileage = scanner.nextInt();
        scanner.nextLine();
        car2.setMileage(mileage);
        //8.4
        car1.print();
        car2.print();



    }
}