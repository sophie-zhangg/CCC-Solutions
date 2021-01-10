import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S220 {
// M is rows, N is columns, new coordinates must multiply to number inside the old cell
    // Start at (1,1), end is (M,N)

    static class Coord {
        int x;
        int y;

        public Coord(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //initialize tokenizer
    static StringTokenizer st;

    //creates callable function for input
    static int nextInt() throws IOException {
        //while the tokenizer does not return a null value or has no more tokens trim
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        //return integer.parseInt(val)
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException {
        int cell;
        int m = nextInt(); //num of cells in row
        int n = nextInt(); // num of cells in column
        ArrayList<Coord>[] room = new ArrayList[(m+1)*(n+1)];
        for (int i=0; i< room.length; i++) {
            room[i] = new ArrayList<>();
        }
        //input values into array
        for (int row = 1; row < m+1; row++) {
            for (int col = 1; col < n+1; col++) {
                //nextInt() is the inputted grid
                //the node is the coordinates
                cell = nextInt();
                if (cell <= m*n) {
                    room[cell].add(new Coord(row, col));
                }
            }
        }
        boolean [][] visited = new boolean[m+1][n+1];
        visited[m][n] = true;
        LinkedList<Coord> queue = new LinkedList<>();
        queue.add(new Coord(m, n));
        while (!queue.isEmpty()) {
            // Gets the head value and deletes it from queue
            Coord cur = queue.poll();
            for (Coord c: room[cur.x*cur.y]) {
                if(!visited[c.x][c.y]){
                    visited[c.x][c.y]=true;
                    queue.add(c);
                    //if the coordinates are both 1, that means they have successfully escaped
                    if(c.x==1 && c.y==1){
                        System.out.println("yes");
                        return;
                    }
                }
            }
        }
        System.out.println("no");
    }

}
