package Esercizi.List_Map_Set;

import java.util.ArrayList;

public class Test_List_Map_Set
{
    public static void main(String [] args)
    {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(2);
        lista.add(666);
        lista.add(3);
        lista.add(5);
        lista.add(666);
        lista.add(6);
        lista.add(7);
        lista.add(666);

        Lists.insertFirst(lista, 1);    System.out.println(lista);
        Lists.insertLast(lista, 8);     System.out.println(lista);
        Lists.replaceThird(lista, 11);  System.out.println(lista);
        Lists.removeThird(lista);              System.out.println(lista);
        Lists.remove666(lista);                System.out.println(lista);
        System.out.println(Lists.generateSquare());



    }
}
