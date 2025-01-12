package chapter4;

public abstract class Shape {
    public abstract double surfaceArea();

    public abstract double volume();

    @Override
    public String toString() {
        return "Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}
