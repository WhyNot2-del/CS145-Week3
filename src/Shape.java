package src;

class Shape {

    //  initializes coordinates
    private double[] topLeft, bottomLeft, topRight, bottomRight;

    //  Constructs Shape object type
    public Shape(double[] topLeft, double[] bottomLeft, double[] topRight, double[] bottomRight) {
        this.topLeft = topLeft;
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
        this.bottomRight = bottomRight;
    } //  ends Shape object constructor method

    public double[] getTopLeft() {
        return topLeft;
    } //  ends getTopLeft method

    public double[] getBottomLeft() {
        return bottomLeft;
    } //  ends getBottomLeft method

    public double[] getTopRight() {
        return topRight;
    } //  ends getTopRight method

    public double[] getBottomRight() {
        return bottomRight;
    } //  ends getBottomRight method

    public void setTopLeft(double[] topLeft) {
        this.topLeft = topLeft;
    } //  ends setTopLeft method

    public void setBottomLeft(double[] bottomLeft) {
        this.bottomLeft = bottomLeft;
    } //  ends setBottomLeft method

    public void setTopRight(double[] topRight) {
        this.topRight = topRight;
    } //  ends setTopRight method

    public void setBottomRight(double[] bottomRight) {
        this.bottomRight = bottomRight;
    } //  ends setBottomRight method
} //  ends Shape class

class ShapeManager {

}

class ShapeTest {
    public static void main(String[] args) {
        
    }
}