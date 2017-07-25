import java.util.*;

public class SelectionSort {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		int val=0;
		for(int j=0;j<n;j++){
			int min=arr[j];
			for(int i=j;i<n;i++){
				if(arr[i]<=min){
					min=arr[i];
					val=i;
				}
			}

			int temp=arr[j];
			arr[j]=min;
			arr[val]=temp;
		}
		for(int i=0;i<n;i++){
			System.out.println(arr[i]);
		}
		
	}
}
