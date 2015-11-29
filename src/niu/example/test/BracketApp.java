package niu.example.test;

class StackY{
	private int maxSize;
	private char[] stackArray;
	private int top;
	public StackY(int s){
		maxSize=s;
		stackArray= new char[maxSize];
		top =-1;
	}
	public void push(char j){
		stackArray[++top]=j;
	}
	public char pop(){
		return stackArray[top--];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public boolean isFull(){
		return (top== maxSize-1);
	}
	public int size(){
		return top+1;
	}
	public char peekN(int n){
		return stackArray[n];
		
	}
}
class BracketChecker{
	private String input;
	public BracketChecker(String in){
		input =in;
	}
	public void check(){
		int stackSize = input.length();
		StackY theStack = new StackY(stackSize);
		for(int j=0; j<input.length();j++){
			char ch = input.charAt(j);
			switch(ch){
			case '{':
			case '[':
			case '(':
				theStack.push(ch);
				break;
			case '}':
			case ']':
			case ')':
				if(!theStack.isEmpty()){
				char	chx=theStack.pop();
				
				if((ch=='}'&& chx!='{')||(ch==']'&& chx!='[')
						||(ch==')'&& chx!='('))
					System.out.println("Error:"+ch+"at"+j);
				}
				else
					System.out.println("Error:"+ch+"at"+j);
				break;
				default:
					break;
			}
			
		}
		if(!theStack.isEmpty()){
			Object	chx=theStack.pop();
			System.out.println("Error:missing right delimiter"+chx);
		}
}
}
public class BracketApp {

	public static void main(String[] args) {
		String input;
		input =args[0];
		BracketChecker Stringchecker =new BracketChecker(input);
		Stringchecker.check();	
	}
}

	


