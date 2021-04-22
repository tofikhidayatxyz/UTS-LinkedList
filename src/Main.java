import uts.Node;
import uts.NodeService;
import uts.modes.User;

public class Main {
    /**
     * @args Nama : Tofik Hidayat
     * @args NIM  : 20200040056
     */

    public static void main(String[] args) {
        NodeService nodes = new NodeService();

        nodes.addNode(new Node(new User("Tofik", "1")));
        nodes.addNode(new Node(new User("Hidayat", "2")));
        nodes.addNode(new Node(new User("Nurwahid", "3")));

        System.out.println("======== Loop ===========");

        for (Node node : nodes.getAll()) {
            System.out.println("Data Node : " + node.data().name + " " + node.data().nim);
            System.out.println("Prev Node : " + (node.hasPrev() ?  node.prev().data().name : "No chain"));
            System.out.println("Next Node : " + (node.hasNext() ?  node.next().data().name : "No chain"));
            System.out.println("===================================");
        }

        System.out.println("========== Iterator ===========");


        Node currentNode = nodes.getAll().getFirst();

//        System.out.println(nodes.getAll().get(1).prev().data().name);

        while (currentNode.hasNext()) {
            System.out.println("Name : " +currentNode.data().name);
            System.out.println("Nim  : "+ currentNode.data().nim);
            currentNode = currentNode.next();

            System.out.println("=====================");

            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                // empty
            }
        }
    }
}
