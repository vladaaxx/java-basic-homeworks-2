package ru.ogai.homeworks.homework10;

public class MainApp {
    public static void main(String[] args) {
        User[] users = {new User("Ivanov", "Ivan", "Ivanovich", 2000, "ivan3@mail.com"),
                new User("Petrov", "Petr", "Petrovich", 1975, "petrov111@mail.com"),
                new User("Petrov2", "Petr", "Petrovich", 1999, "petrov111@mail.com"),
                new User("Petrov3", "Petr", "Petrovich", 1978, "petrov111@mail.com"),
                new User("Petrov4", "Petr", "Petrovich", 1960, "petrov111@mail.com"),
                new User("Petrov5", "Petr", "Petrovich", 2001, "petrov111@mail.com"),
                new User("Petrov6", "Petr", "Petrovich", 1995, "petrov111@mail.com"),
                new User("Petrov7", "Petr", "Petrovich", 1971, "petrov111@mail.com"),
                new User("Petrov8", "Petr", "Petrovich", 1993, "petrov111@mail.com"),
                new User("Petrov9", "Petr", "Petrovich", 1965, "petrov111@mail.com")
        };

        int thisYear = 2024;
        for (User user : users) {
            if (thisYear - user.getBirthdayYear() > 40) {
                user.info();
                System.out.println("-------------------------------------------");
            }
        }
    }
}
