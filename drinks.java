import java.util.*;

public class drinks {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double arr[]=new double[n];
		double sum=0;
		double total=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextDouble();
			arr[i]=arr[i]/100.000;
			sum+=arr[i];
			total+=1.000;
		}
		double ans=sum/total;
		System.out.println(ans*100);
		
	}
}
