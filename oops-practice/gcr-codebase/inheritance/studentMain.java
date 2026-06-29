public class studentMain {
    public static void main(String[] args) {

        GradStudent student =
                new GradStudent(
                        "Rahul",
                        23,
                        101,
                        9.2,
                        "Artificial Intelligence");

        System.out.println(student);

        System.out.println();

        if(student instanceof Student)
            System.out.println("GradStudent IS-A Student");

        if(student instanceof Person)
            System.out.println("GradStudent IS-A Person");

        Student s = student;

        if(s instanceof Person)
            System.out.println("Student IS-A Person");
    }
}