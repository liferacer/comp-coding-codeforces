import java.util.*;

public class username {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=1;i<arr.length;i++){
			int a[]=new int[i];
			for(int k=0;k<a.length;k++){
				a[k]=arr[k];
			}
			Arrays.sort(a);
			int min=a[0];
			int max=a[a.length-1];
			if(arr[i]>max){
				count+=1;
			}
			else if(arr[i]<min)
			{
				count+=1;
			}
		}
		System.out.println(count);
	}
}


//5
//100 50 200 150 200
//max=100 min=100 arr[1]=50  