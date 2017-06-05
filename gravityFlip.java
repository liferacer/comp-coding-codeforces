import java.util.*;

public class gravityFlip {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int arr[]=new int[in];
		for(int i=0;i<in;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<in;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
