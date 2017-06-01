import java.util.*;

public class arrivalofgeneral {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int arr[]=new int[input];
		for(int i=0;i<input;i++){
			arr[i]=sc.nextInt();
		}
		int max = arr[0];
		int maxindex=0;
	    for(int i = 1; i <arr.length; i++)
	    {
	    	if(max < arr[i])
            {
                max = arr[i];
                maxindex=i;
            }
	    }
	   
	    int min = arr[0];
	    int minindex=0;
	    for(int i = 1; i <arr.length; i++)
	    {
	    	if(min >= arr[i])
            {
                min = arr[i];
                minindex=i;
            }
	    }
	    int count=0;
	    if(minindex<maxindex){
	    	count=(arr.length-minindex-1)+maxindex-1;
	    }
	    else
	    {
	    	count=(arr.length-minindex-1)+maxindex;
	    }
	    System.out.println(count);
	    
	}
}
