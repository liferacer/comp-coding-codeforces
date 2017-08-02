import java.util.*; 
public class duffmeat {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[n];
		for(int i=0;i<n;i++){
			a1[i]=sc.nextInt();
			a2[i]=sc.nextInt();
		}
		
		int min=a2[0];
		int position=0;
		int total=0;
		total+=(a1[0]*a2[0]);
		for(int i=1;i<n;i++){
			if(min>a2[i]){
				min=a2[i];
				position=i;
				
			}
			total+=(a1[i]*a2[position]);
		}
		
		System.out.println(total);
	}

}
