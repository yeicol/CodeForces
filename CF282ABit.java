
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF282ABit {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        short x = 0;
        short n = Short.parseShort(in.readLine());
        while (n-- > 0) {
            switch (in.readLine()) {
                case "X++":
                case "++X":
                    x++;
                    break;
                case "X--":
                case "--X":
                    x--;
                    break;

            }
        }
        out.println(x);
        out.close();
    }
}
