package Teoria;
/*
    this è un riferimento a me stesso
    super è un riferimento alla classe genitore
        (se sonoin una classe B che estende la classe A, posso usare super.qualsiasicosa per accedere a elementi di A direttamente da B)
 */

public class TestMain
{
    public static void main(String[] args)
    {
        Car c = new Car("Lamborghini", "Giallo");

        System.out.println(c.toString());

        c.setBrand("Ferrari");

        c.turnOn();

        System.out.println(c.toString());
    }
}
