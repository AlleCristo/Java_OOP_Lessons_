package Esercizi;

import java.util.Arrays;

public class Array
{
    public static double[] divideArray(double[] v, double n)
    {
        double[] out = new double[v.length];

        for( int i = 0; i < v.length; i++)
        {
            out[i] = v[i]/n;
        }

        return out;
    }

    public static double[] divideArrays(double[] a, double[] b)
    {
        if(a.length != b.length)
            return null;

        double[] out = new double[a.length];

        for( int i = 0; i < a.length; i++)
        {
            out[i] = a[i]/b[i];
        }

        return out;
    }

    static int[] bubbleSort(int[] v)
    {
        int[] out = new int[v.length];

        for(int i = 0; i < v.length; i++)
        {
            out[i] = v[i];
        }

        Arrays.sort(out);

        return out;
    }

    public static long[] fibonacci(int n)
    {
        long[] v = new long[n];

        for(int i = 0; i<n; i++)
        {
            if(i == 0 || i == 1)
                v[i] = 1;
            else
            {
                v[i] = v[i-1]+v[i-2];
            }
        }

        return v;
    }

    public static int[] moveZerosEnd(int[] v)
    {
        if(v.length == 0)
            return null;

        int[] out = new int[v.length];

        for(int i = 0; i < v.length; i++)
        {
            out[i] = v[i];
        }

        if(v.length == 1)
            return out;

        for(int i = 0; i < out.length; i++)
        {
            if(out[i] == 0) {
                for (int j = i + 1; j < v.length; j++) {
                    out[j - 1] = out[j];
                }
                out[out.length - 1] = 0;
            }
        }

        return out;
    }

    public static int[] splitter(int input)
    {
        int tmp = input;
        int c = 0;
        int curr = 0;

        while(tmp != 0)
        {
            c++;
            tmp = tmp/10;
        }

        int[] out = new int[c];
        tmp = input;

        while(tmp != 0)
        {
            curr = tmp%10;
            tmp = tmp/10;

            c--;
            out[c] = curr;

        }

        return out;
    }

    public static void main(String[] args)
    {
        double[] v = {2, 4, 6, 8 , 10, 0};
        double[] v1 = {1, 2, 3, 4, 5, 6};
        double[] ris;
        int[] vInt = {2, 6, 1, 7, 4, 9, 8, 5};
        int[] vInt2 = {2, 0, 6, 0, 1, 0, 7, 4, 9, 0, 8, 5};
        int[] risInt;
        long[] risLong;

        ris = divideArray(v, 2);
        System.out.println(Arrays.toString(ris));

        ris = divideArrays(v, v1);
        System.out.println(Arrays.toString(ris));

        risInt = bubbleSort(vInt);
        System.out.println(Arrays.toString(risInt));

        risLong = fibonacci(0);
        System.out.println(Arrays.toString(risLong));

        risInt = moveZerosEnd(vInt2);
        System.out.println(Arrays.toString(risInt));

        risInt = splitter(1203456780);
        System.out.println(Arrays.toString(risInt));

    }
}
