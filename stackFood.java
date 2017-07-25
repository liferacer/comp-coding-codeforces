import java.util.*;

public class stackFood {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Stack st=new Stack();
		
		int n=sc.nextInt();
		int arr[][]=new int[n][2];
		for(int i=0;i<n;i++){
			inner:for(int j=0;j<2;j++){
				arr[i][j]=sc.nextInt();
				if(arr[i][0]==1){
					arr[i][1]=0;
					break inner;
				}
				else{
					//st.push(new Integer(arr[i][j]));
					continue;
				}
				
			}
		}
		for(int i=0;i<n;i++){
			if(arr[i][0]==1){
					if(st.isEmpty()){
						System.out.println("No Food");
					}
					else
					{
						System.out.println(st.peek());
						st.pop();
					}
				}
			else
			{
				st.push(new Integer(arr[i][1]));
			}
			
		}
		
	}
}
