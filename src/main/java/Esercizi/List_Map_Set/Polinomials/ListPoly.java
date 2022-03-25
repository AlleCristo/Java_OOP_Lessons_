package Esercizi.List_Map_Set.Polinomials;

import java.util.ArrayList;
import java.util.List;

public class ListPoly implements Poly
{
    private List<Double> coefficients;

    public ListPoly(double[] lista)
    {
        coefficients = new ArrayList<Double>();

        for (double d : lista)
            coefficients.add(d);
    }


    @Override
    public double[] coefficients()
    {
        double[] ris = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++)
            ris[i] = coefficients.get(i);

        return ris;
    }

    @Override
    public double coefficient(int grado)
    {
        return coefficients.get(grado);
    }

    @Override
    public int degree()
    {
        return (coefficients.size() - 1);
    }

    @Override
    public Poly derivative()
    {
        double[] deriv = new double[coefficients.size()-1];

        for (int i = 1; i < coefficients.size(); i++)
        {
            deriv[i-1] = (i)*coefficients.get(i);
        }

        return new ListPoly(deriv);
    }

    @Override
    public String toString()
    {
        String poly = "";

        for(int i = 0; i < coefficients.size(); i++)
        {
            poly += coefficients.get(i).toString() + "x^" + i;

            if(i+1 < coefficients.size())
                poly += " + ";
        }

        return poly;
    }

    @Override
    public boolean equals(Object o)
    {
       if(o == null)
           return false;

       if(!(o instanceof ListPoly p))
           return false;

       for(int i = 0; i <= coefficients.size(); i++)
       {
           if(coefficients.get(i) != ((ListPoly) o).coefficients.get(i))
               return false;
       }

       return true;

    }

}
