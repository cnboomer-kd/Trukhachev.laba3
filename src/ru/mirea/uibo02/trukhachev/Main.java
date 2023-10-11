package ru.mirea.uibo02.trukhachev;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Circle c1 = new Circle("blue", true, 1.5);
        double d = c1.getArea();
        System.out.println("Площадь круга = " + d);
        System.out.println("Периметр круга = " + c1.getPerimeter());

        Rectangle r1 = new Rectangle("red", true, 10.1, 5.4);
        double a = r1.getArea();
        System.out.println("Площадь прямоугольника = " + a);
        System.out.println("Периметр прямоугольника = " + r1.getPerimeter());

        Square s1 = new Square("white", true, 10.1, 10.1);
        double e = s1.getArea();
        System.out.println("Площадь квадрата = " + e);
        System.out.println("Периметр квадрата = " + s1.getPerimeter());
    }

}