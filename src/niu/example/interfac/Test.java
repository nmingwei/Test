package niu.example.interfac;

public class Test{
    public void test1(A a) {
        
        int c =a.doSth();
        System.out.println(c);   
    }
    public static void main(String[] args) {
        Test d = new Test();
        A a = new B();
        d.test1(a);
    }
}
interface A {
    public int doSth();
}
class B implements A {
    public int doSth() {
        System.out.println("now in B");
        return 123;
    }
}
