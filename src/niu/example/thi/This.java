package niu.example.thi;

public class This{
    public String name;
    public int age;
   
    public This(){
        this("微学苑", 3);
    }
  
    public This(String name, int age){
        this.name = name;
        this.age = age;
//        this.say();
    }
  
    public void say(){
        System.out.println("网站的名字是" + name + "，已经成立了" + age + "年");
    }
  
    public static void main(String[] args) {
        This obj = new This();
        obj.say();
    }
}