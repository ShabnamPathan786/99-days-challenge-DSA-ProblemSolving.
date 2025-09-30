
public class DetectCycle {

    private Node head;
    private Node tail;
    private int size;

    public DetectCycle() {
        this.size = 0;
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public boolean isCycle() {
        Node f = head;
        Node s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s) {
                return true;
            }

        }

        return false;

    }

    public int lenOfCycle() {
        Node f = head;
        Node s = head;

        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;

            if (f == s) {
                int len = 1;
                Node temp = s.next;
                while (temp !=s) {
                    len++;
                    temp = temp.next;
                }
                return len;

            }

        }

        return 0;
    }

    public Node startOfCycle(){
        if(!isCycle()) return null;
        int len =lenOfCycle();
        Node f=head;
        Node s=head;
       for(int i=len;i>0;i--){
           s=s.next;
        }
        while(f!=s){
           f=f.next;
           s=s.next; 
        }
        return s;
        
    }

    private class Node {

        private Node next;
        private int val;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        DetectCycle ll = new DetectCycle();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.tail.next = ll.head.next;
        System.out.println(ll.isCycle());
        System.out.println(ll.lenOfCycle());
        Node ans=ll.startOfCycle();
        System.out.println(ans.val);

    }

}
