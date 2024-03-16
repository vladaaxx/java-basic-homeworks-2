package ru.ogai.homeworks.homework11;

public class Dog extends Animal{
    public Dog(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double run(int distance) {
        return super.run(distance);
    }

    @Override
    public double swim(int distance) {
        return super.swim(distance);
    }
}
