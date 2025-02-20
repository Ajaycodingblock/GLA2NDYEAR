
class Node {

    int data;
    Node next;

    Node(int d) {
        this.data = d;
        this.next = null;
    }
}

public class Add_at_First {

    public static Node addFirst(Node head, int data) {
        //step 1 : create new node;
        Node newnode = new Node(data);

        //step 2 : newnode ke next mein head daal do;
        newnode.next = head;

        //step 3: upate head value;
        head = newnode;

        //step 4 : return head;
        return head;
    }

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(13);

        //insert At Head (head se pehle nodes insert karne haii);;
        head = addFirst(head, 12);
        head = addFirst(head, 11);
        head = addFirst(head, 10);
        head = addFirst(head, 9);
        head = addFirst(head, 8);

        //priting linkedlist
        traverse(head);
    }

}