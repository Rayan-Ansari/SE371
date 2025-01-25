public class SeLinkList {
    public SeLinkList next;
    public SeLinkList prev; 
    public int a;
    public int b;
    public int c;
    public int index;
    
    public SeLinkList(int a, int b, int c, int index) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.index = index;
        this.next=null;
        this.prev = null;
    }
    public void printNode() {
        System.out.println("Nodes (index: " + index + ", a: " + a + ", b: " + b + ", c: " + c + ")");
    }


}
