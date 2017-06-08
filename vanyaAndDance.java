import java.util.*;

public class vanyaAndDance {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int arr[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			if(arr[i]<=h){
				c+=1;
			}
			else
			{
				c+=2;
			}
		}
		System.out.println(c);
		
	}
}
