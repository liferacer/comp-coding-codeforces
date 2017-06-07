import java.util.*;

public class hipster {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		int b=sc.nextInt();
		if(r>b){
			int x=r-b;
			int y=x/2;
			System.out.print(b+" ");
			System.out.print(y);
		}
		else
		{
			int x=b-r;
			int y=x/2;
			System.out.print(r+" ");
			System.out.print(y);
		}
		
		
	}
}
