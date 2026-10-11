package student;

public class Student extends Person {
    private String cne;
    private Major major;

    public Student(){ }

    public Student(String nom, String prenom, String telephone, String email, String cne, Major major) {
        super(nom, prenom, telephone,email);
        this.cne = cne;
        this.major = major;
        major.addStudent(this);
    }
//    public Student(String nom, String prenom, String telephone, String email, String cne) {//       super(nom, prenom, telephone, email);
//        this.cne = cne;
//    }

    public Student(String nom, String prenom, String telephone, String email, String cne) {
        this(nom, prenom,telephone,email,cne, new Major("23", "Computer science"));
    }

    public String toString(){
        return firstName + " "+secondName ;
    }

    // Getters
    public String getCne(){
        return cne;
    }

    public Major getMajor(){
        return major;
    }

    // Setters
    public void setCne(String cne){
        this.cne = cne;
    }

    public void setMajor(Major major){
        this.major = major;
    }

    public String getFullNameFormatted(){
        return String.format("%s, %s", secondName.toUpperCase(), firstName);
    }
}

