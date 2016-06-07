
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="http://codeforces.com/problemset/problem/677/B">Vanya and Food
 * Processor</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF677BVanyaAndFoodProcessor {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int[] l1 = readArray();
		int n = l1[0];
		int h = l1[1];
		int k = l1[2];
		int[] pieces = readArray();
		long seconds = 0;
		int content = 0;
		int i = 0;
		while (true) {
			while (i < n && content + pieces[i] <= h) {
				content += pieces[i++];
			}
			if (i == n) {
				seconds += Math.ceil((double)content / (double)k);
				break;
			} else if (content < k) {
				seconds++;
				content = 0;
			} else {
				seconds += (long) (content / k);
				content %= k;
			}

		}

		out.println(seconds);
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
