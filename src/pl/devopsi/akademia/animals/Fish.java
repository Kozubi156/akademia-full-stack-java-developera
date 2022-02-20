package pl.devopsi.akademia.animals;

public class Fish extends Animal implements Speakable{

    private int finNumber;

    public Fish(String name, int yearOfBirth, Type type) {
        super(name, yearOfBirth, type);
    }

    public int getFinNumber() {
        return finNumber;
    }

    public void setFinNumber(int finNumber) {
        this.finNumber = finNumber;
    }

    @Override
    public void sound() {
        System.out.println("Boooll!");
    }
}
