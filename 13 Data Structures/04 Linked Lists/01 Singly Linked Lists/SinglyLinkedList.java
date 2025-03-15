import java.util.LinkedList;

public class SinglyLinkedList {
    private Node head, tail;
    private int length;


    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public SinglyLinkedList() {
        length = 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertStart(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            length++;
        } else {
            node.next = head;
            head = node;
            length++;
        }
    }

    public void insertEnd(int value) {
        Node node = new Node(value);
        if (length == 0) {
            head = node;
            tail = node;
            length++;
        } else {
            tail.next = node;
            tail = node;
            tail.next = null;
            length++;
        }
    }

    public void insertAtIndex(int value, int index) {
        Node node = new Node(value);
        Node temp = head;
        int i = 0;
        while (i < index - 1) {
            temp = temp.next;
            i++;
        }
        node.next = temp.next;
        temp.next = node;
        length++;
    }

    public void removeEnd() {
        if (length == 0)
            System.out.println("List is empty");
        else {
            Node temp = head;
            Node prev = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            length--;
        }
    }

    public void removeStart() {
        if (length == 0)
            System.out.println("list is empty");
        else
            head = head.next;
        length--;
    }

    public void removeAtIndex(int index)
    {
        int i=0;
        Node temp = head;
        while(i < index-1)
        {
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
        length--;
    }
    public int search(int value)
    {
        int index = 0;
        Node temp = head;
        while(temp!=null)
        {
            if(temp.value == value)
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }
    public void getLength()
    {
        System.out.println("Length: " + length);
    }

}
