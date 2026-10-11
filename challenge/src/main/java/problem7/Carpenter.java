package problem7;

public class Carpenter extends Person{
    String name;
    public Carpenter(){}
    public Carpenter(String name){
        this.name = name;
    }
    public void display(){
        System.out.println("I am "+name+" the Carpenter");
    }
}
