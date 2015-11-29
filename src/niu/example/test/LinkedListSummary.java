package niu.example.test;

//import java.util.HashMap;  
import java.util.Scanner;  
//import java.util.Stack;  


  
/** 
 *  
 * @author kerryfish 
 * ����java������Ĳ��� 
 * 1. �������н��ĸ���: getListLength  
 * 2. ��������ת: reverseList����������reverseListRec���ݹ飩  
 * 3. ���ҵ������еĵ�����K����㣨k > 0��: reGetKthNode  
 * 4. ���ҵ�������м���: getMiddleNode  
 * 5. ��β��ͷ��ӡ������: reversePrintListStack��reversePrintListRec���ݹ飩  
 * 6. ��֪����������pHead1 ��pHead2 �������򣬰����Ǻϲ���һ��������Ȼ����: mergeSortedList, mergeSortedListRec  
 * 7. �Ե������������,listSort���鲢��,insertionSortList�����룩 
 * 8. �ж�һ�����������Ƿ��л�: hasCycle  
 * 9. �ж������������Ƿ��ཻ: isIntersect  
 * 10. ��֪һ���������д��ڻ�������뻷�еĵ�һ���ڵ�: getFirstNodeInCycle, getFirstNodeInCycleHashMap  
 * 11. ����һ������ͷָ��head��һ�ڵ�ָ��delete��O(1)ʱ�临�Ӷ�ɾ���ڵ�delete: deleteNode 
 */  
public class LinkedListSummary {  
    /** 
     * @param args 
     *  
     */  
    public static class Node{  
    	int coef;
        int expon;
        Node next=null; 
        public Node(int coef,int expon){  
        	this.coef=coef;
            this.expon=expon; 
           
        } 
       
    }  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
    	Node head1=null;
    	Node last1=null;
    	Node head2=null;
    	Node last2=null;
    	
    
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        for(int i=num1;i>0;i--){
        	
        	if(head1==null){  
        		head1=new Node(in.nextInt(),in.nextInt());
        	
        	}  
        	else{  
        		head1.next=new Node(in.nextInt(),in.nextInt());  
        		head1=head1.next;
        	} 
        }
        int num2=in.nextInt();
        for(int i=num2;i>0;i--){
        	
        	if(head2==null){  
        		head2=new Node(in.nextInt(),in.nextInt());
        		last2=head2;
        	}  
        	else{  
        		last2.next=new Node(in.nextInt(),in.nextInt());  
        		last2=last2.next;
        	} 
        }
        in.close();  
        display(head1);
        display(head2);
        display(PolyAdd( head1,head2));
    }  
    public static void display(Node head){
    	if(head == null)  
            System.out.println("empty");
    	Node cur=head;
    	while(cur != null){ 
        	if(cur.next==null)
            System.out.print(cur.coef + " "+cur.expon); 
        	else
        		System.out.print(cur.coef + " "+cur.expon+" "); 
            cur = cur.next;  
        }  
        System.out.print("\n");  
    	
    }
    public static Node PolyAdd(Node head1,Node head2){
    	Node temp=null;
    	Node last=null;
    	 while(head1!=null&&head2!=null){  
    		 if(temp==null){
               if(head1.expon==head2.expon){
            	   temp=head1;
            	   temp.coef=head1.coef+head2.coef;
            	   head1=head1.next;
            	   head2=head2.next;
            	   
               }
               if(head1.expon>head2.expon){
            	   temp=head1;
            	   
            	   head1=head1.next;
               }
               if(head1.expon<head2.expon){
            	   temp=head2;
            	head2=head2.next;
               }
               last=temp;
    		 }else{
    			 if(head1.expon==head2.expon){
    				 last.next=head1;
              	   last.next.coef=head1.coef+head2.coef;
              	   head1=head1.next;
              	   head2=head2.next;
              	   
                 }
                 if(head1.expon>head2.expon){
                	 last.next=head1;
              	   head1=head1.next;
                 }
                 if(head1.expon<head2.expon){
                	 last.next=head2;
              	head2=head2.next;
                 }
    		 }
    		 last=last.next;
         }  
    	
    	return temp;
    	
    }
  /*  //�������н��ĸ���: getListLength   
    public static int getListLength(Node head){  
        int len=0;  
        while(head!=null){  
            len++;  
            head=head.next;  
        }  
        return len;  
    }  
    //��������ת,ѭ��  
    public static Node reverseList(Node head){  
        if(head==null||head.next==null)return head;  
        Node pre=null;  
        Node nex=null;  
        while(head!=null){  
            nex=head.next;  
            head.next=pre;  
            pre=head;  
            head=nex;  
        }  
        return pre;  
    }  
    //��������ת,�ݹ�  
    public static Node reverseListRec(Node head){  
        if(head==null||head.next==null)return head;  
        Node reHead=reverseListRec(head.next);  
        head.next.next=head;  
        head.next=null;  
        return reHead;  
    }  
    //���ҵ������еĵ�����K����㣨k > 0��  
    public static Node reGetKthNode(Node head,int k){  
        if(head==null)return head;  
        int len=getListLength(head);  
        if(k>len)return null;  
        Node target=head;  
        Node nexk=head;  
        for(int i=0;i<k;i++){  
            nexk=nexk.next;  
        }  
        while(nexk!=null){  
            target=target.next;  
            nexk=nexk.next;  
        }  
        return target;  
    }  
    //���ҵ�������м���   
    public static Node getMiddleNode(Node head){  
        if(head==null||head.next==null)return head;  
        Node target=head;  
        Node temp=head;  
        while(temp!=null&&temp.next!=null){  
            target=target.next;  
            temp=temp.next.next;  
        }  
        return target;  
    }  
    //��β��ͷ��ӡ������,�ݹ�  
    public static void reversePrintListRec(Node head){  
        if(head==null)return;  
        else{  
            reversePrintListRec(head.next);  
            System.out.println(head.value);  
        }  
    }  
    //��β��ͷ��ӡ������,ջ  
    public static void reversePrintListStack(Node head){  
        Stack<Node> s=new Stack<Node>();  
        while(head!=null){  
            s.push(head);  
            head=head.next;  
        }  
        while(!s.isEmpty()){  
            System.out.println(s.pop().value);  
        }  
    }  
    //�ϲ���������ĵ�����head1��head2��ѭ��  
    public static Node mergeSortedList(Node head1,Node head2){  
        if(head1==null)return head2;  
        if(head2==null)return head1;  
        Node target=null;  
        if(head1.value>head2.value){  
            target=head2;  
            head2=head2.next;  
        }  
        else{  
            target=head1;  
            head1=head1.next;  
        }  
        target.next=null;  
        Node mergeHead=target;  
        while(head1!=null && head2!=null){  
            if(head1.value>head2.value){  
                target.next=head2;  
                head2=head2.next;  
            }  
            else{  
                target.next=head1;  
                head1=head1.next;  
            }  
            target=target.next;  
            target.next=null;  
        }  
        if(head1==null)target.next=head2;  
        else target.next=head1;  
        return mergeHead;  
    }  
    //�ϲ���������ĵ�����head1��head2���ݹ�  
    public static Node mergeSortedListRec(Node head1,Node head2){  
        if(head1==null)return head2;  
        if(head2==null)return head1;  
        if(head1.value>head2.value){  
            head2.next=mergeSortedListRec(head2.next,head1);  
            return head2;  
        }  
        else{  
            head1.next=mergeSortedListRec(head1.next,head2);  
            return head1;  
        }  
    }  
    //�Ե������������,�鲢����,���������治����ѡ�õݹ�ĺϲ����������㷨����������Ƚϳ��������׳���ջ���  
    public static Node listSort(Node head){  
        Node nex=null;  
        if(head==null||head.next==null)return head;  
        else if(head.next.next==null){  
            nex=head.next;  
            head.next=null;  
        }  
        else{  
            Node mid=getMiddleNode(head);  
            nex=mid.next;  
            mid.next=null;  
        }  
        return mergeSortedList(listSort(head),listSort(nex));//�ϲ�������������������ݹ�  
    }  
    //�Ե������������,��������  
    public Node insertionSortList(Node head) {  
        if(head==null||head.next==null)return head;  
        Node pnex=head.next;  
        Node pnex_nex=null;  
        head.next=null;  
        while(pnex!=null){  
            pnex_nex=pnex.next;  
            Node temp=head;  
            Node temp_pre=null;  
            while(temp!=null){  
                if(temp.value>pnex.value)break;  
                temp_pre=temp;  
                temp=temp.next;  
            }  
            if(temp_pre==null){  
                head=pnex;  
                pnex.next=temp;  
            }  
            else{  
                temp_pre.next=pnex;  
                pnex.next=temp;  
            }  
            pnex=pnex_nex;  
        }  
        return head;  
    }  
    //�ж�һ�����������Ƿ��л�,����ָ��  
    public static boolean hasCycle(Node head){  
        boolean flag=false;  
        Node p1=head;  
        Node p2=head;  
        while(p1!=null&&p2!=null){  
            p1=p1.next;  
            p2=p2.next.next;  
            if(p2==p1){  
                flag=true;  
                break;  
            }  
        }  
        return flag;  
    }  
    //�ж������������Ƿ��ཻ,����ཻ���ص�һ���ڵ㣬���򷵻�null  
    //����������ж��Ƿ��ཻ��ֻ��Ҫ�����һ��ָ���Ƿ����  
    public static Node isIntersect(Node head1,Node head2){  
        Node target=null;  
        if(head1==null||head2==null)return target;  
        int len1=getListLength(head1);  
        int len2=getListLength(head2);  
        if(len1>=len2){  
            for(int i=0;i<len1-len2;i++){  
                head1=head1.next;  
            }  
        }else{  
            for(int i=0;i<len2-len1;i++){  
                head2=head2.next;  
            }  
        }  
        while(head1!=null&&head2!=null){  
            if(head1==head2){  
                target=head1;  
                break;  
            }  
            else{  
                head1=head1.next;  
                head2=head2.next;  
            }  
        }  
        return target;  
    }  
    //��֪һ���������д��ڻ�������뻷�еĵ�һ���ڵ�,����hashmap����Ҫ��ArrayList����Ϊ�ж�ArrayList�Ƿ����ĳ��Ԫ�ص�Ч�ʲ���  
    public static Node getFirstNodeInCycleHashMap(Node head){  
        Node target=null;  
        HashMap<Node,Boolean> map=new HashMap<Node,Boolean>();  
        while(head!=null){  
            if(map.containsKey(head))target=head;  
            else{  
                map.put(head, true);  
            }  
            head=head.next;  
        }  
        return target;  
    }  
    //��֪һ���������д��ڻ�������뻷�еĵ�һ���ڵ�,����hashmap  
    //�ÿ���ָ�룬���ж�һ�����������Ƿ��л�һ�����ҵ�����ָ���һ���ཻ�Ľڵ㣬��ʱ����ڵ���뻷��ʼ�ڵ�ĳ��Ⱥ�����Ͷ���뻷��ʼ�Ľڵ�ĳ������  
    public static Node getFirstNodeInCycle(Node head){  
        Node fast=head;  
        Node slow=head;  
        while(fast!=null&&fast.next!=null){  
            slow=slow.next;  
            fast=fast.next.next;  
            if(slow==fast)break;  
        }  
        if(fast==null||fast.next==null)return null;//�ж��Ƿ������  
        //�����ڵ���뻷��ʼ�ڵ�ĳ��Ⱥ�����Ͷ���뻷��ʼ�Ľڵ�ĳ������  
        slow=head;  
        while(slow!=fast){  
            slow=slow.next;  
            fast=fast.next;  
        }//ͬ����  
        return slow;  
          
    }  
    //����һ������ͷָ��head��һ�ڵ�ָ��delete��O(1)ʱ�临�Ӷ�ɾ���ڵ�delete  
    //��ϧ���ý�delete�ڵ�valueֵ�����¸��ڵ��ֵ�����ķ������������delete�����һ���ڵ㣬���У������ܵø��ӶȻ���O(1)  
    public static void deleteNode(Node head,Node delete){  
        //���ȴ���delete�ڵ�Ϊ���һ���ڵ�����  
        if(delete==null)return;  
        if(delete.next==null){  
            if(head==delete)head=null;  
            else{  
                Node temp=head;  
                while(temp.next!=delete){  
                    temp=temp.next;  
                }  
                temp.next=null;  
            }  
        }  
        else{  
            delete.value=delete.next.value;  
            delete.next=delete.next.next;  
        }  
        return;  
    }  */
}  
