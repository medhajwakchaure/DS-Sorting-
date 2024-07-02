import java.io.*;

class Sort
{
	public static int[] selectionSort(int arr[],int n)
	{
		for(int i=0;i<n-1;i++)
		{
			int minIndex=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[minIndex]>arr[j])
				{
				 minIndex=j;
				}
			}
			int temp;
			temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
		return arr;
	}
}
class Selection
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter array size:");
		
		int n=Integer.parseInt(br.readLine());
		
	     int arr[]=new int[n];
		 
		 System.out.println("Enter array elements : ");
		 
		 for(int i=0;i<n;i++)
		 {
			arr[i]=Integer.parseInt(br.readLine());
		 }
		 
		 System.out.println("Array elements are :");
		  for(int i=0;i<n;i++)
		 {
			 System.out.println(arr[i]);
		 }
		 
		 System.out.println("Selection sorting :");
		 
		 //Sort s=new Sort();
		 Sort.selectionSort(arr,n);
		  for(int i=0;i<n;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}
	
}