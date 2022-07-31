package kz.almaty.github.lesson13.car;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if(student1 == null || student2 == null) {
            return 0;
        }
        return student1.getName().compareTo(student2.getName());
    }
}