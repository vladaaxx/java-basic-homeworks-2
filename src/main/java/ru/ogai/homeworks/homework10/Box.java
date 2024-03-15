package ru.ogai.homeworks.homework10;

public class Box {
    private final int size;
    private String color;
    private boolean open;
    private String item;

    public void setColor(String color) {
        this.color = color;
        System.out.printf("теперь цвет коробки - %s", color);
    }

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
        this.open = false;
        this.item = "";
    }
    boolean isEmpty = true;
    public boolean isEmpty() {
        if (item.equals("")) {
            System.out.println("korobka pusta");
            return isEmpty;
        } else {
            isEmpty = false;
            System.out.println("v korobke chto-to est");
            return isEmpty;
        }
    }

    public void open() {
        if (open) {
            System.out.println("коробка уже открыта");
            return;
        }
        open = true;
        System.out.println("вы открыли коробку");
    }

    public void close() {
        if (!open) {
            System.out.println("коробка уже закрыта");
            return;
        }
        open = false;
        System.out.println("вы закрыли коробку");
    }

    public void info(){
        String otkryto = "нет";
        if (open){
            otkryto = "да";
        }
        System.out.printf("размер коробки - %d\nцвет - %s\nоткрыта - %b\nпредмет - %s\n", size, color, otkryto, item);
    }

}
