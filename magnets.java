import java.util.*;

public class magnets {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int arr[]=new int[in];
		for(int i=0;i<in;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<in;i++){
			if(i==in-1){
				count=count+1;
				break;
			}
			if(i<in-1){
				if(arr[i]==arr[i+1]){
					continue;
				}
				else
				{
					count=count+1;
					
				}
			}
		}
		System.out.println(count);
	}
}


//2
//10
//01

//i=0 
//i=1 

