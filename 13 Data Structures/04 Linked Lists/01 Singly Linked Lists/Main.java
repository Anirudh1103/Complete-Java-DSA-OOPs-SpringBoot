public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.insertEnd(4);
        list.display();
        list.insertEnd(3);
        list.display();
        list.insertStart(5);
        list.display();
        list.insertAtIndex(111,1);
        list.display();
        list.removeEnd();
        list.display();
//        list.removeStart();
        list.display();
        list.removeAtIndex(1);
        list.display();

        System.out.println(list.search(5));
        System.out.println(list.search(4));
        System.out.println(list.search(11));
        list.getLength();
    }
}
