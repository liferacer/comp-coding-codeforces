import java.util.*;
public class buttons {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int val=0;
		int x=1;
		for(int i=n-1;i>0;i--){
			val+=(i*x);
			x+=1;
		}
		val+=1*n;
		System.out.println(val);
	}
}
