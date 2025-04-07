package Lab4.Geometry;

public class Circle extends Form {
    float radius;

    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(float radius) {
        this.radius = radius;
    }
    public Circle() {}

    @Override
    public float getArea() {
        return (float)(radius * radius * 3.14);
    }

    @Override
    public String toString() {
        return "Cerc: " + super.toString() + " "+ getArea();
    }

    public void printCircleDimensions(){
        System.out.println("Radius: " + radius);
    }
}
