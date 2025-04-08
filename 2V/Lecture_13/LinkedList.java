class ListNode
{
    int val;
    ListNode next;
    
 public ListNode(int x)
 {
     this.val = x;
     this.next = null;
 }
    
}

class LinkedList {

  public static void main(String[] args) {
      
      ListNode node1 = new ListNode(1);
      ListNode node2 = new ListNode(2);
      ListNode node3 = new ListNode(3);
      
      node1.next = node2;
      node2.next = node3;
      
      System.out.println("Node addresses:");
      
      System.out.println(node1);
      System.out.println(node2);
      System.out.println(node3);
      
     ListNode ptr = node1;
     
    System.out.println("ptr value:");
     
     while(ptr!=null)
     {
         System.out.println(ptr.val);
         ptr = ptr.next;
         
     }
     
     System.out.println("next values");
     
     
     ptr = node1;
     
     while(ptr!=null)
     {
         System.out.println(ptr.next);
         ptr = ptr.next;
         
     }
      
      
    
  }
}