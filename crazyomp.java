import java.util.*;
public class crazyomp {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int position=0;
		for(int i=1;i<n;i++){
			if(arr[i]-arr[i-1]>c){
				/*for(int j=0;j<=i;j++){
					arr[j]=0;
				}*/
				position=i;
			}
		}

		int ans=arr.length-position;
		
		System.out.println(ans);
		
	}
}
