import java.util.ArrayList;
import java.util.Iterator;

public class Stream implements Iterable<Groups>, Comparable<Groups>{


    public int groupQuantity;
    public int streamID;

    public ArrayList<Groups> groups = new ArrayList<>();

    private ArrayList<Groups> stream = new ArrayList<>();

    public Stream(){

    }

    public Stream(ArrayList<Groups> groups, int streamID, int groupQuantity) {
        this.streamID = streamID;
        this.groupQuantity = groupQuantity;
        this.groups = groups;
    }

    public void addGroup(Groups group) {
        stream.add(group);
    }

    public int getStreamID() {
        return streamID;
    }

    public int getQuantity() {
        return groupQuantity;
    }


    @Override
    public Iterator<Groups> iterator() {
        return new IteratorGroups(stream);
    }

    @Override
    public int compareTo(Groups g) {
        return this.groupQuantity - g.group.size();
    }

    @Override
    public String toString() {

        String str = "";
//        for (Groups group : stream) {
//            str = str + this.groups + " ";
//        }

        return "(Stream: " + "streamID = " + this.streamID+ "; groupQuantity = " + this.groupQuantity + ")" ;
    }
}
