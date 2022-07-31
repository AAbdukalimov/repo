package kz.almaty.github.lesson13.car;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if(student1 == null || student2 == null) {
            return 0;
        }
        return Integer.compare(student1.getAge(), student2.getAge());
    }
}
