import java.util.*;

public class Next_round_A {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int count=0;
		if(1<=k&&k<=n&&n<=50){
			for(int i=0;i<n;i++){
				if(0<a[i]&&a[i]<=100){
					if(a[i]>=a[k-1]){
						count+=1;
						continue;
					}
					else
					{
						break;
					}
				}
			}
		}
		System.out.println(count);
		
	}
}
