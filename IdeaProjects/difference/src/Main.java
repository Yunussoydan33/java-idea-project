// Example demonstrating the difference between classes and structures in Java

// Class representing a Point
class PointClass {
    int x;
    int y;

    // Constructor
    public PointClass(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Structure representing a Point
class PointStruct {
    int x;
    int y;
}

public class Main {
    public static void main(String[] args) {
        // Using Class
        PointClass classPoint = new PointClass(10, 20);
        System.out.println("Class Point: (" + classPoint.x + ", " + classPoint.y + ")");

        // Using Structure
        PointStruct structPoint = new PointStruct();
        structPoint.x = 30;
        structPoint.y = 40;
        System.out.println("Struct Point: (" + structPoint.x + ", " + structPoint.y + ")");
    }
}