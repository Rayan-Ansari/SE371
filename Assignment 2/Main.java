public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Player player1 = new Player();
        Player player2 = new Player();

        

        Player player = new Player();

        
        PlayerData playerData = new PlayerData();
        PlayerData[] myData = playerData.getMyData();

        
        player.initializeList(myData);  

        
        player.printPlayerData();  

        
        player.printNumPlayers();

        SeLinkList maxNode = player.findMaxWeight();
        if (maxNode != null) {
            int maxWeight = maxNode.a + maxNode.b + maxNode.c;
            System.out.println("Max weight player >> Node (index: " + maxNode.index + ", a: " + maxNode.a + ", b: " + maxNode.b + ", c: " + maxNode.c + ") with weight: " + maxWeight);
        
            System.out.println("Printing all player data:");
        SeLinkList current = player.tail;  
        while (current != null) {
            current.printNode();
            current = current.prev;  
        }
        System.out.println("\nRemoving the first node:");
        SeLinkList firstNode = player.head;
        player.removeNode(firstNode);
        player.printPlayerData();

        
        System.out.println("\nRemoving the last node:");
        SeLinkList lastNode = player.tail;
        player.removeNode(lastNode);
        player.printPlayerData();

        
        System.out.println("\nRemoving a middle node:");
        SeLinkList middleNode = player.head.next;  
        player.removeNode(middleNode);
        player.printPlayerData();
        }

    }
}