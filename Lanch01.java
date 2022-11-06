// 1. WAP to find the duplicates present in an array.
//Ex: {1 1 2 2 3 4 5 6 7}  
//       1 2


import java.util.*;

public class Lanch01 {

	public static void main(String[] args)
	{
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[9];
        int ans=0;
        
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i]==arr[j])
        		{
        			ans=arr[j];
        			System.out.print(ans+" ");
        		}
        	}
        	
        }
        

	}

}
