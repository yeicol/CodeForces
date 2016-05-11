
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="http://codeforces.com/problemset/problem/266/A">CF266AStonesOnTheTable</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF266AStonesOnTheTable {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        byte n = Byte.parseByte(in.readLine());
        char[] s = in.readLine().toCharArray();
        byte stones = 0;
        char color = s[0];
        for (byte i = 1; i < n; i++) {
            if (color == s[i]) {
                stones++;
            } else {
                color = s[i];
            }
        }
        out.print(stones);
        out.close();
    }
}
