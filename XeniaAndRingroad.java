import java.util.*;

public class XeniaAndRingroad {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[m];
		for(int i=0;i<m;i++){
			arr[i]=sc.nextInt();
		}
		long count=0;
		for(int i=0;i<m;i++){
			if(i!=m-1){
				if((arr[i]>arr[i+1])){
					count+=n-1;
					count+=1;
				}

				if(arr[i]<arr[i+1])
				{
					continue;
				}
			}
			
			if(i==m-1){
				count+=arr[i]-1;
			}
		}
		System.out.println(count);
	}
}
//4 3
//4 3 2
//1 2 3 4 1 2 3 4 1 2

//8+

//4 6
//3 2 1 3 4 2
//1 2 3 4 1 2 3 4 1 2 3 4 1 2
//13


//1 2 3 4 1 2 3 4 1 
//6

//1 2 3 4 5 1 2

//4 3
//2 3 4

//1 2 3 4
//3

//2 6 2 3
//1 2 3 4 5 6 1 2 3


/*int count=0;
for(int i=0;i<m-1;i++){
if(arr[i]>arr[i+1]){
	count+=n+arr[i+1]-1;
	System.out.println(count);
}
else if(arr[i]<arr[i+1]){
	count+=arr[i+1]-1;
	System.out.println(count);
}

}
System.out.println(count);
*/