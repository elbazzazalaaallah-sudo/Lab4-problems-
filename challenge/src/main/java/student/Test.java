package student;

public class Test {
    public static void main(String[] args) {

        Major m1 = new Major("23", "Computer Science");
        Major m2 = new Major("42", "Economy");

        Student s1 = new Student("SAFI", "Amal", "0234567", "amal.safi@gmail.com", "AS2435", m1);
        Student s2 = new Student("ALAMI", "Samir", "4565765", "alami.samir@gmail.com", "AS63578", m1);
        Student s3 = new Student("aa", "bb", "4346667", "aa.bb@gmail.com", "AS3256", m2);
        // Display computer science students
        System.out.println("The list of students in the computer science major is:");
        m1.displayStudents();
        System.out.println(s1.getFullNameFormatted());
        System.out.println(m1.findStudentByCNE("AS63578"));
        System.out.println(m1.getStudentCount());
        System.out.println(m1.getStudentListAsString());
        System.out.println(m1.removeStudent("AS63578"));
        m1.getOccupancyRate();
    }
}

