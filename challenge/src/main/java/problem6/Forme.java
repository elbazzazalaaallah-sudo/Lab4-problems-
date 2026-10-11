package problem6;

public class Forme {
    float edge;
    public Forme(){};
    public Forme(float edge){
        this.edge = edge;
    }

    public double getSurface(){
        return this.edge*this.edge;
    }
}
