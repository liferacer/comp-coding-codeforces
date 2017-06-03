import java.util.*;

public class evenOdds {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		long in=sc.nextLong();
		long out=sc.nextLong();
		long ans=0;
		long k=in/2;
		if(in%2!=0){
			k=k+1;
		}
		if(out<=k){
			ans=out*2-1;
			System.out.println(ans);
		}
		else if(out>k)
		{
			if(in%2==0){
				ans=2*out-in;
				System.out.println(ans);
			
			}
			else if(in%2==1)
			{
				ans=2*out-in-1;
				System.out.println(ans);
			}
		}
	}
}


//1 3 5 7 2 4 6
// 1 3 5 7 9 11 2 4 6 8 10 12