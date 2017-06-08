import java.util.*;

public class chess {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String arr[]=new String[8];
		for(int i=0;i<8;i++){
			arr[i]=sc.nextLine();
		}
		int countW=0;
		int countL=0;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				char c=arr[i].charAt(j);
				if(c=='Q'){
					countW+=9;
				}
				if(c=='R'){
					countW+=5;
				}
				if(c=='B'){
					countW+=3;
				}
				if(c=='N'){
					countW+=3;
				}
				if(c=='P'){
					countW+=1;
				}
	
				
				if(c=='q'){
					countL+=9;
				}
				if(c=='r'){
					countL+=5;
				}
				if(c=='b'){
					countL+=3;
				}
				if(c=='n'){
					countL+=3;
				}
				if(c=='p'){
					countL+=1;
				}
				
				
			}
		}
		
		if(countL<countW){
			System.out.println("White");
		}
		else if(countL>countW){
			System.out.println("Black");
		}
		else
		{
			System.out.println("Draw");
		}
	}
}
