package kz.almaty.github.lesson13.car;

import java.util.Comparator;

public class StudentAverageScoreComparator implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        if(student1 == null || student2 == null) {
            return 0;
        }
        return Double.compare(student1.getAverageScore(), student2.getAverageScore());
    }
}
