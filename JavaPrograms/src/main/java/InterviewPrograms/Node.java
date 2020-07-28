package InterviewPrograms;

public class Node {

    Node next;
    int data;

    public  Node(int newData){
        this.data = newData;
    }

    public Node(Node newNext,int newData){
        this.next = newNext;
        this.data = newData;
    }

    //Getters and setters
    public int getData(){
        return data;
    }

    public Node getNext(){
        return next;
    }

    public void setData(int newData){
        data = newData;
    }

    public void setNext(Node newNext){
        next = newNext;
    }

}
