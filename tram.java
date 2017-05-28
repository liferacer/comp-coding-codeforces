import java.util.*;

public class tram {
	
	private static int maxValue1(int[] chars) {
	    int max = chars[0];
	    for (int ktr = 0; ktr < chars.length; ktr++) {
	        if (chars[ktr] > max) {
	            max = chars[ktr];
	        }
	    }
	    return max;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int input=sc.nextInt();
		int arr1[]=new int[input];
		int arr2[]=new int[input];
		for(int i=0;i<input;i++){
			arr1[i]=sc.nextInt();
			arr2[i]=sc.nextInt();
		}
		arr1[0]=0;
		arr2[input-1]=0;
		int max1=0;
		int temparr[]=new int[input];
		int newarr[]=new int[input];
		for(int k=1;k<input;k++){
        	newarr[k-1]=arr1[k-1]+arr2[k-1];
        	arr1[k]=newarr[k-1]-arr1[k];
        	
        }
        
        max1=maxValue1(newarr);
        System.out.println(max1);				
						
	}
}


/*if(2<=input&&input<=1000){
	for(int i=0;i<input;i++){
		if(0<=arr1[i]&&arr1[i]<=1000){
			if(0<=arr2[i]&&arr2[i]<=1000){

*/
