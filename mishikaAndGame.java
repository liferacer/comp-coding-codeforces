import java.util.*;

public class mishikaAndGame {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		int cm=0;
		int cc=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<2;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<1;j++){
				if(arr[i][j]>arr[i][j+1]){
					cm+=1;
				}
				else if(arr[i][j]<arr[i][j+1]){
					cc+=1;
				}
			}
		}
		if(cc>cm){
			System.out.println("Chris");
		}
		else if(cc<cm)
		{
			System.out.println("Mishka");
		}
		else
		{
			System.out.println("Friendship is magic!^^");
		}
				
		
	}
}
