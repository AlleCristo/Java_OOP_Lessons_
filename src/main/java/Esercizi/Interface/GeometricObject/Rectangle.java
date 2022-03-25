package Esercizi.Interface.GeometricObject;

import java.awt.*;

public class Rectangle implements GeometricObject, Resizable, Movable
{
    Point bottomRight;
    Point upperLeft;

    public Rectangle(Point bottomRight, Point upperLeft)
    {
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    @Override
    public double getArea()
    {
        double base = bottomRight.x - upperLeft.x;
        double height = upperLeft.y - bottomRight.y;

        return base*height;
    }

    @Override
    public double getPerimeter()
    {
        double base = bottomRight.x - upperLeft.x;
        double height = upperLeft.y - bottomRight.y;

        return 2*(base+height);
    }

    @Override
    public void move(Point p)
    {
        upperLeft.translate(p.x, p.y);
        bottomRight.translate(p.x, p.y);
    }

    @Override
    public void resize(double scale)
    {
        bottomRight.x = (int) (upperLeft.x + ((bottomRight.x - upperLeft.x) * scale));
        bottomRight.y = (int) (upperLeft.y - ((upperLeft.y - bottomRight.y) * scale));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "upperLeft=" + upperLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }
}
