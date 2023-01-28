package search;

import java.util.Scanner;

public class LinearSearch 
{
	
	public static int search(int[] a, int n, int searchValue) 
	{
		for(int i=0; i<n ; i++)
		{
			if( a[i] == searchValue )
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args)
	{
		int i,n,searchValue, index;

        Scanner scan = new Scanner(System.in);	
        
        System.out.print("Enter the number of elements : ");
        n = scan.nextInt();
        int[] a = new int[n];

        System.out.println("Enter the elements - ");
	    for(i=0; i<n; i++)
            a[i] = scan.nextInt();

	    System.out.print("Enter the search value : ");
        searchValue = scan.nextInt();
	
	    index = search(a, n, searchValue);
	
	    if( index == -1 )
	    	System.out.println("Value " + searchValue + " not present in the array");
	    else
	    	System.out.println("Value " + searchValue + " present at index " + index);
	}
}
