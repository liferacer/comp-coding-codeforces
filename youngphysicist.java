import java.util.*;

public class youngphysicist {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int arr[][]=new int[input][3];
		for(int i=0;i<input;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int sum[]=new int[3];
		for(int j=0;j<3;j++){
			sum[j]=0;
		}
		for(int j=0;j<3;j++){
			for(int i=0;i<input;i++){
				sum[j]+=arr[i][j];
			}
		}
		int flag=1;
		for(int j=0;j<3;j++){
			if(sum[j]!=0){
				flag=0;
			}
		}
		if(flag==1){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
