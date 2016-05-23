
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See
 * <a href="http://codeforces.com/problemset/problem/659/A">Round House</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF659ARoundHouse {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int[] p = readArray();
		int n = p[0];
		int a = p[1];
		int b = p[2];
		int moves = b % n;
		int pos;
		if (moves == 0) {
			out.print(a);
		} else if (moves > 0) {
			pos = a + moves;
			out.print(pos > n ? pos - n: pos);
		} else if (moves < 0) {
			pos = a + moves;
			out.print(pos <= 0 ? n + pos : pos);
		}
		out.close();
	}

	private static int[] readArray() throws IOException {
		String[] line = in.readLine().split("\\s");
		int[] a = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
		return a;
	}

}
