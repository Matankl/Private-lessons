public class Animal {
    protected String name;
    protected int age =0;

//constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
//methods
    public void eat() {
         System.out.println("I am eating");
    }
    public void sleep() {
         System.out.println(name + " is sleeping");
    }

}
