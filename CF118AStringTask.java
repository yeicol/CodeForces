
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/118/A">String Task</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF118AStringTask {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String s = in.readLine();
		s = s.replaceAll("(?i)[AEIYOU]", "");
		s = s.replaceAll("(?i)([^AEIYOU])", ".$1");
		s = s.toLowerCase();
		out.print(s);
		out.close();
	}
}
