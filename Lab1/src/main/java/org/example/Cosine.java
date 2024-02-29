package org.example;

public class Cosine {
    // Функция для вычисления факториала
    private static double factorial(int n) {
        if (n == 0) return 1;
        double fact = 1;
        for (int i = 1; i <= n; ++i) {
            fact *= i;
        }
        return fact;
    }

    // Метод для вычисления косинуса с использованием ряда Тейлора
    public static double cosine(double x) {

        if (Double.isNaN(x) || Double.isInfinite(x)) {
            throw new IllegalArgumentException("Input value must be a finite number");
        }

        double result = 0;
        int n = 0;
        while (true) {
            double term = Math.pow(-1, n) * Math.pow(x, 2 * n) / factorial(2 * n);
            if (Math.abs(term) < 1e-10) break; // Прекращаем вычисления, когда очередной член ряда становится меньше заданной погрешности
            result += term;
            n++;
        }
        return result;
    }
}

