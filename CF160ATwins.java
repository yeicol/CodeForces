
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * See <a href="http://codeforces.com/problemset/problem/160/A">Twins</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF160ATwins {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		Integer n =Integer.parseInt(in.readLine());
		int[] coins = Arrays.stream(in.readLine().split("\\s"))
				.mapToInt(Integer::parseInt)
				.sorted()
				.toArray();

		int totalAmount = IntStream.of(coins).sum();
		int amount = 0;
		int totalCoins = 0;
		while(n-- > 0) {
			amount += coins[n];
			totalCoins++;
			if (amount > totalAmount / 2) {
				break;
			}
		}

		out.print(totalCoins);
		out.close();
	}

}
