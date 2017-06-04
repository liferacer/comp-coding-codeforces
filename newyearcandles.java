import java.util.*;

public class newyearcandles {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in1=sc.nextInt();
		int in2=sc.nextInt();
    	int days=in1;
    	
    	for(int i=0;i<days;i++){
    		int arr[]=new int[days];
    		arr[i]=i+1;
    		if(arr[i]%in2==0){
    			days++;
    		}
    	}
    	System.out.println(days);
		
	}
	
}


//24 5
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24        25 26 27 28      29 


//23 5
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23         24 25 26 27       28  


//9 3
//1 2 3 4 5 6 7 8 9          10 11 12         13

//10 2
//1 2 3 4 5 6 7 8 9 10       11 12 13 14 15      16 17        18         19 















/*


	
}

*/