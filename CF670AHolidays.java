
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * See <a href="http://codeforces.com/problemset/problem/670/A">Holidays</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF670AHolidays {

	static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter out = new PrintWriter(System.out);

	public static void main(String[] args) throws IOException {
		int n = Integer.parseInt(in.readLine());
		int mod = n % 7;
		int weeks = (int) Math.floor(n / 7);
		int minWeekDays = weeks * 2;
		int maxWeekDays = minWeekDays;
		minWeekDays += mod - 5 > 0 ? 1 : 0;
		maxWeekDays += mod > 2 ? 2 : mod;
		out.print(minWeekDays + " " + maxWeekDays);
		out.close();
	}
}
