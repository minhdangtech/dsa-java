package linked_list;

public class MyLinkedList {

    private static class Node {
        int val;
        Node next;
        public Node(int val) {
            this.val = val;
        }
    }

    private Node head;

    public MyLinkedList() {

    }

    public int get(int index) {
        if(head == null || index < 0) return -1;
        Node curr = head;
        int idx = 0;
        while (curr != null) {
            if(idx == index) {
                return curr.val;
            }
            curr = curr.next;
            idx++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        };
        newNode.next = head;
        head = newNode;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if(head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if(index < 0) return;
        Node newNode = new Node(val);
        if(index == 0 ) {
            newNode.next = head;
            head = newNode;
            return;
        }
        int idx = 0;
        Node curr = head;
        while (curr != null && idx < index - 1) {
            curr = curr.next;
            idx++;
        }
        if(curr == null) return;
        newNode.next = curr.next;
        curr.next = newNode;
    }

    public void deleteAtIndex(int index) {
        if(index < 0) return;
        if(index == 0 ) {
            head = head.next;
            return;
        }
        int idx = 0;
        Node curr = head;
        while (curr != null && idx < index - 1) {
            curr = curr.next;
            idx++;
        }
        if(curr == null) return;
        curr.next = curr.next.next;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node node1 = new Node(2);
        Node node2 = new Node(5);
        Node node3 = new Node(7);

        node1.next = node2;
        node2.next = node3;
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.head = node1;
        myLinkedList.display();
        myLinkedList.addAtHead(3);
        System.out.println();
        myLinkedList.display();
        myLinkedList.addAtTail(10);
        System.out.println();
        myLinkedList.display();
        myLinkedList.addAtIndex(1, 12);
        System.out.println();
        myLinkedList.display();
        myLinkedList.deleteAtIndex(1);
        System.out.println();
        myLinkedList.display();
        System.out.println();
        System.out.println(myLinkedList.get(1));

    }

}
