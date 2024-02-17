public class Lion extends Animal{

    //variables


    public static int count = 0;

    //constructor
public Lion(String name, int age) {
     super(name, age);
        count++;
    }

    //methods
    public void MakeSound() {
         System.out.println("Roar");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is not sleeping");
    }

    //getters and setters
    public String getAge() {
        return super.name;
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



}
