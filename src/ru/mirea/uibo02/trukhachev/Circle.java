package ru.mirea.uibo02.trukhachev;

public class Circle extends Shape
{
    protected double radius;

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea()
    {
        return 2*Math.PI*Math.pow(radius, 2);
    }

    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}
