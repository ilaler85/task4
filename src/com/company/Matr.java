package com.company;

public class Matr {
    public float[][] Matrix;
    public int n,m;

    public  Matr(int n1, int m1)
    {
        Matrix = new float[n1][m1];
        n = n1; m=m1;
    }

    public Matr multiplication(Matr MatB)
    {
        if(this.m == MatB.n )
        {
            Matr res = new Matr(this.n,MatB.m);
            //mSystem.out.println("Check");
            for (int i=0; i<this.n;i++)
            {
                for (int j=0; j<MatB.m;j++)
                {
                   for(int k=0; k<this.m;k++)
                       res.Matrix[i][j] = res.Matrix[i][j]+this.Matrix[i][k]*MatB.Matrix[k][j];
                }
            }
            return res;
        }
        else
        {
            return null;
        }

    }

    public String Line(int tmp)
    {
        String res="";
        for (int i=0; i<m; i++)
        {
            res=res+this.Matrix[tmp][i]+" ";
        }
        return res;
    }

    public String toString()
    {
        System.out.println(this.n+" "+this.m);
        for (int i=0; i < n; i++)
        {
            System.out.println(Line(i));
        }
        return "1";
    }
}