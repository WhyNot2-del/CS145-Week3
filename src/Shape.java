package src;

// Creates the Enum for our square type. 
enum shapeType {
    RECTANGLE,
    SQUARE
} //  ends enum

class Shape {


    //  initializes coordinates
    private double[] topLeft, topRight, bottomLeft, bottomRight;

    //  Constructs Shape object type
    public Shape(double[] topLeft, double[] topRight, double[] bottomLeft, double[] bottomRight) {
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    } //  ends Shape object constructor method

    //  methods return called values from Shape object
    public double[] getTopLeft() {return topLeft;}
    public double[] getTopRight() {return topRight;}
    public double[] getBottomLeft() {return bottomLeft;}
    public double[] getBottomRight() {return bottomRight;}

    //  methods set values in Shape object to the passed values
    public void setTopLeft(double[] topLeft) {this.topLeft = topLeft;}
    public void setTopRight(double[] topRight) {this.topRight = topRight;}
    public void setBottomLeft(double[] bottomLeft) {this.bottomLeft = bottomLeft;}
    public void setBottomRight(double[] bottomRight) {this.bottomRight = bottomRight;}
} //  ends Shape class

class ShapeManager {

}

class ShapeTest {
    public static void main(String[] args) {
        
    }
}