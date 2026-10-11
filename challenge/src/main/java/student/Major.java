package student;

public class Major {
   private static int nextId = 1;
   private int id;
   private String code;
   private String name;
   private Student[] students;
   private int studentCount;

   public Major(){

   }
    public Major(String code, String name) {
        this.id = nextId++;
        this.code = code;
        this.name = name;
        this.students = new Student[0];
   }

    // Method to add a student
    public void addStudent(Student s) {
        if (studentCount < 50){
            Student[] s2 = new Student[students.length+1];
            for(int i=0;i<students.length;i++){
                s2[i] = students[i];
            }
            s2[students.length] = s;
            students = s2;
            studentCount++;
        }
    }

    public String toString(){
       return ("Major id :"+ id + ", major code : "+ code +", major name : "+name + " Student Count : "+studentCount+", Students : " + students);
    }

   // Getters
    public int getId(){
       return id;
    }

    public String getCode(){
       return code;
    }

    public String getName(){
       return name;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getStudentCount(){
       return studentCount;
    }

    public static int getNextId(){
       return nextId;
    }

    // Display all students in the major
   public void displayStudents() {
       if (students != null) {
           for (Student student : students) {
               System.out.println(student); // prints student details
           }
       }
   }

   public Student findStudentByCNE(String cne){
       for (Student s:students){
           if (s.getCne().equals(cne)){
               return s;
           }
       }
       return null;
   }

   public boolean removeStudent(String cne){
       Student s = findStudentByCNE(cne);
       if (s != null){
           Student[] s2 = new Student[students.length-1];
           for (int i = 0; i < students.length; i++) {
               if (s.equals(students[i])) {
                   for(int j=i;j<students.length-1;j++){
                       students[j] = students[j+1];
                   }
                   break;
               }
           }
           for (int i = 0; i < students.length-1; i++) {
               s2[i] = students[i];
           }
           students = s2;
           return true;
       }return false;
   }

   public void getOccupancyRate(){
       System.out.println(name + "capacity : 50 students");
       System.out.println("Current enrollment : "+getStudentCount()+"students");
       float occup = getStudentCount()/50*100;
       System.out.println("Occupancy rate = "+occup+"%");
   }

   public String getStudentListAsString(){
       StringBuilder str = new StringBuilder();
       for (Student s : students){
           str.append(s.toString()+"\n");
       }
       return str.toString();
   }

}
