import java.util.*;

public class puzzles {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int arr[]=new int[m];
		for(int i=0;i<m;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		 
		int subtract[]=new int[m-n+1];
		outer:for(int j=0;j<m;j++){
			inner:for(int i=j;i<j+n;i++){
				subtract[j]=arr[i+n-1]-arr[i];
				if(i==(m-n)){
					break outer;
				}
				break inner;
			}
		}
		
		int minValues = subtract[0]; 
	    for(int i=1;i<subtract.length;i++){ 
	      if(subtract[i] < minValues){ 
	        minValues = subtract[i]; 
	      } 
	    } 
	    
	    System.out.println(minValues);
			
		
		
	}
}
