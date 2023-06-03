public class Viewer {

    private String name;
    private int age;
    private int amountWatchedMovies;

    public Viewer() {
    }

    public Viewer(String name, int age, int amountWatchedMovies) {
        this.name = name;
        this.age = age;
        this.amountWatchedMovies = amountWatchedMovies;
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

    public void setAmountWatchedMovies(int amountWatchedMovies) {
        this.amountWatchedMovies = amountWatchedMovies;
    }
}
