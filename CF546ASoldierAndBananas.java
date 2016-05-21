
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/546/A">Soldier and
 * Bananas</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF546ASoldierAndBananas {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String[] line = in.readLine().split("\\s");
        int k = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        int w = Integer.parseInt(line[2]);
        int amount = k * w * (w + 1) / 2;
        int borrow = (amount > n) ? amount - n : 0;
        out.print(borrow);
        out.close();
    }
}
