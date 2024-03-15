package ru.ogai.homeworks.homework11;

public class Cat extends Animal{
    public Cat(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }
    @Override
    public double run(int distance) {
        if (distance <= 0) {
            System.out.println("Ошибка: расстояние должно быть положительным числом");
            return -1;
        }
        double time = distance / runSpeed;
        stamina -= distance;
        if (stamina < 0) {
            System.out.println(name + " устал(а) и не может продолжать бег");
            stamina = 0;
            return -1;
        }
        System.out.println(name + " пробежал(а) " + distance + " метров за " + time + " секунд");
        return time;
    }
}
