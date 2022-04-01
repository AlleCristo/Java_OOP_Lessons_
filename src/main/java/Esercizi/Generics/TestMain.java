package Esercizi.Generics;

import Esercizi.Interface.GeometricObject.Circle;

import java.awt.*;
import java.util.*;
import java.util.List;

public class TestMain
{
    public static void main(String[] args)
    {
        Circle c = new Circle(new Point(1, 1), 10);

        List<Circle> ls = new ArrayList<>(List.of(c, new Circle(new Point(2, 2), 5)));
        List<Circle> ls2 = new ArrayList<>(List.of(c, new Circle(new Point(2, 2), 5)));

        GenericsFunctions.copy(ls, ls2);
        System.out.println(ls2);

        GenericsFunctions.swap(ls2, 0, 1);
        System.out.println(ls2);

        GenericsFunctions.fill(ls, c);
        System.out.println(ls);


    }
}
