package LinkedList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.head = new Node(2);
        singleLinkedList.head.next = new Node(9);
        singleLinkedList.head.next.next = new Node(4);
        singleLinkedList.head.next.next.next = new Node(9);
        singleLinkedList.head.next.next.next.next = new Node(8);
        singleLinkedList.head.next.next.next.next.next = new Node(27);
        singleLinkedList.head.next.next.next.next.next.next = new Node(11);

        //singleLinkedList.findMiddle(singleLinkedList.head);

        singleLinkedList.printList(singleLinkedList.sortList(singleLinkedList.head));

    }
}
