import java.util.*;
public class holidayOfEquality {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		if(arr.length==1){
			System.out.println("0");
			
		}
		else
		{
			int max=arr[0];
			
			for(int i=1;i<n;i++){
				if(arr[i]>max){
					max=arr[i];
				}
			}
			int total=0;
			for(int i=0;i<n;i++){
				total+=max-arr[i];
			}
			System.out.println(total);
		}
		
	}
}
