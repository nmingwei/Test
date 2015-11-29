package niu.example.thi;

public class This1{
    public static void main(String[] args){
        B b = new B(new A());
        b.print();
//    	 A a =new A();
    }
}
class A{
    public A(){
//       new B(this).print();  // ÄäÃû¶ÔÏó
    }
    public void print(){
        System.out.println("Hello from A!");
    }
}
class B{
    A a;
    public B(A a){
        this.a = a;
    }
    public void print() {
        a.print();
        System.out.println("Hello from B!");
    }
}
