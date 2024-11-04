import java.util.Scanner;
public class Solution{
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
	       int k=scanner.nextInt();//cost of first banana//
	       int n=scanner.nextInt();//initial number of dollars//
	       int w=scanner.nextInt();//number of banana he wants//
	       int sum=(w * (2 * k + (w - 1) * k)) / 2;
	       int diff=sum-n;
	       if(diff<0)
	       {
	       	  System.out.println(0);
	       	
		}
		else{
		
	       System.out.println(diff);
	}
	       
		
	}
 
  
  }
