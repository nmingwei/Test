package niu.example.test;

 class Person{
	 private String lastname;
	 private String firstname;
	 private int age;
	 public Person(String last,String first,int a){
		 lastname=last;
		 firstname=first;
		 age =a;
	 }
	 public void displayPerson(){
		 System.out.print("lastname: "+ lastname);
		 System.out.print(", firstname:"+ firstname);
		 System.out.println(",Age:"+ age);
	 }
	 public String getlast(){
		 return lastname;
	 }
	 
 }
 
public class ObjectSort {
	private Person[] a;
	private int nElems;
	public ObjectSort(int max)
	{
		a= new Person[max];
		nElems=0;
	}
	public void insert(String last,String first,int age){
		a[nElems]= new Person(last,first,age);
		nElems++;
	}
	public void display(){
		for(int j=0;j<nElems;j++)
			a[j].displayPerson();
		System.out.println(" ");
	}
	public void insertionSort(){
		int in,out;
		for(out=1;out<nElems;out++){
			Person temp =a[out];
			in =out;
			while(in>0&&a[in-1].getlast().compareTo(temp.getlast())>0){
				a[in]=a[in-1];
				--in;
			}
			a[in]=temp;
		}
	}
}
class ObjectSortApp{
	public static void main(String[]args){
		int maxSize=100;
		ObjectSort arr=new ObjectSort(maxSize);
		arr.insert("Evans","Patty",24);
		arr.insert("Smith","Lorraine",37);
		arr.insert("Yee","Tom",43);
		arr.insert("Smith","Doc",59);
		arr.display();
		arr.insertionSort();
		System.out.println("After Sorting:");
		arr.display();
		
	}
}