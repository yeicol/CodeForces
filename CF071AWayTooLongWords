
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/71/A">Way Too Long Words</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF071AWayTooLongWords {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {

		byte n = Byte.parseByte(in.readLine());
		String s;
		int length;
		while (n-- > 0) {
			s = in.readLine();
			length = s.length();
			if (length > 10) {
				out.println(s.substring(0, 1) + (length - 2) + s.substring(length - 1));
			}
			else {
				out.println(s);
			}
		}
		out.close();
	}
}
