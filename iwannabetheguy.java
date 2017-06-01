import java.util.*;

public class iwannabetheguy {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int x=sc.nextInt();
		int arrx[]=new int[x];
		for(int i=0;i<x;i++){
			arrx[i]=sc.nextInt();
		}
		int y=sc.nextInt();
		int arry[]=new int[y];
		for(int i=0;i<y;i++){
			arry[i]=sc.nextInt();
		}
		int arr[]=new int[input];
		for(int i=0;i<arr.length;i++){
			arr[i]=0;
		}
		for(int i=1;i<=x;i++){
			arr[arrx[i-1]-1]=arrx[i-1];
			if(i==arrx.length){
				break;
			}
		}
		for(int i=1;i<=y;i++){
			arr[arry[i-1]-1]=arry[i-1];
			if(i==arry.length){
				break;
			}
		}
		int flag=0;
		for(int i=0;i<input;i++){
			if(arr[i]!=0){
				flag=1;
			}
			else{
				flag=0;
				break;
			}
		}
		if(flag==1){
			System.out.println("I become the guy.");
		}
		else{
			System.out.println("Oh, my keyboard!");
		}
		
	}
}

//4
//3 3 2 1
//2 2 4


//4
//3 1 2 3
//2 2 3