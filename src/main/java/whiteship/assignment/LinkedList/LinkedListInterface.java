package whiteship.assignment.LinkedList;

public interface LinkedListInterface {
    public void setHead();
    public ListNode getHead();
    public void add(ListNode head, ListNode nodeToadd, int position);
    public void remove(ListNode head, int positionToRemove);
    public void check(ListNode head);
    public boolean contains(ListNode head, ListNode nodeTocheck);
}