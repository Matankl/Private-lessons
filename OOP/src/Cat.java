public class Cat extends Animal{
    private String color;



    public Cat (String name, int age , String color){
        super(name,age);
        this.color = color;
    }
    //methods
    public void MakeSound() {
        System.out.println("Mew");
    }

//getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




}
