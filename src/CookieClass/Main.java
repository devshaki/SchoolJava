package CookieClass;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2.1
        Cookie cookie1 = new Cookie();
        Cookie cookie2 = new Cookie();
        Cookie cookie3 = new Cookie();

        Scanner scanner = new Scanner(System.in);

        // 2.2:
        System.out.println("enter info for cookie 1");
        buildCookie(scanner,cookie1);
        //2.3
        System.out.println("enter info for cookie 2");
        buildCookie(scanner,cookie2);

        //2.4 (func)
        //2.5
        System.out.println("Cookie1's info:");
        cookie2String(cookie1);
        System.out.println("Cookie2's info:");
        cookie2String(cookie2);
        //2.6
        cookie1.setSuger(cookie1.getSuger()+10);
        //2.7
        System.out.println("Cookie1's info:");
        cookie2String(cookie1);
        System.out.println("Cookie2's info:");
        cookie2String(cookie2);
        //2.8
        cookie2 = cookie1;
        //2.9
        cookie2.setEggCount(cookie2.getEggCount()-1);
        //2.10
        System.out.println("Cookie1's info:");
        cookie2String(cookie1);
        System.out.println("Cookie2's info:");
        cookie2String(cookie2);

    }
    //2.2

    public static void buildCookie(Scanner scanner,Cookie cookie)
    {
        boolean hasGluten = false;
        boolean validInput = false;
        int eggCount =-999;
        int sugar = -999;
        int flour = -999;
        System.out.println("Does it have gluten? (true/false)");
        do {
            if (scanner.hasNextBoolean()) {
                hasGluten = scanner.nextBoolean();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter true or false");
                scanner.next();
            }
        } while (!validInput);


        validInput = false;
        System.out.println("Enter egg amount:");
        do {
            if (scanner.hasNextInt()) {
                eggCount = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an number");
                scanner.next();
            }
        } while (!validInput);


        validInput = false;
        System.out.println("Enter sugar amount in grams:");
        do {
            if (scanner.hasNextInt()) {
                sugar = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an number");
                scanner.next();
            }
        } while (!validInput);

        validInput = false;
        System.out.println("Enter flour amount in grams:");
        do {
            if (scanner.hasNextInt()) {
                flour = scanner.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter an number");
                scanner.next();
            }
        } while (!validInput);

        cookie.setHasGluten(hasGluten);
        cookie.setEggCount(eggCount);
        cookie.setSuger(sugar);
        cookie.setFlour(flour);
    }
    //2.4
    public static void cookie2String(Cookie cookie){
        System.out.println("Cookie!{" +
                "hasGluten=" + cookie.isHasGluten() +
                ", eggCount=" + cookie.getEggCount() +
                ", suger=" + cookie.getSuger() +
                ", flour=" + cookie.getFlour() +
                '}');
    }
}
