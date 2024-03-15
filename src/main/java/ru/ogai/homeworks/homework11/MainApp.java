package ru.ogai.homeworks.homework11;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Kotya", 48, 0, 5);
        Dog dog1 = new Dog("Sharik", 50, 15, 7);
        Horse horse1 = new Horse("Skakun", 71, 4, 10);

        cat1.run(30);
    }
}
