public class Square extends Rectangle{
    //Variables
    private String name;


    //Constructor
    public Square(double side, String color) {
        super(side, side, color);
    }

    public Square(double side, String color, String name) {
        super(side, side, color);
        this.name = name;
    }

    //getters and setters
    public double getSide() {
        return super.getLength();
    }

    public void setSide(double side) {
        super.length = side;        //because length and width are protected in the Rectangle class
        super.setWidth(side);       //because length and width are private in the Rectangle class
    }


}
