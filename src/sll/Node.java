package sll;
public class Node {
    String data; Node next;
    public Node() {}
    public Node(String data) {
        this.data=data;
    }
    public String getData() { return data; }
    public void setData(String data) { this.data=data; }
    public Node getNext() { return next; }
    public void setNext(Node n) { this.next=n; }
    public String toString() { return data; }
    public boolean equals(Node n) {
        return n.getData().compareTo(data)==0;
    }
}
