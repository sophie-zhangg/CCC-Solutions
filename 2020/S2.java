import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;

public class S2 {
// M is rows, N is columns, new coordinates must multiply to number inside the old cell
    // Start at (1,1), end is (M,N)

    static class Node {
        int cell;
        int product;

        public Node(int r, int c, int cell) {
            super();
            this.cell = cell;
            this.product = r * c;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine()); //num of cells in row
        int n = Integer.parseInt(br.readLine()); // num of cells in column
        LinkedList<Node> room = new LinkedList<>();
        String line;
        String[] tempArr;
        for (int i = 0; i < m; i++) {
            line = br.readLine();
            tempArr = line.split(" ");
            for(int elem = 0; elem < n; elem++) {
                room.add(new Node(i+1, elem+1, Integer.parseInt(tempArr[elem]))) ;
            }
            // Finished loading input into 2D array
        }
        System.out.println(findPathFromEnd(room, room.getLast(), room.getFirst()));
        br.close();
    }

    private static String findPathFromEnd(LinkedList<Node> room, Node source, Node destination) {
        // Write a queue, if not the final element put all its children behind in the queue
        LinkedList<Node> queue = new LinkedList<>();
        queue.add(source);
        Node node;
        while (!queue.isEmpty()) {
            node = queue.remove(); //removes head of linkedList
            if (node.product == destination.product) {
                return "yes";
            }
            room.remove(node);
            for (Node cell: room) {
                if (node.product == cell.cell) {
                    queue.add(cell);
                }
            }
        }
        return "no";
    }

}
