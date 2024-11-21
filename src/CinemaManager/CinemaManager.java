package CinemaManager;

public class CinemaManager {
    Hall[] halls;

    public CinemaManager() {
        halls = new Hall[6];
    }

    public boolean addHall(String movieName, int length) {
        for (int i = 0; i < halls.length; i++) {
            if (halls[i] == null || halls[i].getMovie() == null) {
                halls[i] = new Hall(new Movie(movieName, length));
                return true;
            }
        }
        return false;
    }

    public boolean orderToHall(String movieName, int sits) {
        for (int i = 0; i < halls.length; i++) {
            if (halls[i].getMovie().getName().equals(movieName)) {
                return halls[i].orderSits(sits);
            }
        }
        return false;
    }

    public String Print() {
        String output = "";
        for (int i = 0; i < halls.length; i++) {
            if (halls[i] != null) {
                output += halls[i].toString();
            }
        }
        return output;
    }
}
