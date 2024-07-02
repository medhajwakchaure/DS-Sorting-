import java.io.*;

class Sort
{
	public int[] bubbleSort(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp;
					
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
class BubbleSort
{
	public static void main(String args[]) throws IOException
	{
		Sort s=new Sort();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter the size of an Array :");
		
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		
		System.out.println("Enter array elements :");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Array before sorting");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Array after sorting");
		
		s.bubbleSort(arr,n);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}