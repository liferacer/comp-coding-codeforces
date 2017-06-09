import java.util.*;

public class maxInTable {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==0||j==0){
					arr[i][j]=1;
				}
				
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i!=0&&j!=0){
					arr[i][j]=arr[i-1][j]+arr[i][j-1];
				}
			}
		}
		int max = arr[0][0];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++)
			{
				if(max < arr[i][j])
				{
					max = arr[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
