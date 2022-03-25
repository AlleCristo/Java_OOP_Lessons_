package Esercizi.List_Map_Set;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lists
{
    public static void insertFirst(ArrayList<Integer> list, int value)
    {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value)
    {
        list.add(value);
    }
    public static void replaceThird(ArrayList<Integer> list, int value)
    {
        //list.remove(2);
        //list.add(2, value);

        //OPPURE ANCHE SEMPLICEMENTE

        list.set(2, value);
    }

    public static void removeThird(ArrayList<Integer> list)
    {
        list.remove(2);
    }

    public static void remove666(ArrayList<Integer> list)
    {
        while(list.indexOf(666) != -1)
        {
            list.remove(list.indexOf(666));
        }

    }
    public static ArrayList<Integer> generateSquare()
    {
        ArrayList<Integer> lista = new ArrayList<Integer>(10);

        for(int i = 1; i <= 10; i++)
        {
            lista.add((int)Math.pow(i, 2));
        }

        return lista;
    }

    public static boolean contains(ArrayList<Integer> list, int value)
    {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target)
    {
        target.clear();

        for(Integer i: source)
        {
            target.add(i);
        }

    }
}
