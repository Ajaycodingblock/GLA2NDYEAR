 class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x, ListNode add) {
        this.val = x;
        this.next = add;
    }

    public ListNode(int x) {
        this.val = x;
        this.next = null;
    }
}

public class LLOpertaion {

    public static ListNode insertAtBeginning(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    public static ListNode insertAtEnd(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        ListNode ptr = head;
        while (ptr.next != null)
        {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        return head;
    }

    public static ListNode insertInMiddle(ListNode head, int data, int position) {
        ListNode newNode = new ListNode(data);
        ListNode ptr = head;
        for (int i = 0; i < position; i++) {
            ptr = ptr.next;
        }
        newNode.next = ptr.next;
        ptr.next = newNode;
        return head;
    }

    public static ListNode deleteFromBeginning(ListNode head) {
        head = head.next;
        return head;
    }

    public static ListNode deleteAtEnd(ListNode head) {
        ListNode ptr = head;
        while (ptr.next.next != null)
        {
            ptr = ptr.next;
        }
        ptr.next = null;
        return head;
    }

    public static ListNode deleteFromMiddle(ListNode head, int position) {
        ListNode ptr = head;
        for (int i = 0; i < position - 1; i++) {
            ptr = ptr.next;
        }
        ListNode nodeToDelete = ptr.next;
        ListNode nextNode = nodeToDelete.next;
        ptr.next = nextNode;
        return head;
    }

    public static void traverseALinkedList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        


        System.out.println("Original Linked List :- ");
        traverseALinkedList(node1);

        node1 = insertAtBeginning(node1, 0);  
        System.out.println("Linked List after inserting 0 at the beginning :- ");
        traverseALinkedList(node1);

        node1 = insertAtEnd(node1, 2);
        System.out.println("Linked List after inserting 2 at Last :- ");
        traverseALinkedList(node1);


    }
}

