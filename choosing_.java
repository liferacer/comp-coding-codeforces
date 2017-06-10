import java.util.*;

public class choosing_ {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(5>=arr[i]+k){
				count+=1;
			}
		}
		int ans=count/3;
		System.out.println(ans);
		
	}	
}
