import java.util.*;

public class expression {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[3];
		for(int i=0;i<3;i++){
			arr[i]=sc.nextInt();
		}
		int sum[]=new int[12];
		sum[0]=arr[0]+arr[1]+arr[2];
		sum[1]=arr[0]+arr[1]*arr[2];
		sum[2]=arr[0]*arr[1]+arr[2];
		sum[3]=arr[0]*arr[1]*arr[2];
		sum[4]=(arr[0]+arr[1])+arr[2];
		sum[5]=arr[0]+(arr[1]+arr[2]);
		sum[6]=(arr[0]+arr[1])*arr[2];
		sum[7]=arr[0]+(arr[1]*arr[2]);
		sum[8]=(arr[0]*arr[1])+arr[2];
		sum[9]=arr[0]*(arr[1]+arr[2]);
		sum[10]=(arr[0]*arr[1])*arr[2];
		sum[11]=arr[0]*(arr[1]*arr[2]);
		
		int  max = sum[0];
	        for(int i = 0; i < 12; i++)
	        {
	            if(max < sum[i])
	            {
	                max = sum[i];
	            }
	        }
	        
	    System.out.println(max);
	}
}



/*
1+2+3=6
1+2*3=7
1*2+3=5
1*2*3=6
(1+2)+3=6
1+(2+3)=6
//(1+2)*3=9
1+(2*3)=7
(1*2)+3=5
1*(2+3)=5
(1*2)*3=6
1*(2*3)=6
*/