import java.util.Scanner;

public class team {
	public static void main(String args[]){
		int count=0;
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][3];
		
		if(1<=n&&n<=1000){
			for(int i=0;i<n;i++){
				for(int j=0;j<3;j++){
					arr[i][j]=sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<n;i++){
			for(int j=0;j<1;j++){
				if(((arr[i][j]==1)&&(arr[i][j+1]==1))||((arr[i][j+1]==1)&&(arr[i][j+2]==1))||((arr[i][j]==1)&&(arr[i][j+2]==1))){
					count+=1;
				}
			}
		}
		
		System.out.println(count);
		
	}
}
