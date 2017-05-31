import java.util.*;

public class presents {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int arr[]=new int[input];
		int newarr[]=new int[input];
		for(int i=0;i<input;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=1;i<=input;i++){
			newarr[arr[i-1]-1]=i;
		}
		for(int i=0;i<input;i++){
			System.out.print(newarr[i]+" ");
		}
	}
}
