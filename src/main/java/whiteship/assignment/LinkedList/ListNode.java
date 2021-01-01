package whiteship.assignment.LinkedList;

public class ListNode {
    private int value;
    private ListNode nextNode;

    public ListNode(int value){
        this.value = value;
        nextNode = null;
    }
    public int getValue(){
        return value;
    }
    public ListNode getNextNode(){
        return nextNode;
    }
    public void setNextNode(ListNode node){
        nextNode=node;
    }
}