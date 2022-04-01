package Esercizi.Generics.Shop;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class Shop<T>
{
    final Queue<T> market;

    public Shop()
    {
        market = new LinkedList<>();
    }

    public T sell()
    {
        return market.poll();
    }

    public void sell(Collection<? super T> cart, int n)
    {
        for(int i = 0; i < n; i++)
            cart.add(market.poll());
    }

    public Collection getItems()
    {
        return market;
    }

    public void buy(T item)
    {
        market.add(item);
    }

    public void buy(Collection<? extends T> list)
    {
        market.addAll(list);
    }

}
