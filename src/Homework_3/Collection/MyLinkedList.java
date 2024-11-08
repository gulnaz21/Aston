package Homework_3.Collection;

public class MyLinkedList<T> {
    private Node head;
    private Node tail;
    private int size;
    private class Node{
        T val;
        Node next;
        Node prev;
        public Node(T val){
            this.val = val;
        }
        public Node(T val, Node next, Node prev){
            this(val);
            this.next = next;
            this.prev = prev;
        }

        @Override
        public String toString() {
            return val.toString();
        }
    }
    public MyLinkedList(){

    }
    public MyLinkedList(MyLinkedList<T> collection){
        addAll(collection);
    }

    public void addLast(T val){
        if (head == null){
            firstNode(val);
        }
        else {
            Node node = new Node(val, null, tail);
            tail.next = node;
            tail = node;
            size++;
        }
    }

    public void addFirst(T val){
        if (head == null)
            firstNode(val);
        else {
            Node node = new Node(val, head, null);
            head.prev = node;
            head = node;
            size++;
        }
    }

    public boolean add(T val){
        addLast(val);
        return true;
    }

    public T get(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        else {
            return findNode(index).val;
        }
    }

    public T remove(int index){
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException();

        T val;
        if (index == 0){
            val = head.val;
            head = head.next;
            head.prev = null;
        }
        else if (index == size - 1){
            val = tail.val;
            tail = tail.prev;
            tail.next = null;
        }
        else {
            Node node = findNode(index);
            val = node.val;
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        size--;
        return val;
    }

    public boolean addAll(MyLinkedList<T> list){
        if (head == null){
            head = list.head;
            tail = list.tail;
        }
        else {
            tail.next = list.head;
            tail = list.tail;
            size += list.size;
        }
        return true;
    }

    private Node findNode(int index){
        Node node = head;
        for (int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }

    private void firstNode(T val){
        Node node = new Node(val);
        head = node;
        tail = node;
        size++;
    }

    @Override
    public String toString() {
        Node node = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        if (node != null) {
            while (node.next != null) {
                sb.append(node).append(", ");
                node = node.next;
            }
            sb.append(node);
        }
        sb.append("]");
        return sb.toString();
    }
}