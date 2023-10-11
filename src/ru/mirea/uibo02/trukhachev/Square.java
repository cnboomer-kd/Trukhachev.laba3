package ru.mirea.uibo02.trukhachev;

public class Square extends Rectangle
{
    public Square(String color, boolean filled, double width, double length) {
        super(color, filled, width, length);
    }

    public double getSide()
    {
        return width;
    }
    public void SetSide(double side)
    {
        this.width = width;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
