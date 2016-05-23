
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/617/A">Elephant</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF617AElephant {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int x = Integer.parseInt(in.readLine());
        out.print((int) Math.ceil(x / 5f));
        out.close();
    }
}
