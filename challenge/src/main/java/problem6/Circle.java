package problem6;

public class Circle extends Forme {
    float radius;
    public Circle(float radius){
        this.radius = radius;
    }

    public double getSurface(){
        return Math.pow(this.radius, 2)*Math.PI;
    }


}
