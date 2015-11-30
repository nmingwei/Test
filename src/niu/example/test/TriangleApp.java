package niu.example.test;

public class TriangleApp {
	
	public  static int triangle(int n){
		if(n==1){
			return 1;
		}else{
			return (n+ triangle(n-1));
		}
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
