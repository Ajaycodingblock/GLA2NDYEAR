
class Listnode {

    int data;
    Listnode next;

    ///constructor;
    public Listnode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Add_at_Last {

    public static Listnode addlast(Listnode tail, int val) {
        //step 1 : create a listnode;
        Listnode newnode = new Listnode(val);

        //step 2 : tail ke next mein newnode;
        tail.next = newnode;

        //step 3 : update the new tail node;
        tail = newnode;

        //step 4 : return tail;
        return tail;
    }

    public static void traverse(Listnode head) {
        Listnode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Listnode head = new Listnode(12);
        Listnode tail = head;

        //insert after head -> ab head ke baad mein node insert karenge;
        tail = addlast(tail, 13);
        tail = addlast(tail, 14);
        tail = addlast(tail, 14);
        tail = addlast(tail, 23);
        tail = addlast(tail, 17);

        traverse(head);

    }

}