package Homework;

public class Pizza {

    private double x, y, r1, r2;

    public Pizza(double x, double y){
        this.x = x;
        this.y = y;
        X();
        Y();
    }

    private void X() {
        // x^2 / 4 * Pi = площадь в квадратных сантиметрах.
        r1 = Math.pow(x, 2) / 4 * Math.PI * 40;
    }

    private void Y() {
        r2 = Math.pow(y, 2) / 4 * Math.PI * 40;
    }

    public void print(){
//        System.out.println("Калории пиццы диаметром 24 = " + (int)r1);
//        System.out.println("Калории пиццы диаметром 28 = " + (int)r2);
        System.out.println("Дельта = " + (int)(r2 - r1) + " калорий.");
    }

    public static void main(String[] args) {

        double x, y;
        x = 24;
        y = 28;

        Pizza p1 = new Pizza(x, y);
        p1.print();
    }
}
