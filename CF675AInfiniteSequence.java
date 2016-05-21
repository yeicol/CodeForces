
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="http://codeforces.com/problemset/problem/675/A">Infinite
 * Sequence</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF675AInfiniteSequence {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int[] p = readArray();
		int a = p[0];
		int b = p[1];
		int c = p[2];

		if (c == 0) {
			out.print(a == b ? "YES" : "NO");
		} else if (c > 0) {
			if (b < a) {
				out.print("NO");
			} else {
				out.print((b - a) % c == 0 ? "YES" : "NO");
			}
		} else if (c < 0) {
			if (b > a) {
				out.print("NO");
			} else {
				out.print((b - a) % c == 0 ? "YES" : "NO");
			}
		}
		out.close();
	}

	private static String read() throws IOException {
		return in.readLine();
	}

	private static int readInt() throws IOException {
		return Integer.parseInt(in.readLine());
	}

	private static int[] readArray() throws IOException {
		String[] line = in.readLine().split("\\s");
		int[] a = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
		return a;
	}

	private static int[] readSortedArray() throws IOException {
		String[] line = in.readLine().split("\\s");
		int[] a = Arrays.stream(line).mapToInt(Integer::parseInt).sorted().toArray();
		return a;
	}
}
