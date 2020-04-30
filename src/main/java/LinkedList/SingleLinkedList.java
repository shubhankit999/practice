package LinkedList;

import java.util.LinkedList;

public class SingleLinkedList {

    Node head;

    public Node kReverseList(Node node, int k) {
        Node prev = null;
        Node current = node;
        Node next = null;
        int i = 0;
        while(current!=null && i<k) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            ++i;
        }


        if(next != null) {
            node.next = kReverseList(next, k);
        }

        return prev;
    }

    public void printList(Node node) {
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public Node reverseList(Node root) {
        Node prev = null;
        Node current = root;
        Node next = null;
        while(current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public Node reverseList(Node root, int k) {
        Node prev = null;
        Node current = root;
        Node next = null;


        while(current != null) {

        }
        return prev;
    }



    public Node rearrange(Node root) {
       SingleLinkedList list1 = new SingleLinkedList();
        SingleLinkedList list2 = new SingleLinkedList();
       Node current = root;
       int i =1;
        while(current != null) {
            if(i%2 == 1) {
                insert(list1, current.data);

            } else {
                insert(list2, current.data);
            }
            current = current.next;
            ++i;
        }
        Node n = reverseList(list2.head);
        while(n!= null) {
            insert(list1, n.data);
            n= n.next;
        }
        printList(list1.head);
        return current;
    }

    public SingleLinkedList insert(SingleLinkedList list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }

    public void printInReverse(Node n) {
        if(n==null) {
            return;
        }
        printInReverse(n.next);
        System.out.println(n.data);
    }

    public Node sortList(Node root) {

        if (root == null || root.next == null) {
            return root;
        }

        Node middle = findMiddle(root);

        Node nextofmiddle = middle.next;
        middle.next = null;

        // Apply mergeSort on left list
        Node left = sortList(root);

        // Apply mergeSort on right list
        Node right = sortList(nextofmiddle);

        // Merge the left and right lists
        Node sortedlist = mergeSort(left, right);


        return sortedlist;
    }

    private Node mergeSort(Node a, Node b) {
        Node result = null;
        if(a==null) {
            return b;
        }
        if(b==null) {
            return a;
        }

        if(a.data <= b.data) {
            result = a;
            result.next = mergeSort(a.next, b);
        }

        else {
            result = b;
            result.next = mergeSort(a, b.next);
        }

        return result;
    }

    public Node findMiddle(Node root) {
        if(root == null) {
            return root;
        }

        Node s = root;
        Node f = root;
        while (f != null && f.next != null) {

            s = s.next;
            f=f.next.next;
        }

        return s;
    }
}
