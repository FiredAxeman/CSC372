package chapter4;

public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

   

    @Override
    public double surfaceArea() {
        double baseArea = Math.PI * Math.pow(radius, 2);
        double slantHeight = Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2));
        double lateralSurfaceArea = Math.PI * radius * slantHeight;
        return baseArea + lateralSurfaceArea;
    }

    @Override
    public double volume() {
        return (1.0 / 3) * Math.PI * Math.pow(radius, 2) * height;
    }
    @Override
    public String toString() {
        return "Cone \n" + "Surface Area: " + surfaceArea() + ", Volume: " + volume();
    }
}
