import java.util.*;

public class vanyaAndLanterns {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int l=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		if(arr[0]!=0&&arr[n-1]==l){
			double a[]=new double[n];
			a[0]=arr[0];
			//System.out.print(a[0]);
			for(int i=1;i<n;i++){
				a[i]=(arr[i]-arr[i-1])/2.0;
				//System.out.print(a[i]);
			}
			double max = a[0];
	        for(int i = 0; i < n; i++)
	        {
	            if(max < a[i])
	            {
	                max = a[i];
	            }
	        }
	        System.out.println(max);
		}
		else if(arr[0]==0&&arr[n-1]!=l){
			double a[]=new double[n];
			for(int i=0;i<n-1;i++){
				a[i]=(arr[i+1]-arr[i])/2.0;
				//System.out.print(a[i]);
			}
			a[n-1]=l-arr[n-1];
			//System.out.print(a[n-1]);
			
			double max = a[0];
	        for(int i = 0; i < n; i++)
	        {
	            if(max < a[i])
	            {
	                max = a[i];
	            }
	        }

	        System.out.println(max);
		}
		else if(arr[0]!=0&&arr[n-1]!=l){
			double a[]=new double[n+1];
			a[0]=arr[0];
			//System.out.print(a[0]);
			for(int i=1;i<n;i++){
				a[i]=(arr[i]-arr[i-1])/2.0;
				//System.out.print(a[i]);
			}
			a[n]=l-arr[n-1];
			//System.out.print(a[n]);
			
			double max = a[0];
	        for(int i = 0; i < n+1; i++)
	        {
	            if(max < a[i])
	            {
	                max = a[i];
	            }
	        }

	        System.out.println(max);
		}
		else if(arr[0]==0&&arr[n-1]==l)
		{
			double a[]=new double[n-1];
			for(int i=0;i<n-1;i++){
				a[i]=(arr[i+1]-arr[i])/2.0;
				//System.out.print(a[i]);
			}
			
			double max = a[0];
	        for(int i = 0; i < n-1; i++)
	        {
	            if(max < a[i])
	            {
	                max = a[i];
	            }
	        }

	        System.out.println(max);
		}
	}
}
