import java.util.*;

public class ActivitySelection {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s[]=new int[n];
		int f[]=new int[n];
		for(int i=0;i<n;i++){
			s[i]=sc.nextInt();
			f[i]=sc.nextInt();
		}
		System.out.println("0");
		int j=0;
		for(int i=1;i<n;i++){
			if(s[i]>=f[j]){
				System.out.println(i);
				j+=1;
			}
			
		}
		
	}
}
