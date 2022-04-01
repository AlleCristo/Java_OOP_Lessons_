package Esercizi.Generics;

import java.util.List;

public class GenericsFunctions
{
    /*
        Se usiamo <? super T>
        Possono essere inseriti null oppure oggetti generici che sono al massimo di classe T
        (Se una classe estende quella a cui ci si riferisce con T allora tale oggetto non può essere inserito nella lista!)

        Se usiamo <? extends T>
        Possono essere inseriti null oppure oggetti generici che sono almeno di classe T
        (Se una classe estende quella a cui ci si riferisce con T allora tale oggetto può essere inserito nella lista!)

        Si usa inoltre super se il metodo generico deve scrivere valori
        Si usa invece extends se il metodo generico deve leggere valori
    */

    public static <T> void fill(List<? super T> list, T obj)
    {
        for(int i = 0; i < list.size(); i++)
        {
            list.set(i, obj);
        }

        return;
    }

    public static <T> void copy(List<? extends T> source, List<? super T> dest)
    {
        if(source.size() != dest.size())
            throw new ArrayIndexOutOfBoundsException("Le due liste hanno dimensioni diverse");

        for(int i = 0; i < source.size(); i++)
        {
            dest.set(i, source.get(i));
        }

        return;
    }

    public static void swap (List<?> ls, int i, int j)
    {
        if(ls.size() < i || ls.size() < j)
        {
            return;
        }

        final List l = ls;

        l.set(i, l.set(j, l.get(i)) );


    }

}
