import java.util.Scanner;
public class Solution{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int subtractions=scanner.nextInt();
		for(int i=0;i<subtractions;i++)
		{
		int lastdigit=number%10;
		if(lastdigit!=0)
		{
			number=number-1;
			
		}
		else
		{
			number=number/10;
			
		}
			
		}
		System.out.println(number);
	     
		
	}
 
  
  }
