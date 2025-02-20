public class Intersection_LinkedList {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Initialize two pointers, one for each list
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        // Traverse both lists
        while (pointerA != pointerB) {
            // When a pointer reaches the end of a list, it starts from the other list
            if (pointerA == null) {
                pointerA = headB;  // Move pointerA to the start of list B
            } else {
                pointerA = pointerA.next;  // Move pointerA to the next node in list A
            }

            if (pointerB == null) {
                pointerB = headA;  // Move pointerB to the start of list A
            } else {
                pointerB = pointerB.next;  // Move pointerB to the next node in list B
            }
        }

        // If there is an intersection, pointerA (and pointerB) will be the intersection node
        // If there is no intersection, both pointers will be null
        return pointerA;
    }

    
}
