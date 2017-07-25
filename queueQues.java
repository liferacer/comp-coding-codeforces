import java.util.*;

public class queueQues {
	
	int front=0;
	int rear=0;
	int r[]=new int[100]; 
	int max=100;
	public static void main(String args[]) throws Exception{
		queueQues ob=new  queueQues();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String arr[]=new String[n];
		int m[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.next();
			if(arr[i].equals("E")){
				m[i]=sc.nextInt();
				//ob.enqueue(m);
			}
			else
			{
				//ob.dequeue();
			}
	            
		}
		for(int i=0;i<n;i++){
			//arr[i]=sc.next();
			if(arr[i].equals("E")){
				//m[i]=sc.nextInt();
				ob.enqueue(m[i]);
			}
			else
			{
				ob.dequeue();
			}
	            
		}
		
		
	}


	private void enqueue(int a) {
		// TODO Auto-generated method stub
		if(rear==max){
			System.out.println("overflow");
		}
		else
		{
			r[rear]=a;
			System.out.println("1");
			rear++;
		}
	}
	
	private void dequeue() {
		// TODO Auto-generated method stub
		if(front==rear){
			System.out.println("-1"+" "+"0");
		}
		else
		{
			int temp=r[front]; 
			front++;
			System.out.println(temp+" "+"0");
		}
		
	}

}
