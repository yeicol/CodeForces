
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * <a href="http://codeforces.com/problemset/problem/677/A">Vanya and Fence</a>
 */
public class CF677AVanyaAndFence {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int[] p = readArray();
		int n = p[0];
		int h = p[1];
		int l = n;
		int[] f = readArray();
		for (int fi : f) {
			if (fi > h) {
				l++;
			}
		}
		out.println(l);
		out.close();
	}

	private static int[] readArray() throws IOException {
		String[] line = in.readLine().split("\\s");
		int[] a = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
		return a;
	}

}
