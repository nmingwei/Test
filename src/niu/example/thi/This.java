package niu.example.thi;

public class This{
    public String name;
    public int age;
   
    public This(){
        this("΢ѧԷ", 3);
    }
  
    public This(String name, int age){
        this.name = name;
        this.age = age;
//        this.say();
    }
  
    public void say(){
        System.out.println("��վ��������" + name + "���Ѿ�������" + age + "��");
    }
  
    public static void main(String[] args) {
        This obj = new This();
        obj.say();
    }
}