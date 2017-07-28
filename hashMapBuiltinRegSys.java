import java.util.*;
public class hashMapBuiltinRegSys {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<String,Integer> hs=new HashMap();
		for(int i=0;i<n;i++){
			String s=sc.next();
			if(!hs.containsKey(s)){
				hs.put(s, 0);
				System.out.println("OK");
			}
			else
			{
				hs.put(s, hs.get(s)+1);
				System.out.println(s+hs.get(s));
			}
		}
	}
}
