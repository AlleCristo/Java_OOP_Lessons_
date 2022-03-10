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
