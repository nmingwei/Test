package niu.example.test;

class Quen{
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	
	public Quen(int s){
		maxSize=s;
		queArray = new long[maxSize];
		front =0;
		rear =-1;
		nItems =0;
	}
	public void insert(long j){
		if(rear == maxSize -1)
			rear =-1;
		queArray[++rear]=j;
		nItems++;
	}
	public long remove(){
		long temp = queArray[front++];
		if(front == maxSize)
			front = 0;
		nItems--;
		return temp;
	}
	public long peekFront(){
		return queArray[front];
	}
	public boolean isFull(){
		return (nItems == maxSize);
	}
	public boolean isEmpty(){
		return (nItems ==0);
	}
	public int size(){
		return nItems;
	}
	
}
public class QuenApp {

	public static void main(String[] args) {
		Quen quen1 = new Quen(5);
		quen1.insert(12);
		quen1.insert(13);
		quen1.insert(14);
		quen1.insert(15);
		quen1.insert(16);
		quen1.insert(17);
		while(! quen1.isEmpty()){
		long tem =	quen1.remove();
		 System.out.print(tem +" ");
		}

	}

}
