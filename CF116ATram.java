
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/116/A">Tram</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF116ATram {
    
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);
    
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(in.readLine());
        int capacity = 0;
        int passengers = 0;
        int a, b;
        String[] p;
        while (n-- > 0) {
            p = in.readLine().split("\\s");
            a = Integer.parseInt(p[0]);
            b = Integer.parseInt(p[1]);
            passengers -= a;
            passengers += b;
            capacity = Math.max(passengers, capacity);
        }
        out.print(capacity);
        out.close();
    }
}
