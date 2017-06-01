import java.util.*;

public class gamewithsticls {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int count=0;
		int value=0;
		if(n<m){
			value=n;
		}
		if(n>m){
			value=m;
		}
		if(n==m){
			value=n;
		}
		if(value%2==0){
			System.out.println("Malvika");
		}
		else{
			System.out.println("Akshat");
		}
	}
}
