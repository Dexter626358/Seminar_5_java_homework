package org.example;

import java.util.Arrays;

// Реализовать алгоритм пирамидальной сортировки (HeapSort). https://habr.com/ru/company/otus/blog/460087/
public class HeapSort {
    public static void main(String[] args) {
        int[] array = new int[]{24, 31, 15, 20, 52, 6};
        int length = array.length;
        HeapSort ob = new HeapSort();
        ob.sort(array);
        System.out.println("Сортированный массив: ");
        System.out.println(Arrays.toString(array));

        }

    public void sort(int[] array){
        int length = array.length;
        for (int i = length / 2 - 1; i >= 0; i--)
            heapify(array, length, i);
        for (int i=length-1; i>=0; i--)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    public void heapify(int arr[], int length, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < length && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < length && arr[r] > arr[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, length, largest);
        }
    }
}
