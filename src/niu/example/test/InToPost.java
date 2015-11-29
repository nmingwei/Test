package niu.example.test;

public class InToPost {
	private StackY thestack;
	private String input;
	private String output = "";
	
	public InToPost(String in){
		input =in;
		int stackSize = input.length();
		thestack = new StackY(stackSize);
	}
	public String doTrans(){
		for(int j=0; j<input.length();j++){
			char ch = input.charAt(j);
			switch(ch)
			{
			case '+':
			case '-':
				gotOper(ch,1);
				break;
			case '*':
			case '/':
				gotOper(ch,2);
				break;
			case'(':
				thestack.push(ch);
				break;
			case ')':
				gotParen(ch);
				break;
			}
		}
		return output;
	}
	public void gotOper(char opthis,int prec1){
		while(!thestack.isEmpty()){
			char opTop = thestack.pop();
			if(opTop =='('){
				thestack.push(opTop);
				break;
			}
			else{
				int prec2;
				if(opTop =='+'||opTop=='-')
					prec2 = 1;
				else 
					prec2=2;
				if(prec2<prec1){
					thestack.push(opTop);
					break;
				}
				else
					output =output +opTop;
			}
		}
		thestack.push(opthis);
	}
	public void gotParen(char ch){
		while(!thestack.isEmpty()){
			char chx = thestack.pop();
			if(chx=='(')
				break;
			else
				output =output +chx;
		}
	}



}
