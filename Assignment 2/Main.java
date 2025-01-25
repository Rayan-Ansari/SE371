public class Main {
    public static void main(String[] args) {
        System.out.println("[Rayan Ansari - Git Assignment]");
        

        Player player = new Player();

        
        PlayerData playerData = new PlayerData();
        PlayerData[] myData = playerData.getMyData();

        
        player.initializeList(myData);  

        
        for (int i = 0; i < 3; i++) {
            SeLinkList[] minMaxNodes = player.findMinMaxWeight();
            SeLinkList minNode = minMaxNodes[0];
            SeLinkList maxNode = minMaxNodes[1];

            if (minNode != null) {
                int minWeight = minNode.a + minNode.b + minNode.c;
                System.out.println("Min weight player >> Node (" + minNode.index + ", " + minNode.a + ", " + minNode.b + ", " + minNode.c + ") and its weight " + minWeight + ".");
            }

            if (maxNode != null) {
                int maxWeight = maxNode.a + maxNode.b + maxNode.c;
                System.out.println("Max weight player >> Node (" + maxNode.index + ", " + maxNode.a + ", " + maxNode.b + ", " + maxNode.c + ") and its weight " + maxWeight + ".");
            }

            if (minNode != null) {
                player.removeNode(minNode);
            }
            if (maxNode != null && maxNode != minNode) {  
                player.removeNode(maxNode);
            }
        }

        
        System.out.println("[Done!]");

    }
}