
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/112/A">Petya and
 * Strings</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF112APetyaAndStrings {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String a = in.readLine();
        String b = in.readLine();
        int difference = a.compareToIgnoreCase(b);
        if (difference > 0) {
            out.print(1);
        } else if (difference < 0) {
            out.print(-1);
        } else {
            out.print(0);
        }
        out.close();
    }
}
