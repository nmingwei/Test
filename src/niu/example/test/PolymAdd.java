package niu.example.test;

import java.util.Scanner;



 
public class PolymAdd {
	 class Node{  
			int coef;
			int expon;
			Node next=null; 
			public Node(int coef,int expon){  
				this.coef=coef;
				this.expon=expon; 
				
			} 	
		}  
	private Node first1;
	private Node first2;
	private Node tempadd;
	private Node tempmult;

	
	public void insert(){
		 @SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
	        int num1=in.nextInt();
	        for(int i=num1;i>0;i--){
	        	
	        	Node newlink1 = new Node(in.nextInt(),in.nextInt());
	        	newlink1.next =first1;
	        	first1 =newlink1;
	        }
	        int num2=in.nextInt();
            for(int i=num2;i>0;i--){
	        	
	        	Node newlink2 = new Node(in.nextInt(),in.nextInt());
	        	newlink2.next =first2;
	        	first2 =newlink2;
	        }
	}
	public void multi(){
		Node head1 =first1;
		while(head1!=null){
			Node head2 =first2;
			while(head2!=null){
				int c=head1.coef*head2.coef;
				if(c!=0){
				inserttempmult(c,head1.expon+head2.expon);
				}
				head2=head2.next;
			}
			head1=head1.next;
		}
		if (tempmult==null){
			Node newlink3 = new Node(0,0);
			tempmult=newlink3;
		}
	}
	
	public void inserttempmult(int c, int e){
		Node newlink3 = new Node(c,e);
		Node current =tempmult;
		Node previous =null;
		while(current!=null && e<=current.expon){
			if(e==current.expon){
				break;
			}
			previous=current;
			current=current.next;
		}
		if(previous==null){
			newlink3.next=tempmult;
			tempmult=newlink3;
		}else if(e==current.expon){
			current.coef=current.coef+c;
			if(current.coef==0){
				previous.next=current.next;
			}
		}else{
			newlink3.next=current;
			previous.next=newlink3;
		}
		
	}
	public void Add(){
		Node head1 =first1;
		Node head2 =first2;
		while((head1!=null)&&(head2!=null)){
			if(head1.expon==head2.expon){
				if((head1.coef+head2.coef)!=0){
					Node newlink3 = new Node(head1.coef+head2.coef,head1.expon);
					newlink3.next=tempadd;
					tempadd=newlink3;
				}
				head1=head1.next;
				head2=head2.next;
			} 
			else if(head1.expon<head2.expon){
				if(head1.coef!=0){
				Node newlink3 = new Node(head1.coef,head1.expon);
				newlink3.next=tempadd;
				tempadd=newlink3;
				}
				head1=head1.next;
			}
			else {
				if(head2.coef!=0){
				Node newlink3 = new Node(head2.coef,head2.expon);
				newlink3.next=tempadd;
				tempadd=newlink3;
				}
				head2=head2.next;
			}
		}
		if((head1==null)&&(head2!=null)){
			while(head2!=null){
				if(head2.coef!=0){
					Node newlink3 = new Node(head2.coef,head2.expon);
					newlink3.next=tempadd;
					tempadd=newlink3;
					}
				head2=head2.next;
			}
		}
		if((head1!=null)&&(head2==null)){
			while(head1!=null){
				if(head1.coef!=0){
					Node newlink3 = new Node(head1.coef,head1.expon);
					newlink3.next=tempadd;
					tempadd=newlink3;
					}
				head1=head1.next;
			}
		}
		if (tempmult==null){
			Node newlink3 = new Node(0,0);
			tempmult=newlink3;
		}
			
	}
public void displaymult(){
		display(tempmult);
	}
public void displayadd(){
	display(tempadd);
}
	public void display( Node temp){  
		Node current=temp;
		if(current == null)  
			System.out.println("empty");    
        while(current.next!=null){ 
        		System.out.print(current.coef + " "+current.expon+" "); 
        		current = current.next;  
        }  
        if(current.next==null)
            System.out.print(current.coef + " "+current.expon); 
        	
    }  
	public static void main(String[] args) {
		
		PolymAdd  add1= new PolymAdd();
		add1.insert();
		add1.multi();
    	add1.displaymult();
		System.out.println("");
		add1.Add();
		add1.displayadd();

	}

}
