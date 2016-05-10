
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/133/A">HQ9+</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF133AHQ9 {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String p = in.readLine();
        out.print(p.matches(".*[HQ9].*") ? "YES":"NO");
        out.close();
    }
}
