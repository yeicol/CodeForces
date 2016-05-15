
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * See
 * <a href="http://codeforces.com/problemset/problem/236/A">Boy or girl</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF236ABoyOrGirl {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        char[] letters = in.readLine().toCharArray();
        List<Character> diffents = new ArrayList<>();
        for (char letter : letters) {
            if (!diffents.contains(letter)) {
                diffents.add(letter);
            }
        }
        out.print(diffents.size() % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
        out.close();
    }
}
