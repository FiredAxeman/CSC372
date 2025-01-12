package chapter4;

public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[3];
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the radius of the sphere: ");
        //int UserinputSphere = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the radius of the cylinder: ");
        //int UserinputCylinder = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the height of the cylinder: ");
        //int UserinputCylinderHeight = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the radius of the cone: ");
        //int UserinputCone = Integer.parseInt(scanner.nextLine());
        //System.out.print("Enter the height of the cone: ");
        //int UserinputConeHeight = Integer.parseInt(scanner.nextLine());
        //shapeArray[0] = new Sphere(UserinputSphere);
        //shapeArray[1] = new Cylinder(UserinputCylinder, UserinputCylinderHeight);
        //shapeArray[2] = new Cone(UserinputCone, UserinputConeHeight);

        shapeArray[0] = new Sphere(5);
        shapeArray[1] = new Cylinder(3, 4);
        shapeArray[2] = new Cone(2, 7);

        for (Shape shape : shapeArray) {
            System.out.println(shape);
            System.out.println("-----------------------");
        }
    }
}