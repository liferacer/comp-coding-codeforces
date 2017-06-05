import java.util.*;

public class epicgame {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		while(n>=0){
			int r1=0;
			int n1=n;
			int x=a;
			while(x!= 0)
			{
				if(x>n1){
					int temp;
					temp=x;
					x=n1;
					n1=temp;
				}
				if(x!=0){
					r1 = n1 % x;
				    n1 = x;
				    x = r1;
				}
				else if(x==0&&n1==a){
					n1=a;
				}
			    
			}
			n=n-n1;
			if(n<0){
				System.out.println("1");
				break;
			}
			
			int r2=0;
			int n2=n;
			int y=b;
			while(y!= 0)
			{
				if(y>n2){
					int temp;
					temp=y;
					y=n2;
					n2=temp;
				}
				if(y!=0){
					r2 = n2 % y;
				    n2 = y;
				    y = r2;
				}
				else if(y==0&&n2==b)
				{
					n2=b;
				}
			}
			n=n-n2;
			if(n<0){
				System.out.println("0");
				break;
			}
		}
		
	}
}

/*

*/