package niu.example.test;

import java.util.Scanner;

/*
 * 
 * ，其中 1≤i≤j≤K。“最大子列和”则被定义为所有连续子列元素的和中最大者。例如给定序列{ -2, 11, -4, 13, -5, -2 }，其连续子列{ 11, -4, 13 }有最大的和20。现要求你编写程序，计算给定整数序列的最大子列和。

输入格式:

输入第1行给出正整数K (≤100000)；第2行给出K个整数，其间以空格分隔。

输出格式:

在一行中输出最大子列和。如果序列中所有整数皆为负数，则输出0。

输入样例:
*/
public class MaxSubseqsum {
	
  
	public static void main(String[] args) {
		int Maxsum=-1;
		int Thissum=0;
		int min=0;
		int middle1=0;
		
		Scanner sc= new Scanner(System.in);
		
		int num =sc.nextInt();
		int max=num-1;
		int array[]= new int[num];
		
		 for(int i=0; i< num; i++){
	            array[i] = sc.nextInt();
	        }
		 
		 for (int i=0;i<num;i++){
			  Thissum +=array[i];
			  if(Thissum>Maxsum)
			  {
				  max=i;
				
				  Maxsum=Thissum;
				  min=middle1;
			  }
			  else if (Thissum <0)
			  {
				 middle1 =i+1;
				 
				 Thissum =0;
		      }
		 }	
		 if(Maxsum == -1){
			 Maxsum=0;
			 System.out.println(Maxsum+" "+array[min]+ " "+array[max]);
		 }
		 else
		 System.out.println(Maxsum+" "+array[min]+ " "+array[max]);
		
   }
}


