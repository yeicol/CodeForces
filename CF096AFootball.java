
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/096/A">Football</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF096AFootball {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String players = in.readLine();
        out.print(players.contains("0000000") || players.contains("1111111") ? "YES" : "NO");
        out.close();
    }
}
