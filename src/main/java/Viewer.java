import java.util.ArrayList;
import java.util.List;

public class Viewer {

    private String name;
    private int age;
    private int amountWatchedMovies;
    private List<Cinema> cinemaList = new ArrayList<>();

    public Viewer() {
    }

    public Viewer(String name, int age) {
        this.name = name;
        this.age = age;
        this.setAmountWatchedMovies(cinemaList);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAmountWatchedMovies() {
        return amountWatchedMovies;
    }

    public void setAmountWatchedMovies(List<Cinema> viewers) {
        this.amountWatchedMovies = viewers.size();
    }

    public void addCinemaToViewer(Cinema cinema) {
        this.cinemaList.add(cinema);
    }

}
