
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/131/A">cAPS lOCK</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF131ACapsLock {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String s = in.readLine();

        if (s.length() == 1) {
            out.print(s.equals(s.toUpperCase()) ? s.toLowerCase() : s.toUpperCase());
        } else if (s.substring(1).equals(s.substring(1).toUpperCase())) {
            String firstLetter = s.substring(0, 1);
            String complement = s.substring(1).toLowerCase();
            firstLetter = firstLetter.equals(firstLetter.toUpperCase()) ? firstLetter.toLowerCase() : firstLetter.toUpperCase();
            out.print(firstLetter + complement);
        } else {
            out.print(s);
        }
        out.close();
    }
}
