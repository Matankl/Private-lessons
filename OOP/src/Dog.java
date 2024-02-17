public class Dog extends Animal {
    //variables

    private String breed;
    private String color;
    public static int count = 0;

    //constructor
    public Dog(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
        count++;
    }
    public Dog(String name, String breed, String color) {
        super(name, 0);
        this.breed = breed;
        this.color = color;
        count++;
    }

    //methods
    public void MakeSound() {
        System.out.println("Bark");
    }
    public void fetch(String item) {
        System.out.println("Fetch" + item);
    }
    //getters and setters
    public int getAge() {
        return age;
    }
public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }










}
