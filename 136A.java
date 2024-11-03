import java.util.Scanner;
public class Solution{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int[] arr=new int[n];
		int[] ans=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scanner.nextInt();
			
			ans[arr[i]-1]=i+1;
		}
		for(int i=0;i<ans.length;i++)
		{
			if(i==ans.length-1)
			{
					System.out.print(ans[i]);
					break;
			}
			System.out.print(ans[i]+" ");
		}
		
	}
    
    }
