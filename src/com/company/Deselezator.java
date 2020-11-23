package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Deselezator {
    public static void Deselezator(){}
    public static Matr input(String txt)  throws FileNotFoundException, IOException, FileIsEmpty
    {
        FileReader fr = new FileReader("C:\\Users\\ivano\\IdeaProjects\\util\\test\\"+txt+".txt");
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        if(line == null)
        {
            throw new FileIsEmpty("Файл пуст");
        }
        else
        {
            String[] size = line.split(" ");
            int n = Integer.parseInt(size[0]), m = Integer.parseInt(size[1]);
            Matr res = new Matr(n,m);
            for (int i = 0; i<n; i++)
            {
                String[] tmp = reader.readLine().split(" ");
                for (int j= 0; j<m;j++)
                {
                    res.Matrix[i][j] = Float.parseFloat(tmp[j]);
                }
            }
            return res;
        }

    }
}
