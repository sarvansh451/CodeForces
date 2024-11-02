import java.util.Scanner;
public class Solution{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int xor=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
			xor|=arr[i];
			
		}
		if(xor==0)
		{
			System.out.println("EASY");
		}
		else
		{
				System.out.println("HARD");
			
		}
		
	}
  
  }
