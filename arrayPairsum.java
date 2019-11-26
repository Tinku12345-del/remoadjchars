package Ques;
import java.util.*;
public class PairSumOfArray {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of first array");
		int m=s.nextInt();
		System.out.println("Enter the size of second array");
		int n=s.nextInt();
		int A[]=new int[m];
		System.out.println("Enter the elements");
		for(int i=0;i<m;i++)
		{
			A[i]=s.nextInt();
		}
		int B[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			B[i]=s.nextInt();
		}
		System.out.println("Enter the required number");
		int X=s.nextInt();
		System.out.println("Pairs");
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(A[i]+B[j]==X)
				{
					System.out.println(A[i]+" "+B[j]);
				}
			}
		}

	}

}
