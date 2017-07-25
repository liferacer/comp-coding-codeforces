import java.util.*;

public class initialbet {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int c1=sc.nextInt();
		int c2=sc.nextInt();
		int c3=sc.nextInt();
		int c4=sc.nextInt();
		int c5=sc.nextInt();
		int val=(c1+c2+c3+c4+c5)/5;
		int rem=(c1+c2+c3+c4+c5)%5;
			
		if(rem==0&&val!=0){
			
			System.out.println(val);
		
		}
		else
		{
			System.out.println("-1");
		}
	}
}
