package ru.ogai.homeworks.homework11;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kotya", 1, 0, 5);
        Dog dog1 = new Dog("Sharik", 2, 15, 10);
        Horse horse1 = new Horse("Skakun", 3, 4, 10);

        cat1.run(3);
        dog1.run(7);
        horse1.run(9);
        dog1.swim(1);
        //System.out.println(cat1.name);
    }
}
