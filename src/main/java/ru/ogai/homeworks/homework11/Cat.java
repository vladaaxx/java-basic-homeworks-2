package ru.ogai.homeworks.homework11;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }

    @Override
    public double run(int distance) {
        return super.run(distance);
    }

    /*
        //public double swim(int distance) {
        //  System.out.println("Kotic " + name + " plavat ne umeet");
        //return 0.0;
        //}

    } */
    }

