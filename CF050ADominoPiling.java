
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/50/A">Domino piling</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF050ADominoPiling {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String[] p = in.readLine().split("\\s");
		int M = Integer.parseInt(p[0]);
		int N = Integer.parseInt(p[1]);
		int area = M * N;
		out.println(area / 2);
		out.close();
	}

}
