package pl.devopsi.akademia.animals;

public class Snake extends Animal implements Speakable {
    private Double lengthInMeter;

    public Snake(String name, int yearOfBirth, Type type, Double lengthInMeter) {
        super(name, yearOfBirth, type);
        this.lengthInMeter = lengthInMeter;
    }

    public Double getLengthInMeter() {
        return lengthInMeter;
    }

    public void setLengthInMeter(Double lengthInMeter) {
        this.lengthInMeter = lengthInMeter;
    }

    @Override
    public void sound() {
        System.out.println("Sssssssssss!!!!");
    }
}
