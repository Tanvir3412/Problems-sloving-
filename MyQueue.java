package datastructure;

public class MyQueue {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        myQueue.add(10);
        myQueue.add(11);
        myQueue.add(12);
        myQueue.add(13);
        myQueue.add(14);
        myQueue.add(15);
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();
        myQueue.remove();

        


        System.out.println(myQueue);
    }



    Node head;
    Node tail;

    public Node add (int number) {

        Node node = new Node(number);

        if (head == null && tail == null) {

            head = tail = node;

            return node;
        }
        tail.next = node;

        tail = node;

        return node;
    }

    public void remove () {
        if(head == null) return;
        Node temp = head;
        head = head.next;
        temp.next = null;
    }

    @Override
    public String toString() {
        Node current = head;
        String result = "[";
        // if there is no value
        if (head == null) return "List is empty";
        // if list has single value
        if (head == tail) return result + current.data + "]";
        //
        while (current.next != null) {
            result = result + current.data + ",";
            current = current.next;
        }
        result = result + current.data + "]";
        return result;
    }
}
