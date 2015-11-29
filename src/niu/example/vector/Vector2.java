package niu.example.vector;


import java.util.Vector;



public class Vector2{ 

public static void main(String args[]) { 
 Vector v=new Vector(); 
 v.addElement("one"); 
 v.addElement("two"); 
 v.addElement("three"); 
 v.insertElementAt("zero",0); 
 v.insertElementAt("oop",3); 
 v.setElementAt("three",3); 
 v.setElementAt("four",4); 
 int size = v.size(); 
 System.out.println("size:" + size);
 for(int i = 0;i < v.size();i++){ 
	 System.out.println(v.get(i)); 
	 } 
 v.removeAllElements(); 
  } 
} 
