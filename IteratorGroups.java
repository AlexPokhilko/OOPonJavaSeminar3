import java.util.ArrayList;
import java.util.Iterator;

class IteratorGroups implements Iterator<Groups> {

    private ArrayList<Groups> stream;

    public IteratorGroups(ArrayList<Groups> stream){
        this.stream = stream;
    }

    int index =0;
    @Override
    public boolean hasNext() {
        return index < stream.size();
    }

    @Override
    public Groups next() {
        return stream.get(index++);
    }
}
