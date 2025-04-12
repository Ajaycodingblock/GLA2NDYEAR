import java.util.LinkedList;
import java.util.Queue;

public class Queue_same {
public static boolean chk(Queue<Integer> q1, Queue<Integer> q2) {
        if(q1.size()!=q2.size())
        {
          return false;
        }
        Queue<Integer> temp1 = new LinkedList<>(q1);
        Queue<Integer> temp2 = new LinkedList<>(q2);
     while(!(temp1.isEmpty()))
        {
         if(!(temp1.poll().equals(temp2.poll()))) 
         {
           return false;
         }
        }
        return true;
    }
    public static void main(String[] args) {
       
        Queue<Integer> queue1 =  new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();
        
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        
       queue2.add(1);
        queue2.add(2);
        queue2.add(3);
        
        
        boolean result = chk(queue1, queue2);
        System.out.println("Are the two queues equal? " + result);
    }
}
