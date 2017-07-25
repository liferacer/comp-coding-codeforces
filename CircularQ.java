public class CircularQ{
	
	int rear=0;
	int front=0;
	int number=0;
	int arr[]=new int[5];
	
	public static void main(String args[]){
		CircularQ ob=new CircularQ();
		ob.add(3);
		ob.add(4);
		ob.add(5);
		ob.add(6);
		ob.add(7);
		
		ob.del();
		ob.del();
		ob.del();
		ob.add(9);
		ob.add(10);
		ob.add(11);
		ob.del();
		ob.del();
		
		ob.display();
		
	}
	private void display() {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++){
			if(arr[i]!='\0'){
				System.out.print(arr[i]+" ");
			}
		}
	}
	private void del() {
		// TODO Auto-generated method stub
		if(number!=0){
			arr[front]='\0';
			front=(front+1)%5;
			number--;
		}
		else
		{
			System.out.println("Queue is empty");
		}
	}
	private void add(int i) {
		// TODO Auto-generated method stub
		if(number!=arr.length){
			arr[rear]=i;
			rear=(rear+1)%5;
			number++;
		}
		else
		{
			System.out.println("Queue is full");
		}
	}
}