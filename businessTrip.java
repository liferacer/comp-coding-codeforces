import java.util.*;

public class businessTrip {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[12];
		for(int i=0;i<12;i++){
			arr[i]=sc.nextInt();		
		}
		for (int i = 0; i < 12; i++) 
        {
            for (int j = i + 1; j < 12; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                	int temp;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
		int sum=arr[0];
		int count=1;
		
		if(n!=0){
			for(int i=1;i<12;i++){
				if(sum>=n){
					break;
				}
				sum+=arr[i];
				count+=1;
			}
			if(sum>=n){

				System.out.println(count);
			}
			else if(sum<n){
				System.out.println("-1");
			}
		}
		
		else
		{
			System.out.println(n);
		}
		
		
	}
}

//12
//1 1 1 1 1 1 1 1 1 1 1 1

//50
//2 2 3 4 5 4 4 5 7 3 2 7
//7 7 5 5 4 4 4 3 3 2 2 2
//sum=48
//count=12
//-1

//15
//20 1 1 1 1 2 2 1 2 2 1 1
//20 2 2 2 2 1 1 1 1 1 1 1 
//1

//5
//1 1 1 1 2 2 3 2 2 1 1 1
//3 2 2 2 2 1 1 1 1 1 1 1
//2

//11
//1 1 4 1 1 5 1 1 4 1 1 1
//5 4 4 1 1 1 1 1 1 1 1 1
//2







