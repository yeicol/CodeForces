
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/689/A">Mike and Cellphone</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF689AMikeAndCellphone {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final int[][] MOVES = {{1, 0, 0, 0}, {0, 1, 1, 0}, {0, 1, 1, 1}, {0, 0, 1, 1}, {1, 1, 1, 0}, {1, 1, 1, 1}, {1, 0, 1, 1}, {1, 1, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 1}};

    public static void main(String[] args) throws IOException {
        boolean unique = true;
        in.readLine();
        char[] n = in.readLine().toCharArray();
        for (int i = 0; i < 4; i++) {
            boolean aux = false;
            for (char c : n) {
                if (MOVES[Character.getNumericValue(c)][i] == 0) {
                    aux = true;
                }
            }
            if (!aux) {
                unique = false;
            }
        }

        out.println(unique ? "YES" : "NO");
        out.close();
    }
}
