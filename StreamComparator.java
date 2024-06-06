import java.util.Comparator;

public class StreamComparator implements Comparator<Groups> {


    @Override
    public int compare(Groups o1, Groups o2) {
        return o1.group.size() - o2.group.size();
    }
}
