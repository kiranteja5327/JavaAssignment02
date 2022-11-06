
public class SelectionSort {

	public static void main(String[] args)
	{
		int arr[]= {9,8,2,1,10};
		
		for(int i=0;i<arr.length;i++)
		{
			int currentelement=arr[i];     
			int currentindex=i;              
			
			for(int j=i+1;j<arr.length;j++)    
			{
				if(arr[j]<currentelement)      
				
				{
					currentelement=arr[j];                         
					currentindex=j;            
				} 
				
			}
			
			if(i!=currentindex)
			{
				int temp= arr[i];
				arr[i]=currentelement;
				arr[currentindex]=temp;

		    }
		}
		
		for(int elem:arr)
		{
			System.out.print(elem+" ");
		}

	}

}
