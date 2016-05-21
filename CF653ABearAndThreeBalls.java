
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="http://codeforces.com/problemset/problem/653/A">Bear and Three
 * Balls</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF653ABearAndThreeBalls {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		in.readLine();
		int[] t = Arrays.stream(in.readLine().split("\\s"))
				.distinct()
				.mapToInt(Integer::parseInt)
				.sorted()
				.toArray();
		if (t.length < 3) {
			out.print("NO");
		} else {
			int i = 0;
			int l = t.length;
			while (i <= l - 3) {
				if (t[i + 2] - t[i] == 2) {
					out.print("YES");
					out.close();
					break;
				}
				i++;
			}
			out.print("NO");
		}
		out.close();

	}

}
