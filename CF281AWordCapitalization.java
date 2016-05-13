
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/281/A">Word Capitalization</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF281AWordCapitalization {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		String s = in.readLine();
		out.print(Character.toUpperCase(s.charAt(0)) + s.substring(1));
		out.close();
	}

}

