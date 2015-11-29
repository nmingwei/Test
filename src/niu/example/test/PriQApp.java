package niu.example.test;

class PriQ{
	private int maxSize;
	private long[] queArray;
	private int nItems;
	public PriQ(int s){
		maxSize=s;
		queArray = new long[maxSize];
		nItems =0;
	}
	public void insert(long item){
		int j;
		if(nItems ==0)
			queArray[nItems++]=item;
		else{
			for (j =nItems-1;j>=0;j--){
				if(item> queArray[j])
					queArray[j+1]=queArray[j];
				else
					break;
			}
			queArray[j+1]=item;
			nItems++;
		}
			
	}
	public long remove(){
		return queArray[--nItems];
	}
	public long peekMin(){
		return queArray[nItems-1];
	}
	public boolean isFull(){
		return (nItems == maxSize);
	}
	public boolean isEmpty(){
		return (nItems ==0);
	}
}
public class PriQApp {

	public static void main(String[] args) {

		PriQ thePQ= new PriQ(5);
		thePQ.insert(12);
		thePQ.insert(15);
		thePQ.insert(13);
		thePQ.insert(16);
		thePQ.insert(14);
//		thePQ.insert(17);
		while(! thePQ.isEmpty()){
			long tem =	thePQ.remove();
			 System.out.print(tem +" ");
			}
	}

}
