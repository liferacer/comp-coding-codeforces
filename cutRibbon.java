import java.util.*;
public class cutRibbon {

	static int NIL=0;
	static int arr[]=new int[4001];
	
	static void initialize(){
		for(int i=0;i<4001;i++){
			arr[i]=NIL;
		}
	}
	
	static int F(int n,int a,int b,int c) {
		
		if(n>=0){
			if(arr[n]==NIL){
				if(n==0){
					arr[n] = n;
				}
				else {
					arr[n] = Math.max(Math.max(1+F(n-a,a,b,c), 1+F(n-b,a,b,c)), 1+F(n-c,a,b,c));
				}
			}
			
			
		}

		
		else if(n<0){
			return  -10000;
		}
		
		return arr[n];
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int maxNum=0;
		maxNum= F(input,A,B,C);
		System.out.println(maxNum);
	}
}
