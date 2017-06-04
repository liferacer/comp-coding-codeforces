import java.util.*;

public class newyeartransport {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int index=sc.nextInt();
		int arr[]=new int[n];
		for(int i=1;i<n;i++){
			arr[0]=0;
			arr[i]=sc.nextInt();
		}
		int flag=0;
		for(int i=1;i<n;i++){
			int sum=0;
			sum=arr[i]+i;
			if(sum==index){
				flag=1;
				break;
			}
			else
			{
				i=sum;
				i=i-1;
			}
			
		}
		if(flag==1){
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	}
}

//20 19
//13 16 7 6 12 1 5 7 8 6 5 7 5 5 3 3 2 2 1
//YES
//sum=13+1=14-->i=14
//sum=14+5=19


//8 4
//1 2 1 2 1 2 1
//1,2,4
//YES



