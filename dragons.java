import java.util.*;

public class dragons {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n;i++){
			for(int j=0;j<2;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[i][0] > arr[j][0]) 
                {
                	int temp;
                    temp = arr[i][0];
                    arr[i][0] = arr[j][0];
                    arr[j][0] = temp;

                	int temp2;
                    temp2 = arr[i][1];
                    arr[i][1] = arr[j][1];
                    arr[j][1] = temp2;
                }
            }
        }
		int val=0;
		for(int i=0;i<n;i++){
			if(s>arr[i][0]){
				s=s+arr[i][1];
				val=i+1;
			}
			else
			{
				System.out.println("NO");
				break;
			}
		}
		if(val==n&&val!=0){
			System.out.println("YES");
		}
		
		
	}
}

//10 1
//1 1





