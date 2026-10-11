package student;

public class Instructor extends Person{
    String EmployeeNumber;

    public Instructor(){}
    public Instructor(String EmployeeNumber){
        this.EmployeeNumber = EmployeeNumber;
    }

    public String cleanEmployeeNumber(){
        String rep = "";
        for (int i=0;i<EmployeeNumber.length();i++){
            if (EmployeeNumber.charAt(i) != ' '){
                rep += EmployeeNumber.charAt(i);
            }
        }
        EmployeeNumber = rep;
        return EmployeeNumber;
    }

    public String summaryLine(){
        return  String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", EmployeeNumber,secondName,firstName);
    }

    public String toCard(){
        StringBuilder s = new StringBuilder();
        s.append("Instructor\n");
        s.append("----------\n");
        s.append("Employee #: <"+EmployeeNumber+">\n");
        s.append("Name      : <"+secondName+">,<"+firstName+">\n");
        s.append("Email     : <"+email+">\n");
        s.append("Phone     : <"+phone+">\n");
        return s.toString();
    }

    public String displayName(){
        StringBuilder s = new StringBuilder();
        if (firstName==null && secondName==null){
            return null;
        }
        else if(firstName == null){
            s.append("Last name : "+secondName);
        } else if (secondName == null) {
            s.append("First name : "+firstName);
        }
        else{
            s.append("Last name: "+secondName+", First name: "+firstName);
        }
        return s.toString();
    }
}
