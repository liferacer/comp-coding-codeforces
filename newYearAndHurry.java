import java.util.*;

public class newYearAndHurry {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int time=240;
		int rem=time-k;
		int sum=0;
		int count=0;
		for(int i=1;i<rem;i++){
			sum+=5*i;
			if(sum>rem){
				break;
			}
			count+=1;
			if(count==n){
				break;
			}
		}
		System.out.println(count);
	}
	
}
