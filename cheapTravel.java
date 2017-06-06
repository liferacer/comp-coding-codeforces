import java.util.*;

public class cheapTravel {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int na=n*a;
		int x=n/m;
		int mb1=0;
		int mb21=0;
		int mb22=0;
		int mb23=0;
		int y=0;
		if(n%m==0){
			mb1=x*b;
			if(na<mb1){
				System.out.println(na);
			}
			else
			{
				System.out.println(mb1);
			}
		}
		else
		{
			if(n<m){
				float rohit=n*a;
				float mohit=b;
				if(rohit>mohit){
					System.out.println(b);
				}
				else
				{
					System.out.println(a);
				}
			}
			
			
			else
			{
				y=n%m;
				mb21=y*a+x*b;
				mb22=y*b+x*b;
				mb23=b+x*b;
				if(mb21<mb22&&mb21<mb23){
					if(na<mb21){
						System.out.println(na);
					}
					else
					{
						System.out.println(mb21);
					}
				}
				else if(mb22<mb21&&mb22<mb23)
				{
					if(na<mb22){
						System.out.println(na);
					}
					else
					{
						System.out.println(mb22);
					
					}
				}
				else
				{
					if(na<mb23){
						System.out.println(na);
					}
					else
					{
						System.out.println(mb23);
					
					}
				}
			}
		    
		}
	}
}

//100 8 10 1
//y=4  x=12 y=4 mb21=52   mb22=16   
