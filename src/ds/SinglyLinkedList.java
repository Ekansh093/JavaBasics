package ds;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        ListNode current = head;
        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public int length(){
        if(head == null) return 0;
        ListNode current = this.head;
        int count = 0;
        while (current != null){
            count++;
            current = current.next;
        }

        return count;
    }

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int data){
        ListNode newNode = new ListNode(data);

        if(head == null){
            head = newNode;
            return;
        }

        ListNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAt(int index, int data){
        ListNode newNode = new ListNode(data);
        if(index == 0) {
            insertFirst(data);
            return;
        }

        ListNode current = head;
        int count = 0;
        while (current.next != null){
            if(count == index - 1){
                ListNode temp = current.next;
                current.next = newNode;
                newNode.next = temp;
                break;
            }
            count++;
            current = current.next;
        }
    }

    public ListNode deleteFirst(){
        if(head == null) return null;

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast(){
        if(head == null || head.next == null) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while(current.next != null){
            previous = current;
            current = current.next;
        }
        previous.next = null;
        return current;
    }

    public ListNode remove(int index){
        if(index == 0) deleteFirst();
        ListNode current = head;
        ListNode previous = null;
        int count = 0;
        while (current.next != null){
            count++;
            previous = current;
            current = current.next;
            if(count == index){
                previous.next = current.next;
                break;
            }
        }
        return current;
    }

    public int get(int index){
        if(head == null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        int count = -1;
        ListNode current = head;

        while (current.next != null){
            count++;
            if(count == index){
                return current.data;
            }
            current = current.next;
            if (current.next == null) {
                return current.data;
            }
        }
        throw new IndexOutOfBoundsException("Index not found");
    }

    public boolean contains(int element){
        if(head == null) return false;
        ListNode current = head;

        while (current.next != null){
            if(current.data == element) return true;
            current = current.next;
        }
        return false;
    }

    public void reverse(){
        if (head == null) return;
        ListNode current = head;
        ListNode previous = null, next = null;

        while (current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    public ListNode middleNode(){
        if (head == null) return head;
        ListNode slowPtr = head, fastPtr = head;

        while (fastPtr!=null && fastPtr.next!=null){
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public ListNode elementFromLast(int n){
        if(head == null) return null;
        if(n<0) throw new IllegalArgumentException("Invalid value: " + n);

        ListNode refPtr = head;
        ListNode mainPtr = head;
        int count = 0;

        while (count<n){
            refPtr = refPtr.next;
            count++;
        }

        while (refPtr != null){
            mainPtr = mainPtr.next;
            refPtr = refPtr.next;
        }
        return mainPtr;
    }

    public void removeDuplicatesFromSortedList(){
        ListNode current = head;

        while (current != null && current.next!=null){
            if(current.data == current.next.data)
                current.next = current.next.next;
            else
                current = current.next;
        }
    }

    public static void main(String[] args) {

        SinglyLinkedList ssl = new SinglyLinkedList();
        ssl.head = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(2);

        ssl.head.next = second;
        second.next = third;
        third.next = fourth;

        /*ssl.display();
        System.out.println("============");
        System.out.println("Length = " + ssl.length());
        System.out.println("============");
        ssl.insertFirst(12);
        ssl.display();
        System.out.println("============");
        ssl.insertLast(15);
        ssl.display();
        System.out.println("============");
        ssl.insertAt(5,100);
        ssl.display();
        System.out.println("============");
        System.out.println(ssl.deleteFirst());
        ssl.display();
        System.out.println("============");
        ssl.deleteLast();*/

        ssl.display();
        /*System.out.println("============");
        System.out.println(ssl.remove(2).data);
        System.out.println("============");
        ssl.display();
        System.out.println("============");
        System.out.println(ssl.get(2));
        System.out.println("============");
        System.out.println(ssl.contains(100));
        System.out.println("============");
        ssl.reverse();
        ssl.display();
        System.out.println("============");
        ssl.insertLast(100);
        System.out.println(ssl.middleNode().data);*/
        System.out.println("============");
       // System.out.println(ssl.elementFromLast(2).data);
        ssl.removeDuplicatesFromSortedList();
        ssl.display();
    }
}
