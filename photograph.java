import java.util.*;

public class photograph {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int flag=0;
		String arr[][]=new String[n][m];
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				arr[i][j]=sc.next();
			}
			
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(arr[i][j].contains("C")||arr[i][j].contains("M")||arr[i][j].contains("Y")){
				flag=1;
				break;
				}
			}
		}
		
		if(flag==0){
			System.out.println("#Black&White");
		}
		else
		{
			System.out.println("#Color");
			
		}
		
	}
}
