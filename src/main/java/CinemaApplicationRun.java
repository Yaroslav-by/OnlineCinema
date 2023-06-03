import java.util.ArrayList;
import java.util.List;

public class CinemaApplicationRun {

    public static void main(String[] args) {

        ViewerStatistics viewerStatistics = new ViewerStatistics();

        List<Viewer> viewers = new ArrayList<>();
        viewers.add(new Viewer("Vasya", 25));
        viewers.add(new Viewer("Masha", 32));
        viewers.add(new Viewer("Kolya", 18));
        viewers.add(new Viewer("Natasha", 45));
        viewers.add(new Viewer("Gena", 52));

        System.out.println(viewerStatistics.avgAge(viewers));

    }
}
