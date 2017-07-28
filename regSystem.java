import java.util.*;
public class regSystem {
	
	int freq[]=new int[1000000];
	private void initialize() {
		// TODO Auto-generated method stub
		for(int i=0;i<1000000;i++){
			freq[i]=-1;
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		regSystem ob=new regSystem();
		ob.initialize();
		
		int n=sc.nextInt();
		String str[]=new String[n];
		String queue[]=new String[n];
		int val[]=new int[n];
		for(int i=0;i<n;i++){
			str[i]=sc.next();
			val[i]=ob.hash(str[i]);
			ob.display(str[i],val[i]);
		}
		
	}
	
	private int hash(String string) {
		// TODO Auto-generated method stub
		int total=0;
		for(int i=0;i<string.length();i++){
			char c=string.charAt(i);
			int ascii=(int)c;
			total+=(ascii);
		}
		freq[total]+=1;
		return freq[total];
	}

	private void display(String newstr, int i) {
		// TODO Auto-generated method stub
		
		int times=i;
		if(times>=1){
			String str=Integer.toString(times);
			newstr=newstr.concat(str); 
			System.out.println(newstr);
		}
		else
			System.out.println("OK");
		
	}

}
