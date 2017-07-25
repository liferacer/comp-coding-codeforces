import java.util.*;

public class scheduling {
	
	public class view{
		double com;
		double pri;
		view(){
			com=0;
			pri=0;
		}
	}

	view element=new view();
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		int f=0;
		scheduling ob[]=new scheduling[n];
		
		for(int i=0;i<n;i++){
			ob[i]=new scheduling();
		}
		
		double s[]=new double[n];
		
		for(int i=0;i<n;i++){
			ob[i].element.com=sc.nextInt();
			ob[i].element.pri=sc.nextInt();
			s[i]=ob[i].element.pri/ob[i].element.com;
		}
		
		for(int k=0;k<n;k++){
			double max=s[0];
			int temp=0;
			for(int i=1;i<n;i++){
				
				if(s[i]>max){
					max=s[i];
					temp=i;
				}
			}
			System.out.println(temp);
			c+=ob[temp].element.com;
			f+=ob[temp].element.pri*ob[temp].element.com;
			System.out.println(c+" "+f);
			s[temp]=0;
		}
		
		
		
		/*for(int i=0;i<n;i++){
			System.out.println(s[i]);
		}*/
	}
}
