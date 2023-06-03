import java.util.List;

public class ViewerStatistics {

    public double avgAge(List<Viewer> viewerList) {

        int sum = 0;

        for (Viewer viewer : viewerList) {
            sum += viewer.getAge();
        }

        return (double) sum / viewerList.size();

    }
}
