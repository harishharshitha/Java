package Programming;

public class Bubblesort {
	public static void main(String[] args)
	{
		int arr[]= {5,4,3,6,7};
		for(int j=1;j<arr.length;j++)
		{
			for(int i=1;j<arr.length;j++)
			{
				if(arr[i-1]>arr[i])
				{
					int temp=arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		for(int k=0;k<arr.length;k++)
		{
			System.out.println(arr[k]);
		}
	}

}
