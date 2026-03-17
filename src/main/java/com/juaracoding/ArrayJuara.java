package com.juaracoding;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayJuara {

    public static void main(String[] args) {
        
        int angka[] = {1,2,3,4,5};
        System.out.println(angka[0]);

        int numbers[] = new int[5];
        numbers[0] = 80;
        numbers[1] = 82;
        numbers[2] = 84;
        numbers[3] = 86;
        numbers[4] = 88;
        numbers[3] = 90;
        System.out.println(numbers[4]);

        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        System.out.println("Jumlah = "+sum);
        System.out.println("Rata-rata = "+sum/numbers.length);

        System.out.println("Foreach");
        for (int number : numbers) {
            System.out.println(number);
        }

        String products[] = {"Asus", "Zotac", "Gainward", "Colorful", "MSI"};
        for (String product : products) {
            System.out.println(product.toUpperCase());
        }

        int num[][] = {{1,2,3,4},{5,6,7}};
        System.out.println(num[1][2]);
        for (int i = 0; i < num.length; i++) { // 2
            for (int j = 0; j < num[i].length; j++) { // 4 dan 3
                System.out.println(num[i][j]); // num[0][0]
            }
            System.out.println();
        }

        // sort
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(products);
        System.out.println(Arrays.toString(products));

        // Mencari kata terpanjang
        String city = "Jakarta";
        System.out.println(city.length());

        String cities[] = {"Jakarta", "Medan", "Surabaya", "Bali", "Bandung"};
        String kotaTerpanjang = "";
        int index = 0;
        for (int i = 0; i < cities.length; i++) {
            if(cities[i].length() > kotaTerpanjang.length()){
                kotaTerpanjang = cities[i];
                index = i;
            }
        }
        System.out.println(kotaTerpanjang+" index ke "+index); // Surabaya index ke 2

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan jumlah data = ");
        int jumlah = scanner.nextInt();
        int prices[] = new int[jumlah];
        for (int i = 0; i < prices.length; i++) {
            System.out.println("Masukan harga = ");
            prices[i] = scanner.nextInt();
        }       

    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        // Outer loop: iterates through each element's final position
        for (int i = 0; i < n - 1; i++) {
            // Inner loop: compares adjacent elements and performs swaps
            for (int j = 0; j < n - i - 1; j++) {
                // If the element at j is greater than the next element, swap them
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

}
