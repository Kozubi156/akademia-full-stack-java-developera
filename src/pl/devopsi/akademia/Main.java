package pl.devopsi.akademia;

public class Main {

    public static void main(String[] args) {

        int val_integer = 250;
        String val_string = "Akademia jest super!";
        double val_double = 1.234555;

        System.out.println("Zmiena val_integer ma wartosć: " + val_integer);
        System.out.println("Zmiena val_string ma wartosć: " + val_string);
        System.out.println("Zmiena val_double ma wartosć: " + val_double);


        int[] array = {2,21,3,3,2,4,6,1,4,2};
        printIfEvenNumber(array);
        addNumbersInWhileLoopAndPrint(1,500);
    }


    public static void printIfEvenNumber(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Liczba " + array[i] + " jest parzysta");
            } else {
                System.out.println(array[i]);
            }
        }
    }

    public static void addNumbersInWhileLoopAndPrint(int startNumber, int endNumber){
        int sum = 0;
        while (startNumber <= endNumber){
            sum += startNumber;
            startNumber++;
        }
        System.out.println(sum);
    }
}
