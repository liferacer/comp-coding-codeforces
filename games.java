import java.util.*;

public class games {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int arr1[]=new int[in];
		int arr2[]=new int[in];
		for(int i=0;i<in;i++){
			arr1[i]=sc.nextInt();
			arr2[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<in-1;i++){
			for(int j=i+1;j<in;j++){
				if(arr1[i]==arr2[j]){
					count+=1;
				}
			}
		}
		for(int i=in-1;i>0;i--){
			for(int j=i-1;j>=0;j--){
				if(arr1[i]==arr2[j]){
					count+=1;
				}
			}
		}
		System.out.println(count);
	}
}
