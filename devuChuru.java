import java.util.*;

public class devuChuru {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(i<n-1){
				d-=(arr[i]+10);
				count+=2;
			}
			
			if(i==n-1){
				d-=arr[i];
				count+=d/5;	
			}
			//d-=5;
		}
		
		if(d<0){
			System.out.println("-1");
		}
		else
			System.out.println(count);
	}
}
