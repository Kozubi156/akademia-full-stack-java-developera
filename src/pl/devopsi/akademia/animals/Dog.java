package pl.devopsi.akademia.animals;

public class Dog extends Animal implements Speakable {

    private String color;

    public Dog(String name, int yearOfBirth, Type type, String color) {
        super(name, yearOfBirth, type);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void sound() {
        System.out.println("Woof!!");
    }
}
