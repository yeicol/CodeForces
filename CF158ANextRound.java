
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

/**
 * See <a href="http://codeforces.com/problemset/problem/158/A">Next Round</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF158ANextRound {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        String[] line1 = in.readLine().split("\\s");
        byte k = Byte.parseByte(line1[0]);
        byte n = Byte.parseByte(line1[1]);
        byte participants = n;
        String[] line2 = in.readLine().split("\\s");
        int[] a = Arrays.stream(line2).mapToInt(Integer::parseInt).sorted().toArray();
        byte basePosition = (byte) (k - n);
        byte baseEscore = (byte) a[basePosition];
        if (baseEscore == 0) {
            while (basePosition < k && a[basePosition] == 0) {
                participants--;
                basePosition++;
            }
        } else {
            basePosition--;
            while (basePosition >= 0 && a[basePosition] == baseEscore) {
                participants++;
                basePosition--;
            }
        }
        out.println(participants);
        out.close();
    }
}
