package Esercizi.Interface.GeometricObject;

import java.awt.*;

public class Circle implements GeometricObject, Resizable, Movable
{
    private Point center;
    private double radius;

    public Circle(Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(Point p)
    {
        center.translate(p.x, p.y);
        center.translate(p.x, p.y);
    }

    @Override
    public void resize(double scale)
    {
        radius *= scale;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
