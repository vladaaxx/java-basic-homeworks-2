package ru.ogai.homeworks.homework11;

public class Horse extends Animal{
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
    }

    @Override
    public double run(int distance) {
        return super.run(distance);
    }
}
