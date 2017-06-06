import java.util.*;

public class amazingJoke {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String in1=sc.next();
		String in2=sc.next();
		String in3=sc.next();
		String newstr=in1+in2;
		
		int flag=0;
		int i=0;
		int len3=in3.length();
		int newlen=newstr.length();
		int templen3=len3;
		int templennew=newlen;
		while(i<templen3){
			char c=in3.charAt(i);
			in3=in3.replace(c,' ');
			newstr=newstr.replace(c,' ');
			in3=in3.replaceAll("[ ]", "");
			newstr=newstr.replaceAll("[ ]", "");
			templen3=in3.length();
			templennew=newstr.length();
			i=0;
			if(templen3==templennew){
				flag=1;
			}
			else
			{
				flag=0;
				break;
			}
		}
		if(flag==1){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}

	}
}


//PAPAINOEL
//JOULUPUKKI
//JOULNAPAOILELUPUKKI
//NO


/*
int flag=0;
int i=0;
int len=in3.length();
while(i<len){
	char c=in3.charAt(i);
	in3=in3.replace(c,' ');
	newstr=newstr.replace(c,' ');
	in3=in3.trim();
	newstr=newstr.trim();
	len=in3.length();
	i=0;
	if(in3.isEmpty()){
		flag=1;
	}
}
if(flag==1){
	System.out.println("YES");
}
else{
	System.out.println("NO");
}
*/