import java.util.*;

abstract class CourseType {

    String course;

    CourseType(String course) {
        this.course = course;
    }

    public String toString() {
        return course;
    }
}

class ExamCourse extends CourseType {

    ExamCourse(String name) {
        super(name);
    }
}

class AssignmentCourse extends CourseType {

    AssignmentCourse(String name) {
        super(name);
    }
}

class ResearchCourse extends CourseType {

    ResearchCourse(String name) {
        super(name);
    }
}

class Course<T extends CourseType> {

    T obj;

    Course(T obj) {
        this.obj = obj;
    }

    T getCourse() {
        return obj;
    }
}

public class UniversityCourse {

    static void display(List<? extends CourseType> list) {

        for (CourseType c : list)
            System.out.println(c);
    }

    public static void main(String args[]) {

        ArrayList<CourseType> list = new ArrayList<>();

        list.add(new ExamCourse("Java"));
        list.add(new AssignmentCourse("DBMS"));
        list.add(new ResearchCourse("AI"));

        display(list);
    }
}