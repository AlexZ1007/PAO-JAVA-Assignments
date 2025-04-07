package Lab4.Geometry;

import java.util.Objects;

public class Triangle extends Form {
    float height;
    float base;

    public Triangle(String color, float base, float height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    public Triangle() {}

    @Override
    public float getArea() {
        return height * base / 2;
    }


    @Override
    public String toString() {
        return "Triunghi: " + super.toString() + " "+ getArea();
    }

    // Am ales sa compar baza si inaltimea pentru ca triunghiurile pot arata foarte diferit, desi au acceasi arie
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Float.compare(height, triangle.height) == 0 && Float.compare(base, triangle.base) == 0;
    }
    public void printTriangleDimensions(){
        System.out.println("Height: " + height + " Base: " + base);
    }
}
