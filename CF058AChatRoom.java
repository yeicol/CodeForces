
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/58/A">Chat room</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF058AChatRoom {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s = in.readLine();
        out.print(s.matches(".*h.*e.*l.*l.*o.*") ? "YES" : "NO");
        out.close();
    }
}
