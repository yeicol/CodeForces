
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/000/A">George and
 * Accommodation</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF467AGeorgeAndAccommodation {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        byte n = Byte.parseByte(in.readLine());
        String[] l;
        int p, q, rooms = 0;
        while (n-- > 0) {
            l = in.readLine().split("\\s");
            p = Byte.parseByte(l[0]);
            q = Byte.parseByte(l[1]);
            if (q - p > 1) {
                rooms++;
            }
        }
        out.print(rooms);
        out.close();
    }
}
