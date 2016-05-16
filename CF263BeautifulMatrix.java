
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/263/A">Beautiful
 * Matrix</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF263BeautifulMatrix {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int rows = 2;
        int index;
        int moves = 0;
        for (int i = 0; i < 5; i++) {
            index = in.readLine().indexOf("1");
            if (index != -1) {
                index /= 2;
                moves = Math.abs(rows) + Math.abs(2 - index);
                break;
            }
            rows--;
        }
        out.print(moves);
        out.close();
    }
}
