import java.util.*;

public class georgeandaccod {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int numofrooms=sc.nextInt();
		int arr[][]=new int[numofrooms][2];
		int count=0;
		int arr1[]=new int[numofrooms];
		for(int i=0;i<numofrooms;i++){
			for(int j=0;j<2;j++){
				arr[i][j]=sc.nextInt();
				
			}
		}
		for(int i=0;i<numofrooms;i++){
			arr1[i]=arr[i][1]-arr[i][0];
		}
		
		for(int i=0;i<numofrooms;i++){
			if(arr1[i]>=2){
				count=count+1;
			}
			
		}
		System.out.println(count);
	}
}
