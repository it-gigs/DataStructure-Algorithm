package sorting;

import java.util.Scanner;

public class HeapSort {

	public static void sort(int[] a, int n) {
		buildHeap(a, n);

		int maxValue;
		while (n > 1) {
			maxValue = a[1];
			a[1] = a[n];
			a[n] = maxValue;
			n--;
			buildDown(1, a, n);
		}
	}

	public static void buildHeap(int[] arr, int n) {
		int i;
		for (i = n / 2; i >= 1; i--)
			buildDown(i, arr, n);
	}

	private static void buildDown(int i, int[] a, int n) {
		int k = a[i];
		int lchild = 2 * i, rchild = lchild + 1;

		while (rchild <= n) {
			if (k >= a[lchild] && k >= a[rchild]) {
				a[i] = k;
				return;
			} else if (a[lchild] > a[rchild]) {
				a[i] = a[lchild];
				i = lchild;
			} else {
				a[i] = a[rchild];
				i = rchild;
			}
			lchild = 2 * i;
			rchild = lchild + 1;
		}

		/* If number of nodes is even */
		if (lchild == n && k < a[lchild]) {
			a[i] = a[lchild];
			i = lchild;
		}
		a[i] = k;
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
