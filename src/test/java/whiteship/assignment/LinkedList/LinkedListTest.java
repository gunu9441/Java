package whiteship.assignment.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LinkedListTest {
    @Test
    @DisplayName("LinkedList forEachTest")
    void nodePrintForeach(){
        LinkedList Linkedlist = new LinkedList();
        Linkedlist.setHead();
        Linkedlist.add(Linkedlist.getHead(), new ListNode(1), 1);
        Linkedlist.add(Linkedlist.getHead(), new ListNode(2), 2);
        Linkedlist.add(Linkedlist.getHead(), new ListNode(3), 3);
        Linkedlist.add(Linkedlist.getHead(), new ListNode(4), 4);
        Linkedlist.add(Linkedlist.getHead(), new ListNode(5), 5);
        Linkedlist.add(Linkedlist.getHead(), new ListNode(6), 6);

        Linkedlist.check(Linkedlist.getHead());
    }
}