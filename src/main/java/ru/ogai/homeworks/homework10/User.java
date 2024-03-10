package ru.ogai.homeworks.homework10;

public class User {
    private final String lastName;
    private final String name;
    private final String parentName;
    private final int birthdayYear;
    private final String email;

    public int getBirthdayYear() {
        return birthdayYear;
    }

    public User(String lastName, String name, String parentName, int birthdayYear, String email) {
        this.lastName = lastName;
        this.name = name;
        this.parentName = parentName;
        this.birthdayYear = birthdayYear;
        this.email = email;
    }

    public void info() {
        System.out.printf("ФИО: %s %s %s\nГод рождения: %d\nemail: %s\n", lastName, name, parentName, birthdayYear, email);
    }
}


