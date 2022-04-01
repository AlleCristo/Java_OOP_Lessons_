package Esercizi.Generics.Shop;

public class Product
{
    String description;

    public Product()
    {
        description = "I'm a product";
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;

        if ( o == null || this.getClass() != o.getClass())
            return false;

        Product product = (Product) o;

        return description.equals(product.description);
    }

    @Override
    public int hashCode()
    {
        return description.hashCode();
    }

    @Override
    public String toString()
    {
        return description;
    }
}
