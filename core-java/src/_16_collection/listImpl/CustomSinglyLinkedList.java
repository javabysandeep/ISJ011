package _16_collection.listImpl;

public class CustomSinglyLinkedList {
    Node head;

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    class Node {
        Object data;
        Node next;

        Node(Object object) {
            this.data = object;
        }
    }

    public void add(Object obj) {
        Node node = new Node(obj);
        if (head == null) {
            head = node;
        } else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }
}
