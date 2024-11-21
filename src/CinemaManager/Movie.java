package CinemaManager;

public class Movie {
    private String name;
    private int length;
    public Movie(String name,int length){
        setName(name);
        setLength(length);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(int length) {
        if (length >0) {
            this.length = length;
        }
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
