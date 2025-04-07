package Lab4.Geometry;


public class Form {
    String color;
    public Form(String color) {
        this.color = color;
    }
    public Form(){}

    public float getArea(){
        return 0;
    }

    @Override
    public String toString() {
        return color;
    }
}
