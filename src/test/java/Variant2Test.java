package org.example;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Variant2Test {
    @Test(dataProvider = "Integer2Data")
    public void Integer2test(int M, int expected) {
        int actual = new Variant2().Integer2(M);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] Integer2Data() {
        return new Object[][]{
                {390, 0}, // 0 тон
                {3500, 3}, // 3 тони
                {10000, 10}, // 10 тон
                {17700, 17}, // 17 тон
                {222222, 222} // 222 тони
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negInteger2Test() {
        new Variant2().Integer2(-2000);
    }
//////////////////////////////////////////////////////////////////////////

    @Test(dataProvider = "Boolean2Data")
    public void Boolean2Test(int numberA, boolean expected) {
        boolean actual = new Variant2().Boolean2(numberA);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] Boolean2Data() {
        return new Object[][]{
                {5, true},    // 5 є непарне
                {0, false},   // Нуль є парне
                {-9, true},  // -9 є непарне
                {100, false},  // 100 є парне
                {55, true} // 55 є непарне
        };
    }

    //////////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "If2Data")
    public void If2Test(int input, int expected) {
        int actual = new Variant2().If2(input);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] If2Data() {
        return new Object[][]{
                {5, 6},     // Позитивне число
                {-5, -7},   // Від'ємне число
                {0, 1},     // Нуль не повинен змінюватися
                {100, 101}, // Позитивне число
                {-100, -102} // Від'ємне число
        };
    }

    @Test(dataProvider = "For2Data")
    public void For2Test(int A, int B, int[] expected) {
        int[] actual = new Variant2().For2(A, B);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] For2Data() {
        return new Object[][]{
                {5, 7, 5, 6, 7, 3},
                {1, 2, 1, 2, 2},
                {-3, 3, -3, -2, -1, 0, 1, 2, 3, 7}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void errorFor2Test() {
        new Variant2().For2(3, 3);
    }

    //////////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "While2Data")
    public void While2Test(int K, int N, int expected) {
        int actual = new Variant2().While2(K, N);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] While2Data() {
        return new Object[][]{
                {5, 2, 2},    // П'ять чисел, всі рівні 2
                {10, 3, 3}       // Три числа, всі рівні 0

        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void errorNegWhile2Test() {
        new Variant2().While2(3, -3); // а або б неможуть бути менше 0
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void errorEqualOrMoreWhile2Test() {
        new Variant2().While2(3, 3);  // б неможе бути рівне а
    }

    //////////////////////////////////////////////////////////////////////////
    @Test(dataProvider = "Minmax2Data")
    public void Minmax2Test(int N, int[] B, int expected) {
        int actual = new Variant2().Minmax2(N, B);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] Minmax2Data() {
        return new Object[][]{
                {2, new int[]{2, 2, 3, 3, 2, 2}, 4}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void errorMinmax2Test() {
        new Variant2().Minmax2(-3, new int[]{2, 2, 4, 4});
    }

    @Test(dataProvider = "Array2Data")
    public void Array2(int N, int[] expected) {
        int[] actual = new Variant2().Array2(N);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] Array2Data() {
        return new Object[][]{
                {2, new int[]{2, 4}}, // Мінімальне та максимальне
                {4, new int[]{2, 4, 8, 16}},
                {6, new int[]{2, 4, 8, 16, 32, 64}}
        };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void errorArray2Test() {
        new Variant2().Array2(-2);
    }

    @Test(dataProvider = "Matrix2Data")
    public void Matrix2Test(int M, int N, int[][] expected) {
        int[][] actual = new Variant2().Matrix2(M, N);
        assertEquals(actual, expected);
    }

    @DataProvider
    public Object[][] Matrix2Data() {
        return new Object[][]{
                {2, 3, new int[][]{{5, 10, 15}, {5, 10, 15}}}, // Матриця 2x3
                {4, 4, new int[][]{{5, 10, 15, 20}, {5, 10, 15, 20}, {5, 10, 15, 20}, {5, 10, 15, 20}}}  // Матриця 4x4
        };
    }
}