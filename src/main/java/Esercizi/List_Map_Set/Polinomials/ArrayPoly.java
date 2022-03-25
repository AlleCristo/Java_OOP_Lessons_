package Esercizi.List_Map_Set.Polinomials;

import java.util.ArrayList;
import java.util.List;

public class ArrayPoly implements Poly
{
    private double[] coefficients;

    public ArrayPoly(double[] lista)
    {
        coefficients = lista.clone();

    }


    @Override
    public double[] coefficients()
    {
        return coefficients.clone();
    }

    @Override
    public double coefficient(int grado)
    {
        return coefficients[grado];
    }

    @Override
    public int degree()
    {
        return (coefficients.length - 1);
    }

    @Override
    public Poly derivative()
    {
        double[] deriv = new double[coefficients.length-1];

        for (int i = 1; i < coefficients.length; i++)
        {
            deriv[i-1] = (i)*coefficients[i];
        }

        return new ArrayPoly(deriv);
    }

    @Override
    public String toString()
    {
        String poly = "";

        for(int i = 0; i < coefficients.length; i++)
        {
            poly += coefficients[i] + "x^" + i;

            if(i+1 < coefficients.length)
                poly += " + ";
        }

        return poly;
    }

    @Override
    public boolean equals(Object o)
    {
        if(o == null)
            return false;

        if(!(o instanceof ArrayPoly p))
            return false;

        for(int i = 0; i <= coefficients.length; i++)
        {
            if(coefficients[i] != ((ArrayPoly) o).coefficients[i])
                return false;
        }

        return true;

    }
}
