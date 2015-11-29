package niu.example.test;

class StackX{
	private int maxSize;
	private Object[] stackArray;
	private int top;
	public StackX(int s){
		maxSize=s;
		stackArray= new Object[maxSize];
		top =-1;
	}
	public void push(long j){
		stackArray[++top]=j;
	}
	public Object pop(){
		return stackArray[top--];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public boolean isFull(){
		return (top== maxSize-1);
	}
}
public class StackApp {

	public static void main(String[] args) {
		StackX theStack = new StackX(10);
		theStack.push(20);
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		while(!theStack.isEmpty()){
			Object value= theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}

	}

}
