import java.util.ArrayList;
import java.util.Iterator;

public class Groups implements Iterable<Student>, Iterator<Student> {

    public int groupID;

    public int streamID;
    public ArrayList<Student> group = new ArrayList<>();

    int index = 0;


    public Groups() {
    }

    public Groups(int groupID, int streamID) {
        this.groupID = groupID;
        this.streamID = streamID;
    }

    public void addStudent(Student student) {
        group.add(student);
    }

    @Override
    public String toString() {

        String str = "";
        for (Student student : group) {
            str = str + student.name + " ";
        }

        return getClass().getName() + " [" + str.trim() + "]" + "; groupID = " + this.groupID + "; streamID = " + this.streamID;
    }

    @Override
    public Iterator<Student> iterator() {
        return new IteratorStudents(group);
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Student next() {
        return null;
    }
}


