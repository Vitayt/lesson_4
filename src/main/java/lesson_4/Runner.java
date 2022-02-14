package lesson_4;

import java.util.Objects;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        //  Animal animal= new Animal();
        Cat barsikCat = new Cat("barsik", 5);
        barsikCat.run(200);
        Dog bobikDog = new Dog();
        bobikDog.swim(20);
        bobikDog.run(300);
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("redCat", 5);
        cats[1] = new Cat("grayCat", 10);
        cats[2] = new Cat("blueCat", 15);
        cats[3] = new Cat("blackCat", 20);
        cats[4] = new Cat("whiteCat", 25);
        System.out.println("Количество созданных животных " + Animal.count());
        System.out.println("Количество созданных котиков " + Cat.count());
        System.out.println("Количество созданных собачек " + Dog.count());
        Plate plate = new Plate(150);

        for (int i = 0; i < cats.length; i++) {
            if (Plate.getFood() >= cats[i].getAppetite()) {
                System.out.println(cats[i].getName() + " покушал");
                cats[i].eat(plate);
                plate.info();
            } else {
                System.out.println(cats[i].getName() + " не покушал");
                plate.info();
            }
            System.out.println();
        }

        plate.setFood(200);
        plate.info();

    }
}
