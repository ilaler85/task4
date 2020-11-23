package com.company;

import javax.sound.sampled.Line;
import java.io.*;

public class Selizator {
    public Selizator(){}
    public static void output (String txt, Matr res, int n, int m) throws  IOException{
        File file = new File("C:\\Users\\ivano\\IdeaProjects\\util\\test\\"+txt+".txt");
        file.createNewFile();
        FileWriter writer = new FileWriter("C:\\Users\\ivano\\IdeaProjects\\util\\test\\"+txt+".txt", false);
        writer.write(n+" "+m+"\n");
        String line = "";
        for(int i = 0 ; i<n;i++){
            writer.write(res.Line(i)+"\n");
        }
        writer.flush();
        writer.close();
    }
}
