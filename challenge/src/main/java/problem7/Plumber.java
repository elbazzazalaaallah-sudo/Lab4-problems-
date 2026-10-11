package problem7;

public class Plumber extends Person{
    String name;
    public Plumber(){}
    public Plumber(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("I am "+name+" the Plumber");
    }
}
