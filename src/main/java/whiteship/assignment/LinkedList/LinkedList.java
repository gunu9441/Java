package whiteship.assignment.LinkedList;

public class LinkedList implements LinkedListInterface{
    private ListNode Head;

    public void setHead(){
        Head = new ListNode(0);
    }
    public ListNode getHead(){
        return Head;
    }
    public void add(ListNode head, ListNode nodeToAdd, int position){
        ListNode walker = head;                             //start from head
        for (int count = 0; count<position-1;count++)   //walk to add position
            walker = walker.getNextNode();
        nodeToAdd.setNextNode(walker.getNextNode());
        walker.setNextNode(nodeToAdd);
    }


    public void remove(ListNode head, int positionToRemove){
        ListNode walker = head;
        for (int count = 0; count<positionToRemove-1;count++)   //walk to add position
            walker = walker.getNextNode();

        walker.setNextNode(walker.getNextNode().getNextNode());

    }

    public void check(ListNode head){
        ListNode walker = head;
        while(walker.getNextNode()!=null){
            walker = walker.getNextNode();
            System.out.println(walker.getValue());
            System.out.println(walker.getNextNode());
            System.out.println("------------------------------");
        }
    }

    public boolean contains(ListNode head, ListNode nodeTocheck){
        int find_value = nodeTocheck.getValue();
        ListNode walker = head;
        while(walker.getNextNode()!=null){
            walker = walker.getNextNode();
            if(walker.getValue()==find_value)
                return true;
        }
        return false;
    }

    public int size(ListNode head){
        int size = 0;
        ListNode walker = head;
        while(walker.getNextNode()!=null){
            walker = walker.getNextNode();
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
//        LinkedList Linkedlist = new LinkedList();
//        Linkedlist.setHead();
//        Linkedlist.add(Linkedlist.getHead(), new ListNode(1), 1);
//        Linkedlist.add(Linkedlist.getHead(), new ListNode(2), 2);
//        Linkedlist.add(Linkedlist.getHead(), new ListNode(3), 3);
//        Linkedlist.add(Linkedlist.getHead(), new ListNode(4), 4);
//        Linkedlist.add(Linkedlist.getHead(), new ListNode(5), 5);
//        Linkedlist.add(Linkedlist.getHead(), new ListNode(6), 6);
//        Linkedlist.check(Linkedlist.getHead());
//        System.out.println("value 값을 갖고있나요?: "+Linkedlist.contains(Linkedlist.getHead(),new ListNode(4)));
//        System.out.println("------------------------------");
//        System.out.println("size: "+Linkedlist.size(Linkedlist.getHead()));
//        System.out.println("------------------------------");
//        Linkedlist.remove(Linkedlist.getHead(), 2);
//        Linkedlist.check(Linkedlist.getHead());
//        System.out.println("size: "+Linkedlist.size(Linkedlist.getHead()));
//        Linkedlist.add(Linkedlist.getHead(), new ListNode(100), 4);
//        Linkedlist.check(Linkedlist.getHead());
    }
}


