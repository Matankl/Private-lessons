public class Rectangle {
    //Variables
    protected double length;
    private double width;
    protected String color;
    public static int count = 0;

    //Constructor
    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
        count++;
    }

    //Methods
    public double getArea() {
        return this.length * this.width;
    }

    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }


    //getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
