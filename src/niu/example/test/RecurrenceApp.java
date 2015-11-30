package niu.example.test;

public class RecurrenceApp {
	
	public   int triangle(int n){
		if(n==1){
			return 1;
		}else{
			return (n+ triangle(n-1));
		}
			
	}
	public  int factorial(int n){
		if(n==0){
			return 1;
		}else{
			return (n*factorial(n-1));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecurrenceApp recur=new RecurrenceApp();
		for(int i=1;i<5;i++)
		System.out.println(recur.triangle(i));
		for(int i=0;i<5;i++)
		System.out.println(recur.factorial(i));

	}
}