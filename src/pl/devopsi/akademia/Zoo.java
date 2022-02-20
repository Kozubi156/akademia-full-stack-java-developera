package pl.devopsi.akademia;

import java.util.List;

public class Zoo {

    private String name;
    private int yearOfEstablismnet;
    private List<Animal> animals;

    public Zoo(String name, int yearOfEstablismnet, List<Animal> animals) {
        this.name = name;
        this.yearOfEstablismnet = yearOfEstablismnet;
        this.animals = animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void showAnimals(){
        System.out.println(animals.toString());
    }



    public List<Animal> getAnimals() {
        return animals;
    }
}
