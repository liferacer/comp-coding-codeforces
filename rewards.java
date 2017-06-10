import java.util.*;

public class rewards {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		double arr[][]=new double[3][3];
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=sc.nextDouble();
			}
		}
		double n=sc.nextInt();
		double sum1=0;
		double sum2=0;
		for(int i=0;i<2;i++){
			for(int j=0;j<3;j++){
				if(i==0){
					sum1+=arr[i][j];
				}
				else
				{
					sum2+=arr[i][j];
				}
			}
		}
		
		double val1=Math.ceil(sum1/5.0);
		double val2=Math.ceil(sum2/10.0);
		
		double ans=val1+val2;
		if(ans<=n){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}
