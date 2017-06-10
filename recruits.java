import java.util.*;

public class recruits {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		int val=0;
		for(int i=0;i<n;i++){
			if(arr[i]>0){
				count+=arr[i];
			}
			if(arr[i]==-1){
				if(count!=0){
					count-=1;
				}
				else 
				{
					val+=1;
				}
				
			}
		}
		System.out.println(val);
	}
}
