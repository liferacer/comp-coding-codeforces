import java.util.*;

public class fedor {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[m+1];
		int count=0;
		for(int i=0;i<m+1;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++){
			if(Integer.bitCount(arr[i]^arr[m])<=k){
				count+=1;
			}
		}
		System.out.println(count);
	}
}