package pl.devopsi.akademia;

import pl.devopsi.akademia.animals.*;
import pl.devopsi.akademia.gender.Gender;
import pl.devopsi.akademia.numbers.Lambda1;
import pl.devopsi.akademia.numbers.Lambda2;
import pl.devopsi.akademia.numbers.Lambda3;
import pl.devopsi.akademia.numbers.Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        int val_integer = 250;
        String val_string = "Akademia jest super!";
        double val_double = 1.234555;

        System.out.println("Zmiena val_integer ma wartosć: " + val_integer);
        System.out.println("Zmiena val_string ma wartosć: " + val_string);
        System.out.println("Zmiena val_double ma wartosć: " + val_double);

        int[] array = {2, 21, 3, 3, 2, 4, 6, 1, 4, 2};
        printIfEvenNumber(array);

        addNumbersInWhileLoopAndPrint(1, 500);

        int[] pointArray = {2, 6, 6};
        printGradeResults(giveGrade(pointArray));

        double[] arra3 = {-1.0, -3.0, 6.0, -9.0, 10.0};
        System.out.println(Arrays.toString(changeToAbsoluteNumber((arra3))));

        System.out.println(femaleOrMaleName("Paweł"));


        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Żaba", 2010, Type.REPTILE));
        animalList.add(new Animal("Wonsz", 1999, Type.AMPHIBIAN));

        Animal animal = new Animal("Kamleon", 1299, Type.AMPHIBIAN);

        Zoo zoo = new Zoo("Praskie", 2010, animalList);
        zoo.addAnimal(animal);
        zoo.showAnimals();

        System.out.println(zoo.aveAge());
        zoo.aveAge();

        Snake snake = new Snake("Wonsz Janusz", 1900, Type.REPTILE, 1.8);
        Fish fish = new Fish("Złota", 2009, Type.AMPHIBIAN, 5);
        Dog dog = new Dog("Szarik", 2001, Type.MAMMAL, "Black");

        List<Speakable> animals = new ArrayList<>();
        animals.add(snake);
        animals.add(dog);
        animals.add(fish);
        for (Speakable speakable : animals) {
            speakable.sound();
        }

        zoo.showInfo();

        int[] arrayNumbers = {2,4,5,};
        Numbers numbers = new Numbers(arrayNumbers);

        Lambda1 lambda1 = arrayOfNumbers -> Arrays.stream(arrayOfNumbers).sum();
        System.out.println("Wyswietlenie sumy elmentów z tablicy liczb: " + numbers.add(lambda1));

        Lambda2 lambda2 = arrayOfNumbers -> (int) Arrays.stream(arrayOfNumbers).average().getAsDouble();
        System.out.println("Wyswietlen sredniej artmentycznej z tablicy licz: " + numbers.avg(lambda2));

        Lambda3 lambda3 = arrayOfNumbers -> Arrays.stream(arrayOfNumbers).filter(number -> number > 2).forEach(System.out::println);
        numbers.show(lambda3);
    }


    public static void printIfEvenNumber(int[] array) {
        for (int element : array) {
            if (element % 2 == 0) {
                System.out.println("Liczba " + element + " jest parzysta");
            } else {
                System.out.println(element);
            }
        }
    }

    public static void addNumbersInWhileLoopAndPrint(int startNumber, int endNumber) {
        int sum = 0;
        while (startNumber <= endNumber) {
            sum += startNumber;
            startNumber++;
        }
        System.out.println(sum);
    }

    public static char giveGrade(int[] array) {
        double sum = 0;
        for (int j : array) {
            sum += j;
        }
        double avarage = sum / array.length;
        if (avarage >= 4) {
            return 'A';
        } else if (avarage < 4 && avarage >= 3) {
            return 'B';
        } else {
            return 'C';
        }
    }

    public static void printGradeResults(char grade) {
        switch (grade) {
            case 'A':
                System.out.println("Super");
                break;
            case 'B':
                System.out.println("Średnio");
                break;
            case 'C':
                System.out.println("Słabo");
                break;
            default:
                System.out.println("cos nie tak...");
        }
    }

    public static double[] changeToAbsoluteNumber(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.abs(array[i]);
        }
        return array;
    }

    public static Gender femaleOrMaleName(String name) {
        if (name.charAt(name.length() - 1) == 'a') {
            return Gender.WOMEN;
        } else {
            return Gender.MAN;
        }
    }
}
