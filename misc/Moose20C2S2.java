import java.util.*;
import java.io.*;
import java.lang.Math;

public class Moose20C2S2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int nextInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine().trim());
        }
        return Integer.parseInt(st.nextToken());
    }

    public static void main(String[] args) throws IOException{
        int r = nextInt();
        int q = nextInt();
        int currentX;
        int currentY;
        int radiusFromCenter;

        for (int i = 0; i < q; i++) {
            currentX = nextInt();
            currentY = nextInt();
            radiusFromCenter = (int) Math.round(Math.sqrt(Math.pow(currentX, 2) + Math.pow(currentY, 2)));
            if (radiusFromCenter != r) {
                System.out.print(i + " ");
            }
        }
    }
}
