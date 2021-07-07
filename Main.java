import java.util.*;
import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int n = sc.nextInt();
		int [] arr = new int[n];
 		System.out.println("enter the elements of the array you want to reverse");
		for(int i=0; i<n; i++)
		{
			int ele = sc.nextInt();
			arr[i] = ele;
		}

		new Main().printLogic(arr, n);
	}

	public static void printLogic(int arr[], int n)
	{
		int [] array = new int[n];
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(arr[i] < 0)
			{
				array[count] = arr[i];
				count++;
			}
		}

		for(int j=0; j<n; j++)
		{
			if(arr[j] >= 0)
			{
				array[count] = arr[j];
				count++;
			}
		}

		System.out.println("requiered array is:");
		for(int k=0; k<n; k++)
		{
			System.out.print(array[k]+" ");
		}
	}
}