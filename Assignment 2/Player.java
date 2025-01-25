public class Player {
    public static int numPlayers=0;
    public SeLinkList head;
    public SeLinkList tail;
    private int indexCounter = 0;
    
    public Player(){
        head = null;
        tail = null;
        numPlayers++;
    }

    public void addPlayer(int a, int b, int c){
        SeLinkList newNode = new SeLinkList(a,b,c, indexCounter++);
        if (head == null) {
            head = newNode;  
            tail = newNode;
        } else {
            tail.next = newNode;  
            newNode.prev = tail;  
            tail = newNode;  
        }
    }

    public void removeNode(SeLinkList node) {
        if (node == null) {
            return;
        }

        
        if (node == head) {
            head = node.next;
            if (head != null) {
                head.prev = null;  
            } else {
                tail = null;  
            }
        }

        
        else if (node == tail) {
            tail = node.prev;
            if (tail != null) {
                tail.next = null;  
            } else {
                head = null;  
            }
        }

        
        else {
            if (node.prev != null) {
                node.prev.next = node.next;  
            }
            if (node.next != null) {
                node.next.prev = node.prev;  
            }
        }

        System.out.println("Node (index: " + node.index + ") removed.");
    }
    
    public void initializeList(PlayerData[] playerDataArray) {
        for (PlayerData data : playerDataArray) {
            addPlayer(data.a, data.b, data.c);  
        }
    }
    
    public void printNumPlayers(){
        System.out.println("Players: "+ numPlayers);
    }

    public void printPlayerData() {
        SeLinkList current = head;
        while (current != null) {
            System.out.println("Players a: " + current.a + ", b: " + current.b + ", c: " + current.c);
            current = current.next;
        }
    }

    public SeLinkList findMaxWeight() {
        if (head == null) {
            System.out.println("The list is empty.");
            return null;
        }

        SeLinkList current = head;
        SeLinkList maxNode = head;
        int maxWeight = head.a + head.b + head.c;

        while (current != null) {
            int currentWeight = current.a + current.b + current.c;
            if (currentWeight > maxWeight) {
                maxWeight = currentWeight;
                maxNode = current;
            }
            current = current.next;
        }

        return maxNode;
    }
    
    public static void main(String[] args) {
        PlayerData playerData = new PlayerData();
        PlayerData[] myData = playerData.getMyData();

        for  (PlayerData data : myData) {
            System.out.println("Players a: " + data.a + ", b: " + data.b + ", c: " + data.c);

            
        }
    }

}
