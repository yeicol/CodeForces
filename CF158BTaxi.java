
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


/**
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF158BTaxi {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {

        in.readLine();
        String[] childrenGroup = in.readLine().split("\\s");
        int[] groups = new int[5];
        for (String children : childrenGroup) {
            groups[Integer.parseInt(children)]++;
        }
        int taxis = groups[4] + groups[2] / 2 + groups[3];
        if (groups[1] >= groups[3]) {
            groups[1] -= groups[3];
        } else {
            groups[1] = 0;
        }
        if (groups[2] % 2 == 1) {
            taxis++;
            if (groups[1] > 0) {
                groups[1]--;
            }
            if (groups[1] > 0) {
                groups[1]--;
            }
        }

        taxis += Math.ceil(groups[1] / 4f);
        out.print(taxis);
        out.close();
    }
}
