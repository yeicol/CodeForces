import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import static java.lang.Math.ceil;

/**
 * See <a href="http://codeforces.com/problemset/problem/1/A">Theatre Square</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF001ATheatreSquare {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		String[] p = in.readLine().split("\\s");
		long n = Long.parseLong(p[0]);
		long m = Long.parseLong(p[1]);
		double a = Double.parseDouble(p[2]);
		long flagstones = (long) (ceil(n / a) * ceil(m / a));
		out.print(flagstones);
		out.close();
	}
}
