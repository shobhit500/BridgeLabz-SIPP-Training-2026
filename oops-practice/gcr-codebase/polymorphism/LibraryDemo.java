class LibraryMember {

    String memberName;
    String memberId;

    LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    int calculateFine(int days) {
        return 0;
    }

    void display() {
        System.out.println(memberName + " " + memberId);
    }
}

class StudentMember extends LibraryMember {

    StudentMember(String name, String id) {
        super(name, id);
    }

    int calculateFine(int days) {
        return days * 2;
    }
}

class FacultyMember extends LibraryMember {

    FacultyMember(String name, String id) {
        super(name, id);
    }

    int calculateFine(int days) {
        return days;
    }
}

class GuestMember extends LibraryMember {

    GuestMember(String name, String id) {
        super(name, id);
    }

    int calculateFine(int days) {
        return days * 5;
    }
}

public class LibraryDemo {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Shobhit", "S101"),
                new FacultyMember("Aman", "F201"),
                new GuestMember("Rahul", "G301")
        };

        for (LibraryMember m : members) {

            m.display();
            System.out.println("Fine = " + m.calculateFine(5));
        }

        String search = "F201";

        System.out.println("\nSearch Result");

        for (LibraryMember m : members) {

            if (m.memberId.equals(search)) {
                m.display();
            }
        }
    }
}