
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/231/A">Team</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF231ATeam {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		short n = Short.parseShort(in.readLine());
		short problems = 0;
		while (n-- > 0) {
			problems += (in.readLine().matches(".*1.*.1.*") ? 1 : 0);
		}
		out.println(problems);
		out.close();
	}

}
