import java.util.*;

public class flippingGame {

	int val[]=new int[1000];
	int dp[]=new int[1000];
	private void initialize() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000;i++){
			dp[i]=0;
		}
	}

	private int count(int i, int j, int[] a) {
		// TODO Auto-generated method stub
		int num=0;
		int newarr[]=new int[a.length];
		for(int k=0;k<a.length;k++){
			newarr[k]=a[k];
		}
		//newarr=a; 
		for(int k=i;k<=j;k++){
			newarr[k]=1-newarr[k];
		}
		for(int k=0;k<a.length;k++){
			num+=newarr[k];
		}
		return num;
	}
	
	private void F(int[] arr) {
		// TODO Auto-generated method stub
		
		int a[]=new int[arr.length];
		for(int k=0;k<a.length;k++){
			a[k]=arr[k];
		}
		for(int i=0;i<a.length;i++){
			initialize();
			for(int j=i;j<a.length;j++){
				int value=0;
				if(j==i){
					value=count(i,j,a);
					dp[j]=value;
					//System.out.println(value+" "+dp[j]);
				}
				else if(j>i&&j!=a.length-1)
				{
					value=count(i,j,a);
					dp[j]=Math.max(dp[j-1], value);
					//System.out.println(value+" "+dp[j]);
				}
				else if(j>i&&j==a.length-1){
					value=count(i,j,a);
					val[i]=Math.max(dp[j-1], value);
					
				}
			}
			//System.out.println(val[i]);
		}
	}

	
	private int findmax() {
		// TODO Auto-generated method stub
		int max=val[0];
		for(int i=1;i<val.length;i++){
			if(val[i]!=0){
				if(val[i]>max){
					max=val[i];
				}
			}
		}
		return max;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		flippingGame ob=new flippingGame();
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		ob.F(arr);
		

		int max=ob.findmax();
		if(arr[0]==0&&arr.length==1){
			System.out.println("1");
		}
		else
			System.out.println(max);
		
	}

	
	
}
