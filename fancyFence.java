import java.util.*;
public class fancyFence {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int arr[]=new int[t];
		for(int i=0;i<t;i++){
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<t;i++){
			int n=(2*180)%(180-arr[i]);
			if(n==0){
				System.out.println("YES");
			}
			else
				System.out.println("NO");
		}
		
		
	}
}
