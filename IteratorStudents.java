import java.util.ArrayList;
import java.util.Iterator;

class IteratorStudents implements Iterator<Student> {

    private ArrayList<Student> group;

    public IteratorStudents(ArrayList<Student> group){
        this.group = group;
    }





    int index =0;
    @Override
    public boolean hasNext() {
        return index < group.size();
    }

    @Override
    public Student next() {
        return group.get(index++);
    }
}
