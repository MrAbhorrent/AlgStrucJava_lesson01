package ru.geekbrains;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Домашнее задание к уроку 01.");
        System.out.println("1. Воззведение в степень - " + RiseToDegree(2, 4));

        System.out.println("2. Поиск минимального элемента");
        int[] sampleArray = { 2, 1, 6, 9, 3, 4, 11, 7, 5};
        printArray(sampleArray);
        System.out.println(" min = " + FindMinArray(sampleArray));

        System.out.println("3. Нахождение среднего арифметического");
        printArray(sampleArray);
        System.out.println("Среднее арифметического - " + ArithmeticMean(sampleArray));
    }

    public static long RiseToDegree(int x, int k) {
        // Возведение числа x в степень k
        // Мы перемножаем число на себя k раз
        // Сложность алгоритма O(n)
        long tempValue = 1;
        for (int i = 0; i <= k; i++) {
            tempValue *= x;
        }
        return tempValue;
    }

    public static int FindMinArray(int[] array) {
        // Поиск минимального значения в массиве
        // Предполагаем что первый элемент в массиве является минимальным и выносим его в переменную.
        // Проходим по массиву один раз сравнивая переменную с каждым элементом массива.
        // Если элемент массива будет меньше минимального заносим его значение в прееменную
        // Сложность алгоритма O(2n) - мы проходим по алгоритму и выполняем еще одно действие  в момент прохода

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static float ArithmeticMean(int[] array) {
        // Нахождение среднего арифметического массива
        // Сложность алгоритма O(2N) - выполяем действие с каждым элементом массива и еще одно действие
        float ArithmeticMean = 0f;
        for (int i = 0; i < array.length; i++) {
            ArithmeticMean += array[i];
        }
        return  ArithmeticMean/array.length;
    }

    // Это для красоты
    private static void printArray(int[] array) {
        // Выводим массив на экран
        System.out.print("[ "+ array[0]);
        for (int i = 1; i< array.length; i++) {
            System.out.printf(", %4d", array[i], 7);
        }
        System.out.println("]");
    }

}
