package pl.devopsi.akademia.animals;

public class Animal implements Speakable {
    private static final int CURRENT_YEAR = 2022;
    private String name;
    private int yearOfBirth;
    private Type type;

    public Animal(String name, int yearOfBirth, Type type) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getAge() {
        return CURRENT_YEAR - yearOfBirth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        if (getYearOfBirth() != animal.getYearOfBirth()) return false;
        if (!getName().equals(animal.getName())) return false;
        return getType() == animal.getType();
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getYearOfBirth();
        result = 31 * result + getType().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", yearOfBirth=" + getYearOfBirth() +
                ", type=" + getType() +
                '}';
    }

    @Override
    public void sound() {
        System.out.println("łeeełaaaałee Animal make sound!");
    }
}
