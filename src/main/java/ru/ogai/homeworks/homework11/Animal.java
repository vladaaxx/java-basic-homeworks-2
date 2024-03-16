package ru.ogai.homeworks.homework11;


public class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public double run(int distance) {
        if (distance > 0) {
            double time = (double) distance / runSpeed;
            stamina -= distance;
            if (stamina < 0) {
                System.out.println(name + " устал(а) и не может продолжать бег");
                stamina = 0;
                return -1;
            }
            System.out.println(name + " пробежал(а) " + distance + " метров за " + time + " секунд");
            return time;
        }
        System.out.println("Расстояние отрицательно");
        return -1;
    }

        public double swim(int distance){
            if (distance > 0) {
                double time = (double) distance / runSpeed;
                stamina -= distance;
                if (stamina < 0) {
                    System.out.println(name + " устал(а) и не может продолжать plyt");
                    stamina = 0;
                    return -1;
                }
                System.out.println(name + " proplyl(а) " + distance + " метров за " + time + " секунд");
                return time;
            }
            System.out.println("Расстояние отрицательное");
            return -1;


        }
}
