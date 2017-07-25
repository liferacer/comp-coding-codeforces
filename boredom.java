import java.util.*;

public class boredom {
	static long  MAX=100005;
	static long val[]=new long[(int) MAX]; 
	static long DP[]=new long[(int) MAX];
	//static int newval[]=new int[MAX];
	static int M=0;
	
	static void initialize(){
		for(int i=0;i<MAX;i++){
			val[i]=0;
		}
	}
	
	static void fun(int arr[],int N){
		for(int i=0; i<N; ++i){
	        val[arr[i]]+=1;
	        if(arr[i]>M)
	            M=arr[i];
	    }
	    for(int i=1; i<=M; ++i){
	        val[i]*=i;
	    }
	    DP[0] = 0;
	    DP[1] = val[1];
	    DP[2] = Math.max(val[1],val[2]);
	    //DP[3] = Math.max(val[1]+val[3],val[2]);
	    
	    for(int i=3; i<=M; ++i){
	        DP[i] = Math.max(DP[i-2]+val[i], DP[i-1]);
	    }
	    
	    System.out.println(DP[M]);
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n]; 
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		fun(arr,n);
	}
}

