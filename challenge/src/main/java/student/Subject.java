package student;

public class Subject {
    String code;
    String title;
    private Instructor instructor;
    public Subject(){}
    public Subject(String code){
        this.code = code;
    }

    public String normalizedCode(){
        String rep = "";
        for (int i=0;i<code.length();i++){
            if (code.charAt(i) != ' '){
                rep += code.charAt(i);
            }
        }
        code = rep.toUpperCase();
        return code;
    }

    public String properTitle(){
        String rep = "";
        boolean nextToCap = true;
        for (int i=0;i<title.length();i++) {
            if (title.charAt(i) == ' ') {
                nextToCap = true;
                rep += title.charAt(i);
            } else if (nextToCap){
                rep += title.charAt(i);
                rep.toUpperCase();
            }else{
                rep += title.charAt(i);
            }
        }
        title = rep;
        return title;
    }

    public boolean isIntroCourse(){
        String s = "INTRO-";
        boolean a,b;
        a = true;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i) != code.charAt(i)){
                a = false;
                break;
            }
        }

        b = title.contains("intro");
        return a ||b;
    }

    public String syllabusLine(){
        StringBuilder s = new StringBuilder();
        s.append("<"+code+"> - <"+title+"> (Instructor : ");
        s.append(instructor.secondName);
        s.append(" ");
        s.append(instructor.firstName);
        s.append(")");

        return s.toString();
    }
}
