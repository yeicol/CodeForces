
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See
 * <a href="http://codeforces.com/problemset/problem/676/A">Nicholas and Permutation</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF676ANicholasAndPermutation {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String n = read();
		int ni = Integer.parseInt(n);
		String[] a = read().split("\\s");
		int pos1 = 0, posn = 0;
		for (int i = 0; i < ni; i++) {
			if (a[i].equals("1")) {
				pos1 = i + 1;
				if (posn != 0) {
					break;
				}
			} else if (a[i].equals(n)) {
				posn = i + 1;
				if (pos1 != 0) {
					break;
				}
			}
		}
		int max = Math.max(posn - 1, pos1 - 1);
		max = Math.max(max, Math.abs(ni - pos1));
		max = Math.max(max, Math.abs(ni - posn));
		out.print(max);
		out.close();
	}

	private static String read() throws IOException {
		return in.readLine();
	}

}
