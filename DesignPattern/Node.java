package designpattern;

import javax.annotation.Generated;

/**
 * Author:QiyeSmart
 * Created:2018/11/30
 */
public class Node {
    private Object data;
    private Node next;

    public Node() {

    }
    public Node(Object data) {
        this.data=data;
    }
    public Node(Object data, Node next) {
        this.data=data;
        this.next=next;
    }


    public Object getData(){
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
