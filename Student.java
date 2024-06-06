/**
 * Student
 */
public class Student implements Comparable<Student> {

    public String name;
    public int id;
    public int groupID;

    public Student(String name, int id, int groupID) {
        this.name = name;
        this.id = id;
        this.groupID = groupID;
    }

    public Integer getGroupID(){
        return groupID;
    }

    public Integer getID(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        // if (o.name.length() > this.name.length()) return -1;
        // else if (o.name.length() < this.name.length()) return 1;
        // return 0;

        return this.name.length() - o.name.length();
    }





}