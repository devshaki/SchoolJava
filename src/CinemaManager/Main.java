package CinemaManager;

public class Main {
    public static void main(String args[]){
        CinemaManager cm = new CinemaManager();
        //2.1
        cm.addHall("avatar",420);
        //2.2
        cm.addHall("alice in wonderland",201);
        //2.3
        cm.orderToHall("avatar",4);
        cm.orderToHall("alice in wonderland",6);
        //2.4
        System.out.println(cm.Print());
    }
}
