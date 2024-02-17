public class Main {
    public static void main(String[] args) {


        Circle circleA = new Circle(5, "Blue");
        Circle circleB = new Circle(10);
        Circle circleC = new Circle(15, "Green");
        Square squareA = new Square(5, "Red", "SquareA");
        Square squareB = new Square(10, "Yellow", "SquareB");
        Square squareC = new Square(15, "Blue", "SquareC");

        squareB.getArea();
        squareB.getPerimeter();
        System.out.println(squareB.getColor());
        squareB.getLength();

        System.out.println(Circle.count);

        System.out.println(circleB.getColor());
        circleB.setColor("Yellow");
        System.out.println(circleB.getColor());








//
//        Animal[] arr = new Animal[8];
//
//        Lion lionA = new Lion("Simba", 3);
//        Lion lionB = new Lion("Nala", 4);
//        Lion lionC = new Lion("haya", 5);
//
//        Dog dogA = new Dog("Rex", 3, "Bulldog", "Brown");
//        Dog dogB = new Dog("moshe", "Bulldog", "Brown");
//
//        Animal catA = new Cat("mitsi", 10, "black");
//
//        arr[0] = lionA;


//        System.out.println(lionA.getName());
//        lionA.setName("Mufasa");
//        System.out.println(lionA.getName());
//
//        lionA.MakeSound();
//       int count = Lion.count;
//        System.out.println(count);
//
//        dogA.sleep();
//        dogB.sleep();
//        lionA.sleep();
//        lionB.sleep();
//




    }







}