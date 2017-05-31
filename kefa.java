import java.util.*;

public class kefa {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		int arr[]=new int[input];
		int count[]=new int[input];
		
		for(int i=0;i<input;i++){
			arr[i]=sc.nextInt();
		    count[i]=1;
		}
		
        int k=0;
			inner:for(int j=k;j<input-1;j++){
				if(arr[j]<=arr[j+1]){
					count[k]=count[k]+1;
				}
				else
				{
					k=j;
				}
			
		}

		int maxValue = count[0]; 
	    for(int i=1;i < count.length;i++){ 
	      if(count[i] > maxValue){ 
	         maxValue = count[i]; 
	      } 
	    }
	    System.out.println(maxValue);
	}
}


//6
//2 2 1 3 4 1
//count[0]=2  k=0 , j=0
//count[1]=1  k=1 , j=1
//count[2]=2  k=2 , j=2
//count[2]=3  k=2 , j=3
//count[4]=1  k=4 , j=4





	