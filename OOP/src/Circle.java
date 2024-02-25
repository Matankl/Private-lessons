public class Circle {

    //Variables
    private double Radius;

    private String Color = "Red";
    public static int count = 0;

    //Constructor
    public Circle(double Radius, String color) {
        this.Radius = Radius;
        this.Color = color;
        count++;
    }

    public Circle(double radius) {
        this.Radius = radius;
        this.Color = "Red";
        count++;
    }

    //Methods
    public double getArea() {
        return Math.PI * Math.pow(this.Radius, 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.Radius;
    }

    //getters and setters
    public String getColor() {
        return this.Color;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public double getRadius() {
        return this.Radius;
    }

    public void setRadius(double radius) {
        Radius = radius;
    }


}
