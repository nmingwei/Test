package niu.example.test;

import java.util.Scanner;

public class LinkedList {  
    private class Data{  
        private int coef;
        private int expon; 
        private Data next = null;  
          
        Data(int coef,int expon){  
            this.coef=coef;
            this.expon=expon;
        }  
    }  
      
    private Data first = null;  
    private Data last = null; 
    public void insert(int coef,int expon){  
        Data data = new Data( coef, expon); 
        if(first==null){
          
        first = data;
        }
        else{
        	last.next=data;
        	
        }
        last=data;
    }  
      
/*public Object deleteFirst() throws Exception{  
        if(first == null)  
            throw new Exception("empty!");  
        Data temp = first;  
        first = first.next;  
        return temp.obj;  
    }  
      
    public Object find(Object obj) throws Exception{  
        if(first == null)  
            throw new Exception("LinkedList is empty!");  
        Data cur = first;  
        while(cur != null){  
            if(cur.obj.equals(obj)){  
                return cur.obj;  
            }  
            cur = cur.next;  
        }  
        return null;  
    }  
      
    public void remove(Object obj) throws Exception{  
        if(first == null)  
            throw new Exception("LinkedList is empty!");  
        if(first.obj.equals(obj)){  
            first = first.next;  
        }else{  
            Data pre = first;  
            Data cur = first.next;  
            while(cur != null){  
                if(cur.obj.equals(obj)){  
                    pre.next = cur.next;  
                }  
                pre = cur;  
                cur = cur.next;  
            }  
        }  
    }  
      
    public boolean isEmpty(){  
        return (first == null);  
    }  */
      
    public void display(){  
        if(first == null)  
            System.out.println("empty");  
        Data cur = first;  
        while(cur != null){ 
        	if(cur==last)
            System.out.print(cur.coef + " "+cur.expon); 
        	else
        		System.out.print(cur.coef + " "+cur.expon+" "); 
            cur = cur.next;  
        }  
        System.out.print("\n");  
    }  
      
    public static void main(String[] args) throws Exception {  
        LinkedList P1 = new LinkedList();  
        LinkedList P2 = new LinkedList();  
        Scanner sc= new Scanner(System.in);
        int num1 =sc.nextInt();
        for(int i=num1;i>0;i--){
        	P1.insert(sc.nextInt(), sc.nextInt());
        }
        int num2=sc.nextInt();
        for(int i=num2;i>0;i--){
        	P2.insert(sc.nextInt(), sc.nextInt());
        }
        sc.close();
        P1.display();
        P2.display();
        
    }  
}  
