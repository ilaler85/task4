package com.company;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static com.company.Deselezator.input;
import static com.company.Selizator.output;
public class Main {

    public static void main(String[] args) throws IOException, FileIsEmpty {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите название файла");
        String matr1 = scanner.nextLine();
        System.out.println("Введите название второго файла");
        String matr2 = scanner.nextLine();
        Matr matrix1 = input(matr1);
        matrix1.toString();
        Matr matrix2 = input(matr2);
        matrix2.toString();
        Matr res = matrix1.multiplication(matrix2);
        res.toString();
        System.out.println("Введите название выходного файла");
        matr2 = scanner.nextLine();
        output(matr2, res, res.n, res.m);

	// write your code here
    }
}
