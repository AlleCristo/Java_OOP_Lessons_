package Esercizi.Generics.Shop;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestMain
{
   public static void main(String [] args)
   {
       Fruit a = new Apple();
       Fruit o = new Orange();

       Shop s = new Shop<>();

       System.out.println(a.toString());
       System.out.println(o.toString());

       s.buy(a);
       s.buy(o);
       s.buy(o);
       s.buy(a);
       s.buy(a);
       s.buy(o);

       System.out.println(s.market);

       Collection<Fruit> cesta = new ArrayList<>(List.of(new Apple(), new Orange()));

       s.buy(cesta);
       System.out.println(s.market);

       System.out.println(s.sell() + " Sold");
       System.out.println(s.market);

       cesta.clear();

       s.sell(cesta, 5);
       System.out.println(cesta);
       System.out.println(s.market);


   }



}
