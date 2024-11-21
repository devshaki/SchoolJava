package CinemaManager;

public class Hall {
    private int takenSits,maxSits = 80;

    Movie movie;
    public Hall(Movie movie){
        setMovie(movie);
        this.takenSits = 0;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Movie getMovie() {
        return movie;
    }

    public boolean orderSits(int sits){
        if(takenSits + sits <= maxSits) {
            takenSits+=sits;
            return true;
        }
    return false;
    }

    @Override
    public String toString() {
        return "Hall{" +
                "takenSits=" + takenSits +
                ", maxSits=" + maxSits +
                ", movie=" + movie +
                '}';
    }
}
