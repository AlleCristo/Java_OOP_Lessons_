/*
    Static è utilizzato pe generare metodi o attributi non legati all' oggetto ma alla classe in generale
    ciò ci consente di poter chiamare tale metodo/attributo direttamente dalla classe, Es: Math.PI oppure Math.pow(2, 5)
 */

public class Car
{
    private String brand;
    private String color;
    private boolean isOn;

    public Car(String _brand, String _color, boolean isOn)  //Costruttore Copleto
    {
        this.brand = _brand;
        this.color = _color;
        this.isOn = isOn;
    }

    public Car(String _brand, String _color)        //Costruttore 2 (Polimorfismo)
    {
        this.brand = _brand;
        this.color = _color;

        this.isOn = false;
    }

    public void turnOn()        //Metodo utilizabile esternamente alla classe
    {
        this.isOn = true;
    }

    public void turnOff()       //Metodo utilizabile esternamente alla classe
    {
        this.isOn = false;
    }

    @Override
    public String toString()        //Override della funzione to string
    {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                '}';
    }

    // Getter & Setter

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isOn()
    {
        return isOn;
    }

    public void setOn(boolean on)
    {
        isOn = on;
    }
}
