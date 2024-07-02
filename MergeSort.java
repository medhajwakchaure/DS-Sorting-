import java.io.*;


class Merged
{
	public void merge(int arr[],int start,int mid,int end)
	{
		int i,j,k=start;
		int n1=mid-start+1;
		int n2=end-mid;
		
		int temparr1[]=new int[n1];
		int temparr2[]=new int[n2];
		
		for(i=0;i<n1;i++)
		{
			temparr1[i]=arr[start+i];
		}
		for( j=0;j<n1;j++)
		{
			temparr2[j]=arr[mid+1+j];
		}
		
		while(arr[start]<=arr[mid] && arr[mid+1]<=arr[end])
		{
			if(arr[i]<=arr[j])
			{
				arr[k]=arr[i];
				i++;
			}
			else
			{
				arr[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			arr[k]=temparr1[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k]=temparr2[j];
			j++;
			k++;
		}
	}
	
	public void mergeSort(int arr[],int start,int end)
	{
		
		
		if(start<=end)
		{
			int mid=(end+start)/2;
			mergeSort(arr,start,mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);
		}
	}
	public static void main(String args[]) throws IOException
	{
		//Sort s=new Sort();
		
		Merged m=new Merged();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of an Array :");
		
		int n=Integer.parseInt(br.readLine());
		
		int arr[]=new int[n];
		
		System.out.println("Enter array elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		System.out.println("Before Merge Sort :");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		int start=0,end=n;
		m.mergeSort(arr,start,end);
		
		
		System.out.println("After Merge Sort :");
		
		
	     for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		
	}
}


