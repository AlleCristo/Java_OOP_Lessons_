package Esercizi.List_Map_Set.Polinomials;

public interface Poly
{
    double[] coefficients();
    double coefficient(int grado);
    int degree();
    Poly derivative();
}
