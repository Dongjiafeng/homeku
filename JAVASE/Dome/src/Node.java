public class Node {
    private Object data;
    private  Node next;
    public Object parintNode;

    public Node(Object data){
        this.data = data;
    }
    
    public  void  addNode(Node newNode){
        if (this.next==null){
            this.next=newNode;
        }else {
            this.next.addNode(newNode);
        }
    }
}
