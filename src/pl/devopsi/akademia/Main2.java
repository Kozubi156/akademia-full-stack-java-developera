package pl.devopsi.akademia;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Żaba",2010,Type.REPTILE));
        animalList.add(new Animal("Wonsz",1999,Type.AMPHIBIAN));

        Animal animal = new Animal("Kamleon",1299,Type.AMPHIBIAN);

        Zoo zoo = new Zoo("Praskie", 2010,animalList);
        zoo.addAnimal(animal);
        zoo.showAnimals();

    }
}
