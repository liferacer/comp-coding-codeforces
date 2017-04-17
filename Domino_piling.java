import java.util.*;

public class Domino_piling {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int dominoes=0;
		
		if(1<=m&&m<=n&&n<=16){
			if((n!=1)&&(m!=1)){
				if((n%2==0)&&(m%2!=0)){
					dominoes=(m*n)/2;
				}
				if((n%2==0)&&(m%2==0)){
					dominoes=(m*n)/2;
				}
				if((n%2!=0)&&(m%2==0)){
					dominoes=(n*m)/2;
				}
				if((n%2!=0)&&(m%2!=0)){
					dominoes=((m*n)-1)/2;
				}
			}
			else if((m==1)&&(n%2==0)){
				dominoes=(n/2);
			}
			else if((m==1)&&(n%2!=0)){
				dominoes=(n/2);
			}
			//completed
		}
		System.out.println(dominoes);
		
	}
}
