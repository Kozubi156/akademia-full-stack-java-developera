package pl.devopsi.akademia.animals;


import java.util.List;

public class Zoo {

    private final String name;
    private final int yearOfEstablismnet;
    private final List<Animal> animals;

    public Zoo(String name, int yearOfEstablismnet, List<Animal> animals) {
        this.name = name;
        this.yearOfEstablismnet = yearOfEstablismnet;
        this.animals = animals;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void showAnimals() {
        System.out.println(animals.toString());
    }


    public int aveAge() {
        int sumOfAges = 0;
        for (Animal animal : animals) {
            sumOfAges += animal.getAge();
        }
        return sumOfAges / animals.size();
    }

    public void showInfo() {
        System.out.println("Sredni wiek zwierzat " + aveAge());
        System.out.println("Nazwa zoo " + name);
        System.out.println("Rok założenia " + yearOfEstablismnet);
    }

    public List<Animal> getAnimals() {
        return animals;
    }
}
