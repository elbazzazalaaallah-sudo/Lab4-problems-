package problem6;

public class Square extends Forme{
    double edge;
    public Square(double edge){
        this.edge = edge;
    }

    public double getSurface(){
        return this.edge*this.edge;
    }
}
