package niu.example.test;

import java.util.Scanner;

/*
 * 
 * ������ 1��i��j��K����������к͡��򱻶���Ϊ������������Ԫ�صĺ�������ߡ������������{ -2, 11, -4, 13, -5, -2 }������������{ 11, -4, 13 }�����ĺ�20����Ҫ�����д���򣬼�������������е�������к͡�

�����ʽ:

�����1�и���������K (��100000)����2�и���K������������Կո�ָ���

�����ʽ:

��һ�������������к͡��������������������Ϊ�����������0��

��������:
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


