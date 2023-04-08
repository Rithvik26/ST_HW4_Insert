package sll;
public class SLL {
    Node head; int size;
    public SLL() {}
    public SLL(Node head) { this.head = head; }
    /** insert n1 before n2 */
    public void insert(Node n1, Node n2)
            throws NullPointerException {
        if (n1 == null) {
            throw new NullPointerException("n1 is null");
        }
        if (head == null) {
            head = n1; size++; return;
        }
        if (n2 == null) {
            throw new NullPointerException("n2 is null");
        }
        if (n2 == head) {
            n1.setNext(n2);
            head = n1; size++;
            return;
        }
        Node n = new Node();
        n.data = n2.getData();
        n.next = n2.getNext();
        n2.setData(n1.getData());
        n2.setNext(n); size++;
    }
    public Node find(String attr, String value) {
        Node p=head;
        while (p!=null) {
            if (p.data.compareTo(value)==0) return p;
            p=p.next;
        }
        return null;
    }
    public boolean remove(Node n) {
        if (n==null)
            throw new NullPointerException
                    ("Node to remove is null.");
        if (head==null)
            throw new NullPointerException
                    ("Linked list is empty");
        if (head==n) {
            if (head.getNext()==null) {
                head=null;
            } else {
                head.setData(head.getNext().getData());
                head.setNext(head.getNext().getNext());
            }
            size--;
            return true;
        }
        if (n.getNext()==null) {
            Node p=head;
            while (p.getNext()!=n)
                p=p.getNext();
            p.setNext(null); size--;
            return true;
        }
        n.setData(n.getNext().getData());
        n.setNext(n.getNext().getNext());
        size--;
        return true;
    }
    public int size() { return size; }
    public String toString() {
        Node p = head; String r = "";
        while (p != null) {
            r += p.getData() + " ";
            p = p.next;
        }
        return r;
    }
    public Node head() { return head; }
}
