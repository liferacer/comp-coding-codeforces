import java.util.*;

public class designtut {
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int input=sc.nextInt();
		if(input%2==0){
			int m=input/2;
			if(m%2==0){
				int n=m/2;
				int x=(n-1)*2;
				int y=(n+1)*2;
				System.out.println(x+" "+y);
			}
			else if(m%2!=0){
				int n=m/2;
				int x=(n)*2;
				int y=(n+1)*2;
				System.out.println(x+" "+y);
			}
		}
		else if(input%2!=0)
		{
			int x=9;
			int y=input-x;
			System.out.println(x+" "+y);
		}
	}
}

//m=12/2=6
//6 is even 
//n=6/2=3
//x=(3-1)*2
//y=(3+1)*2

//m=26/2=13
//13 is odd
//n=13/2=6
//x=n*2
//y=(n+1)*2

//m=15/3=5
//15%3==0
//n=m/2=2
//x=3*(n)
//y=3*(n+1)

//m=23/3=7
//15%3!=0
//int rem=23%3=2
//int n=m/2=3
//x=(n-1)*3+rem
//y=(n+2)*3

//m=29/3=9
//29%3=2
//rem=2
//n=4
//x=(4-1)*3+2=11
//y=(4+2)*3=18

