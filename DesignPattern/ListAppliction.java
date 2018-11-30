package HelloWorld;
import designpattern.*;
/**
 * Author:QiyeSmart
 * Created:2018/11/30
 */
public class ListAppliction {
    public static void main(String[] args) {
        //创建结点
        Node head=new Node("这是火车头");
        Node node1=new Node("这是车厢1");
        Node node2=new Node("这是车厢2");
        Node node3=new Node("这是车厢3");
        Node tail=new Node("这是火车尾");
        //连接结点
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);
        node3.setNext(tail);
        Node  cur=head;
        while(cur!=null){
            System.out.print(cur.getData());
            System.out.println(",");
            cur=cur.getNext();
        }
    }
}
