import java.util.*;

public class iqTest {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int in=sc.nextInt();
		int arr[]=new int[in];
		for(int i=0;i<in;i++){
			arr[i]=sc.nextInt();
		}
		int ce=0;
		int co=0;
		
		for(int i=0;i<in;i++){
			if(arr[i]%2==0){
				ce+=1;
			}
			else
			{
				co+=1;
			}
		}
		int index=0;
		if(ce==1){
			for(int i=0;i<in;i++){
				if(arr[i]%2==0){
					index=i+1;
				}
			}
		}
		if(co==1){
			for(int i=0;i<in;i++){
				if(arr[i]%2!=0){
					index=i+1;
				}
			}
		}
		System.out.println(index);
	}
}
