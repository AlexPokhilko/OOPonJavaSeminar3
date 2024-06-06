// Создать класс Студент
// � Создать класс УчебнаяГруппа
// � Создать класс УчебнаяГруппаИтератор, заставив его реализовать
// интерфейс Iterator
// � Реализовать его контракты (включая удаление)

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import static java.util.List.*;

public class Program {

    public static void main(String[] args) {

        StudentGroup studentGroup = new StudentGroup();

        Student ivan = new Student("Vanechka", 4, 1);
        Student igor = new Student("Igorecheck", 1, 1);
        Student alex = new Student("Alex", 2, 3);
        Student alexey = new Student("Alexey", 5, 3);
        Student irina = new Student("Irisha", 6, 5);
        Student victor = new Student("Victor", 7, 5);
        Student petr = new Student("Petya", 8, 2);
        Student mihail = new Student("Misha", 9, 2);
        Student egor = new Student("Egorushka", 10, 4);
        Student olga = new Student("Olga", 11, 4);
        Student semen = new Student("Semen", 12, 4);


        studentGroup.addStudent(ivan);
        studentGroup.addStudent(igor);
        studentGroup.addStudent(alex);
        studentGroup.addStudent(alexey);
        studentGroup.addStudent(irina);
        studentGroup.addStudent(victor);
        studentGroup.addStudent(petr);
        studentGroup.addStudent(mihail);
        studentGroup.addStudent(egor);
        studentGroup.addStudent(olga);
        studentGroup.addStudent(semen);


        for(Student student: studentGroup) {
            System.out.println(student);
        }

        ArrayList<Student> StudentList = new ArrayList<>(of(ivan, igor, alex, alexey, irina, victor, petr, mihail, egor, olga, semen));

        System.out.println(StudentList);


        Collections.sort(StudentList, (s1, s2) -> s1.id - s2.id); // лямда выражение


        System.out.println(StudentList);
        System.out.println();

        Groups gr1 = new Groups(1, 1);
        Groups gr2 = new Groups(2, 1);
        Groups gr3 = new Groups(3, 1);
        Groups gr4 = new Groups(4, 2);
        Groups gr5 = new Groups(5, 2);


        for(Student elem : StudentList){

            if(elem.groupID==1) {
                gr1.addStudent(elem);
            }
            if(elem.groupID==2) {
                gr2.addStudent(elem);
            }
            if(elem.groupID==3) {
                gr3.addStudent(elem);
            }
            if(elem.groupID==4) {
                gr4.addStudent(elem);
            }
            if(elem.groupID==5) {
                gr5.addStudent(elem);
            }

        }

        ArrayList<Groups> GroupList = new ArrayList<>(of(gr1, gr2, gr3, gr4, gr5));

        for(Groups group: GroupList) {
            System.out.println(group);

            for(Student student: group) {
                System.out.println(student);
            }
        }

        Stream stream1 = new Stream();
        Stream stream2 = new Stream();

        for(Groups elem : GroupList){
            if(elem.streamID==1) {
                stream1.groups.add(elem);
                stream1.groupQuantity++;
                stream1.streamID = 1;
            }
            else {
                stream2.groups.add(elem);
                stream2.groupQuantity++;
                stream2.streamID = 2;
            }

        }

        ArrayList<Stream> StreamList = new ArrayList<>(of(stream1, stream2));

        System.out.println();
        System.out.println("Streams unsorted: ");
        System.out.println(StreamList);


        Collections.sort(StreamList, (s1, s2) -> s1.groupQuantity - s2.groupQuantity);

        System.out.println();
        System.out.println("Streams sorted straight by the number of groups: ");
        System.out.println(StreamList);


    }

}