
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="http://codeforces.com/problemset/problem/673/A">Bear and
 * Game</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF673ABearAndGame {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		read();
		int[] times = readArray();
		int total = 15;
		for (int time : times) {
			if (time <= total) {
				total = time;
			} else {
				break;
			}
			total += 15;
		}
		out.print(total > 90 ? 90 : total);
		out.close();
	}

	private static String read() throws IOException {
		return in.readLine();
	}

	private static int[] readArray() throws IOException {
		String[] line = in.readLine().split("\\s");
		int[] a = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
		return a;
	}

}
