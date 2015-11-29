package niu.example.test;

class Link{
	public int iData;
	public double dData;
	public Link next=null;
	public Link(int id,double dd){
		iData=id;
		dData= dd;
	}
	public void displayLink(){
		System.out.print(" iData:"+iData+" dData:"+dData);
	}
}
class LinkList{
	private Link first;
	public LinkList(){
	first =null;
   }
	public boolean isEmpty(){
		return(first==null);
	}
	public void insertFirst(int id,double dd){
		Link newlink = new Link(id,dd);
		newlink.next =first;
		first =newlink;
	}
	/*public void Find( int key){
		Link current =first;
		while(!(current.next==null)){
			if(key==current.iData){
				System.out.println("find key"+key+"the dData is"+current.dData);
		 	     break;
			}
			System.out.println("find key"+current.iData);
			current=current.next;
		}
		
	}*/
	public void Find(int key){
		Link current=first;
		while(current.iData!=key){
			if(current.next==null){
				System.out.println("can not find key"+key);
			}
			else
				current=current.next;
		}
		System.out.println("find key"+key+"the dData is"+current.dData);
	}
	public Link deleteFirst(){
		Link temp =first;
		first= first.next;
		return temp;
	}
	/*public void deleteKey(int key){
		Link current=first;
		Link previous =first;
		while(!(current.next==null)){
			if(key ==current.iData){
				previous.next=current.next;
				break;
			}
			previous=current;
			current =current.next;
		}
	}*/
	public void deleteKey(int key){
		Link current=first;
		Link previous =first;
		while(current.iData!=key){
			if(current.next==null){
				System.out.println("can not find key"+key);
			}
			else{
				previous =current;
				current=current.next;
			}
				
		}
		if(current==first){
			first=first.next;
			System.out.println("delete key"+key+"the dData is"+current.dData);
		}
		else{
			previous.next=current.next;
		}
	}
	public void displayList(){
		System.out.print("list(first -->last): ");
		Link current =first;
		while(current !=null){
			current.displayLink();
			current=current.next;
		}
		System.out.println("");
	}
}	
public class LinkListApp {

	public static void main(String[] args) {
            LinkList theList = new LinkList();
            theList.insertFirst(22, 2.99);
            theList.insertFirst(33, 3.99);
            theList.insertFirst(44, 4.99);
            theList.insertFirst(55, 5.99);
            
            theList.displayList();
            theList.Find(22);
            theList.deleteKey(22);
            while(!theList.isEmpty()){
            	Link aLink =theList.deleteFirst();
            	aLink.displayLink();
            	System.out.println("");
            }
	}

}
