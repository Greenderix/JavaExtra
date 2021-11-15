package Practic6;
import java.util.Comparator;
public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getFinalScore() - o2.getFinalScore());
    }

}

