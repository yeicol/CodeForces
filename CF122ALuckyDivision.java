
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/122/A">Lucky
 * Division</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF122ALuckyDivision {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    static final int[] luckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        for (int luckyNumber : luckyNumbers) {
            if (n % luckyNumber == 0) {
                out.print("YES");
                out.close();
                break;
            }
        }
        out.print("NO");
        out.close();
    }
}
