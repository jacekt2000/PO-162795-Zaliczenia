package zadanie1;

import java.util.Comparator;

public class comparator implements Comparator<Java> {
    @Override
    public int compare(Java o1, Java o2) {
        return o2.getDateTheLatestRelease().compareTo(o1.getDateTheLatestRelease());
    }
}
