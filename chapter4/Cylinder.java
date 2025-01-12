package chapter4;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    

    @Override
    public double surfaceArea() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralSurfaceArea = 2 * Math.PI * radius * height;
        return 2 * baseArea + lateralSurfaceArea;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }
    @Override
    public String toString() {
        return "Cylinder \n" + "Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}
