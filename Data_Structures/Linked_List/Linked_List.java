package DSA_Programs.Data_Structures.Linked_List;


class Node<T> {
    T data;
    Node<T> next;  // Self-Referential Field

    Node(T data) {
        this.data = data;
        next = null;
    }
}

public class Linked_List<T> {
    Node<T> head = null;

    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        Node<T> currentNode = head;
        if (head == null)
            head = newNode;
        else {
            while (currentNode.next != null)
                currentNode = currentNode.next;
            currentNode.next = newNode;
        }
    }


    public void addAtStart(T data){
        Node<T> newNode = new Node<>(data);
        newNode.next = head;
        head = newNode;
    }

    public void delete(T data) {
        Node<T> currentNode = head;

        if(currentNode.data == data){
            head = head.next;
            return;
        }
        while (currentNode.next != null && currentNode.next.data != data ) {
            currentNode = currentNode.next;
        }
        if(currentNode.next != null){
            currentNode.next = currentNode.next.next;
        }


    }

    public void printList() {
        Node<T> currentNode = head;
        System.out.print("[ ");
        while (currentNode != null) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Linked_List list = new Linked_List();
        list.add(1);
        list.add(5);
        list.add(6);
        list.add(9);
        System.out.println("Before Deletion : ");
        list.printList();
        list.delete(2);
        System.out.println("After Deletion : ");
        list.printList();
    }
}
