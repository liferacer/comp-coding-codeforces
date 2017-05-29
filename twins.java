import java.util.*;

public class twins {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int arr[]=new int[input];
		for(int i=0;i<input;i++){
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<input;i++) 
        {
            for (int j = i + 1; j < input; j++) 
            {
                if (arr[i] < arr[j]) 
                {
                	int temp=0;
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
		
		double sumofvalue0fcoins=0;
		for(int i=0;i<input;i++){
			sumofvalue0fcoins+=arr[i];
		}
		double halfsumofvalue0fcoins=0;
		halfsumofvalue0fcoins=sumofvalue0fcoins/2;
		double maxvalue=0;
		int count=1;
		for (int i=0;i<input;i++) {
			maxvalue+=arr[i];
			if(maxvalue>halfsumofvalue0fcoins){
				break;
			}
			else{
				count=count+1;
			}
			
		
		}
		System.out.println(count);	
	}
}
