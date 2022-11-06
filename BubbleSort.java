//3. WAP to sort an array using Bubble Sort Algorithm.

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) 
	{
		int temp=0;
		Scanner sc= new Scanner(System.in);
		
		int arr[]= new int[6];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	
		for(int i=0;i<arr.length;i++)
		{
			for(int j=1;j<arr.length-i;j++)
			{
				if(arr[j]<arr[j-1])
				{
				    temp=arr[j];
				    arr[j]=arr[j-1];
				    arr[j-1]=temp;
				    		
				}
			}
		}
		
		for(int elem:arr)
		{
			System.out.print(elem+" ");
		}
		
	}

}
