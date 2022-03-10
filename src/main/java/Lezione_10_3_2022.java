import java.util.Random;
import java.util.Scanner;

public class Lezione_10_3_2022
{
    /*
     *  Documentazione Java : https://docs.oracle.com/en/java/javase/17/docs/api/index.html
     *
     *
     *  ARGOMENTO: Stringhe, Input/Output, Random, Classi (Esempio: Car & TestMain)
     *
     */

    public static void main(String[] args)
    {
        char[] s = {'h','e','l','l','o'};           //Stringa come Array di char
        String s1 = new String("Hello");     //Stringa come classe java (java.lang.String), In questo modo ogni variabila ha un proprio riferimento in memoria
        String s2 = "hello";

        String first = "Baeldung";                  // memory use
        String second = "Baeldung"; 		        // no memory use perchè è un riferimento a first
        System.out.println(first == second);        // True perchè i due puntatori puntano alla stessa cella di memoria

        String ss1 = new String("Baeldung");     // memory use
        String ss2 = new String("Baeldung");    // memory use
        String ss3 = "Baeldung";                        // memory use

        System.out.println(ss1 == ss2);  // False
        System.out.println(ss1 == ss3);   // False

        //ALCUNI METODI DELLA CLASSE STRING
        ss1.equals(ss2);    //Per controllare se IL CONTENUTO di ss1 è uguale al contenuto di ss2
        ss1.charAt(0);		//Returns the character at the specified index (position)
        ss1.compareTo(ss2);	//Compares two strings lexicographically
        ss1.concat(ss2);		//Appends a string to the end of another string
        ss1.contains(ss2);		//Checks whether a string contains a sequence of characters
        ss1.endsWith(ss2);	    //Checks whether a string ends with the specified character(s)
        ss1.isEmpty();		//Checks whether a string is empty or not
        ss1.length();		//Returns the length of a specified string
        ss1.replace('d',' ' );		//Searches a string for a specified value, and returns a new string where the specified values are replaced
        ss1.split(ss2);		//Splits a string into an array of substrings
        ss1.startsWith(ss2);	//Checks whether a string starts with specified characters
        ss1.substring(3);	//Returns a new string which is the substring of a specified string
        ss1.valueOf(3);		//Returns the string representation of the specified value

        // slow version per molte operazioni di concatenamento

        String str = "";
        for (int i = 0; i < 100; i++)
        {
            str += 'a';
        }

        System.out.println(s);


        // fast version using StringBuilder per molte operazioni di concatenamento

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < 100; i++)
        {
            sb.append('a');
        }

        System.out.println(sb.toString());


        //input da tastiera

        Scanner scr = new Scanner(System.in);

        System.out.println("Inserisci una riga");
        String str1 = scr.next();
        System.out.println(str1);

        System.out.println("Inserisci un int");
        int n = scr.nextInt();
        System.out.println(n);


        //RANDOM NUMBER

        //Metodo 1
        double r = Math.random();        //Numero double compreso tra 0 e 1

        //Metodo 2
        Random rnd = new Random();      //Oggetto Utilizzato per creare numeri casuali

        int n1 = rnd.nextInt();         //tra il range degli interi
        System.out.println(n1);

        n1 = rnd.nextInt(100);    //Tra 0 e 100
        System.out.println(n1);

        n1 = rnd.nextInt(50,100);    //Tra 0 e 100
        System.out.println(n1);
    }
}
