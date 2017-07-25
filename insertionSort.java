import java.util.*;

public class insertionSort {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++){
			int val=arr[i];
			for(int j=i;j>0;j--){
				if(val<arr[j-1]){
					int temp=arr[j-1];
					arr[j-1]=val;
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
		
		
	}
}
