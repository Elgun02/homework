package Homework;

import javax.imageio.stream.ImageInputStream;

public class Box {

    public int width;
    public int height;
    public int length;

    public Box(int width, int height, int length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    public void print(){
        String result = "Ширина: " + width + ", Высота: "  + height + ", Длина: " + length;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Box box1 = new Box(30, 40, 50);
        box1.print();

        int V = box1.width * box1.length * box1.height;

        System.out.println("Обьем в Литрах: " + V / 1000);
    }
}
