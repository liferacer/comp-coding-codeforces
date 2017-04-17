import java.util.*;

public class String_task {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		String str = sc.next();
		int len=str.length();
		
		if(str!=""){
			if(0<=len&&len<=100){
				str=str.toLowerCase();
				if(str.contains("y")||str.contains("a")||str.contains("e")||str.contains("i")||str.contains("o")||str.contains("u")){
					str=str.replace("a","");
					str=str.replace("e","");
					str=str.replace("i","");
					str=str.replace("o","");
					str=str.replace("u","");
					str=str.replace("y","");
				}
				
				str=str.replaceAll("",".");
				int index=str.length();
				String substr=str.substring(index-1);
				substr="";
				String substrbig=str.substring(0, index-1);
				str=substrbig+substr;
				
			}
		}
		System.out.println(str);
		//completed
		
	}
}
