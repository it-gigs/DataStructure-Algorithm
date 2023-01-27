package sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void sort(int[] a, int n) {
		int x, j, temp, swaps;

		for (x = n - 2; x >= 0; x--) {
			swaps = 0;
			for (j = 0; j <= x; j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swaps++;
				}
			}
			if (swaps == 0)
				break;
		}
	}

	public static void main(String[] args) {
		int i, n;
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of elements : ");
		n = sc.nextInt();
		int[] a = new int[n];

		for (i = 0; i < n; i++) {
			System.out.print("Enter element " + (i + 1) + " : ");
			a[i] = sc.nextInt();
		}

		sort(a, n);

		System.out.println("Sorted array is : ");
		for (i = 0; i < n; i++)
			System.out.print(a[i] + " ");
		sc.close();
	}
}