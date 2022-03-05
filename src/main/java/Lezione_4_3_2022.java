import java.awt.*;
import java.util.Arrays;
import java.util.Random;

public class Lezione_4_3_2022
{
    /*
    *  Documentazione Java : https://docs.oracle.com/en/java/javase/17/docs/api/index.html
    *
    *
    *  ARGOMENTO: Variabili, Array e argomenti base
    *
    */

    public static void main(String[] args)
    {
        Point p = new Point(2, 3);  // è una malloc

        int[] v;                    // è uguale a scrivere   int[] v = null;
        int[] v1 = new int[16];     // è un array di 16 int java li inizializza tutti a 0
        int[] v2 = {1, 2, 3, 4, 5, 6, 7}; // è un array di 7 elementi che ho inizializzato

        System.out.print("Sintassi con For: ");

        for(int i = 0; i < v2.length; i++)
        {
            System.out.print(v2[i] + " ");
        }

        System.out.print("\nSintassi con Foreach: ");

        for(int item : v2)
        {
            System.out.print(item + " ");
        }

        System.out.print("\nSintassi con Arrays: ");
        System.out.println(Arrays.toString(v2));    //Utilizzo Arrays che è una classe che mi permette di manipolare gli array


        Arrays.fill(v1, 7); // Riempie il vettore di 7 utilizzando Arrays

        System.out.print("\nSintassi con Arrays e Fill: ");
        System.out.println(Arrays.toString(v1));    //Utilizzo Arrays che è una classe che mi permette di manipolare gli array


        Random rnd = new Random();

        for(int i = 0; i < v1.length; i++)
        {
            v1[i] = rnd.nextInt(100);
        }

        System.out.print("\nSintassi con Arrays e Random: ");
        System.out.println(Arrays.toString(v1));    //Utilizzo Arrays che è una classe che mi permette di manipolare gli array


        Arrays.sort(v1);

        System.out.print("\nSintassi con Arrays e Ordinato: ");
        System.out.println(Arrays.toString(v1));    //Utilizzo Arrays che è una classe che mi permette di manipolare gli array


    }

}
