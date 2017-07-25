import java.util.*;

public class comboLock {
	
	int number=0;
	int front=0;
	int rear=0;
	int queue[]=new int[10];
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		comboLock ob=new comboLock();
		int n=sc.nextInt();
		int a1[]=new int[n];
		int a2[]=new int[n];
		String str1=sc.next();
		String str2=sc.next();
		
		
		for(int i=0;i<n;i++){
			a1[i]=Character.getNumericValue(str1.charAt(i));
		}
		for(int i=0;i<n;i++){
			a2[i]=Character.getNumericValue(str2.charAt(i));
		}
		
		for(int i=0;i<10;i++){
			ob.enqueue(i);
		}
		int item[]=new int[n];
		int total=0;
		for(int i=0;i<n;i++){
			item[i]=ob.dequeue(a1[i],a2[i]);
			total+=item[i];
		}
		System.out.println(total);
		
	}
	private int dequeue(int e1, int e2) {
		// TODO Auto-generated method stub
		front=0; 
		int count=0;
		for(int i=0;i<10;i++){
			//queue[front]=i;
			front=(front+1)%10;
			if(front==e1){
				break;
			}
		}
		for(int i=0;i<10;i++){
			if(queue[front]==e2){
				break;
			}
			front=(front+1)%10;
			count+=1;
		}
		
		int rem=10-count;
		if(rem>count){
			return count;
		}
		return rem;
	}
	private void enqueue(int i) {
		// TODO Auto-generated method stub
		
			queue[rear]=i;
			rear=(rear+1)%10;
			number+=1;
		
	}
}
