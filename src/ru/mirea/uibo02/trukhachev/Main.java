package ru.mirea.uibo02.trukhachev;
import java.util.Scanner;
class Shape
{
    protected String color;
    protected boolean filled;

    public static void Shape()
    {

    }
    public static void Shape(String color, boolean filled)
    {

    }
    public static String getColor()
    {

    }
    public static void setColor(String color)
    {

    }
    public static boolean isFilled()
    {

    }
    public static void setFilled(boolean filled)
    {

    }
    public static double getArea()
    {

    }
    public static double getPerimeter()
    {

    }
    public static String toString()
    {

    }
}
class Circle extends Shape
{
    public double radius;
    public static void Circle()
    {

    }
    public static void Circle(double radius)
    {

    }
    public static void Circle(double radius, String color, boolean filled)
    {

    }
    public static double getRadius()
    {

    }
    public static void setRadius(double radius)
    {

    }
    @Override
    public static double getArea()
    {

    }
    @Override
    public static double getPerimeter()
    {

    }
    @Override
    public static String toString()
    {

    }
}
class Rectangle extends Shape
{
    double width;
    public double length;
    public static void Rectangle()
    {

    }
    public static void Rectangle(double width, double length)
    {

    }
    public static void Rectangle(double width, double length, String color, boolean filled)
    {

    }
    public static double getWidth()
    {

    }
    public static void setWidth(double width)
    {

    }
    public static double getLength()
    {

    }
    public static double setLength(double length)
    {

    }
    @Override
    public static double getArea()
    {

    }
    @Override
    public static double getPerimeter()
    {

    }
    @Override
    public static string toString()
    {

    }
}
class Square extends Rectangle
{
    public static void Square()
    {

    }
    public static void Square(double side)
    {

    }
    public static void Square(double side, String color, boolean filled)
    {

    }
    public static double getSide()
    {

    }
    public static void setSide(double side)
    {

    }
    @Override
    public static void setWidth(double side)
    {

    }
    @Override
    public static void setLength(double side)
    {

    }
    @Override
    public string toString()
    {

    }
}

class MovablePoint implements Movable
{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    public static void MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {

    }
    public static String toString()
    {

    }
    public static void moveUp()
    {

    }
    public static void moveDown()
    {

    }
    public static void moveLeft()
    {

    }
    public static void moveRight()
    {

    }
}
class MovableCircle implements Movable
{
    private int radius;
    private MovableCircle center;
    public static void MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {

    }
    public static String toString()
    {

    }
    public static void moveUp()
    {

    }
    public static void moveDown()
    {

    }
    public static void moveLeft()
    {

    }
    public static void moveRight()
    {

    }
}

interface Movable extends Movable, Movable
{
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

}

