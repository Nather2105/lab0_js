package org.example;

import java.util.Arrays;

public class Variant2 {
    //    Integer2. Дана масса M в килограммах. пользуясь операцией деления нацело,
    //    найти количество полных тонн в ней (1 тонна = 1000 кг).
    public int Integer2(int m) {
        if (m < 0) {
            throw new IllegalArgumentException("Error, m < 0!");
        }
        return m / 1000;
    }
/////////////////////////////////////////////////////////////////////////

    // Boolean2. Дано целое число A. Проверить истинность высказывания:
    // «Число A является нечетным»
    public boolean Boolean2(int numberA) {
        return Math.abs(numberA) % 2 == 1;

    }

    /////////////////////////////////////////////////////////////////////////
    //If2. Дано целое число. Если оно является положительным, то прибавить к нему 1;
    //в противном случае вычесть из него 2. Вывести полученное число.
    public int If2(int number) {
        if (number >= 0) {
            number += 1;
        } else {
            number -= 2;
        }
        return number;
    }

    /////////////////////////////////////////////////////////////////////////
    //For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания все целые числа,
    //расположенные между A и B (включая сами числа A и B), а также количество N этих чисел.
    public int[] For2(int A, int B) {
        if (B <= A) {
            throw new IllegalArgumentException("Error, B <= A!");
        }
        int N = Math.abs(A - B) + 1;
        int[] result = new int[N + 1];
        for (int i = 0; i <= N; i++) {
            System.out.println(A + i);
            result[i] = A + i;
        }
        System.out.println(N);
        result[N] = N;
        return result;
    }

    /////////////////////////////////////////////////////////////////////////
    //While2*. Даны положительные числа A и B (A > B). На отрезке длины A размещено максимально возможное количество отрезков длины B (без наложений).
    //Не используя операции умножения и деления, найти количество отрезков B, размещенных на отрезке A.
    public int While2(int A, int B) {
        if (B >= A) {
            throw new IllegalArgumentException("B can`t be more or equal A");
        } else if (B < 0 || A < 0) {
            throw new IllegalArgumentException("A or B < 0");
        }
        int c = A;
        int count = 0;
        while (c > B) {
            c -= B;
            count++;
        }
        return count;
    }

    /////////////////////////////////////////////////////////////////////////
    //Minmax2. Дано целое число N и набор из N прямоугольников, заданных своими
    //сторонами — парами чисел (a, b). Найти минимальную площадь прямоугольника из данного набора.
    public int Minmax2(int N, int[] b) {
        if (N <= 0) {
            throw new IllegalArgumentException("Error, N < 0!");
        }
        int minSquare1 = b[0] * b[1];
        for (int i = 1; i < N; i++) {
            if (b[i] * b[i + 1] < minSquare1) {
                minSquare1 = b[i] * b[i + 1];
            }
        }
        return minSquare1;
    }

    /////////////////////////////////////////////////////////////////////////
    //Array2. Дано целое число N (> 0). Сформировать и вывести целочисленный массив размера N,
    //содержащий степени двойки от первой до N-й: 2, 4, 8, 16, … .
    public int[] Array2(int N) {
        if (N <= 0) {
            throw new IllegalArgumentException("Error, N <= 0!!!");
        }

        int[] arr = new int[N];
        arr[0] = 2;
        for (int i = 1; i < N; i++) {
            arr[i] = arr[i-1] * 2;
        }

        return arr;
    }

    /////////////////////////////////////////////////////////////////////////
    //Matrix2. Даны целые положительные числа M и N. Сформировать целочисленную матрицу размера
    // M ґ N, у которой все элементы J-го столбца имеют значение 5·J (J = 1, …, N).
    public int[][] Matrix2(int M, int N) {
        int[][] matrix = new int[M][N];
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++){
                matrix[i][j] = 5 * (j + 1);
                System.out.println(matrix[i][j]);
            }
        }
        return matrix;
    }
}


