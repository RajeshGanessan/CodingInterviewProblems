package InterviewPrograms;

public class LinkedList {

    //properties
    Node head;
    int count;

    //constructor
    public LinkedList(Node newNode) {
        head = newNode;
        count = 1;
    }

    //Methods
    //add
    public void add(int newData) {
        Node temp = new Node(newData);
        Node current = head;

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        count++;
    }

    //get
    public int get(int index) {

        Node current = head;
        for(int i=0;i < index ;i++){

            current = current.getNext();
        }

        return current.getData();
    }

    //size
    public int getSize(){

        return count;
    }

    //isEmpty
    public boolean isEmpty(){

        Node current = head;
        if(current.getNext()!=null){
            return false;
        } else {
            return true;
        }
    }

    //remove
    public void remove(){

        Node current =  head;
        while(current.getNext()!=null){
            current = current.getNext();
        }

    }



    public static void main(String[] args) {



    }

}
