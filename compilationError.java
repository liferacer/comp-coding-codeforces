import java.util.*;

public class compilationError {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long a1[]=new long[n];
		int total1=0; 
		for(int i=0;i<n;i++){
			a1[i]=sc.nextLong();
			total1+=a1[i]; 
		}
		int total2=0; 
		long a2[]=new long[n-1];
		for(int i=0;i<n-1;i++){
			a2[i]=sc.nextLong();
			total2+=a2[i];
		}
		System.out.println(total1-total2);
		int total3=0; 
		long a3[]=new long[n-2];
		for(int i=0;i<n-2;i++){
			a3[i]=sc.nextLong();
			total3+=a3[i];
		}
		System.out.println(total2-total3);
	}
}
