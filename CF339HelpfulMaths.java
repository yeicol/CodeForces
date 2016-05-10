
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * See <a href="http://codeforces.com/problemset/problem/339/A">Helpful
 * Maths</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF339HelpfulMaths {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s = Arrays.stream(in.readLine().split("\\+"))
                .sorted()
                .collect(Collectors.joining("+"));
        out.println(s);
        out.close();
    }
}
