import java.util.Scanner;

public class theatre_square_1A{
	public static void main(String args[])  throws Exception {
		
		Scanner sc =new Scanner(System.in);
		double n=sc.nextInt();
		double m=sc.nextInt();
		double a=sc.nextInt();
		long ans=0;
		double up=Math.pow(10, 9);
		if ((n>=1 && (n<=up)) 
		    && (m>=1&& (m<=up)) 
		    && (a>=1 && (a<=up))) {
			        ans =  Math.round(Math.ceil((double)n/a)) * Math.round(Math.ceil((double)m/a));
		            System.out.println(ans); 
		        }
		
	}
}