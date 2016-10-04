
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * See
 * <a href="http://codeforces.com/problemset/problem/680/A">Bear and Five
 * Cards</a>
 *
 * @author Brian Yeicol Restrepo Tangarife
 */
public class CF680ABearAndFiveCards {

    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int[] a = readSortedArray();
        int[] aux = new int[5];
        System.arraycopy(a, 0, aux, 0, 5);
        int sum = 501;
        int sumaAux = 0;
        for (int i = 4; i >= 2; i--) {
            if (a[i] == a[i - 1] && a[i - 1] == a[i - 2]) {
                a[i] = 0;
                a[i - 1] = 0;
                a[i - 2] = 0;
                sum = IntStream.of(a).sum();
                break;
            }
        }
        for (int i = 4; i >= 1; i--) {
            if (aux[i] == aux[i - 1]) {
                aux[i] = 0;
                aux[i - 1] = 0;
                sumaAux = IntStream.of(aux).sum();;
                if (sumaAux < sum) {
                    sum = sumaAux;
                    out.println(sum);
                    out.close();
                }
                break;
            }
        }
        out.println(IntStream.of(a).sum());
        out.close();
    }

    private static int[] readSortedArray() throws IOException {
        String[] line = in.readLine().split("\\s");
        int[] a = Arrays.stream(line).mapToInt(Integer::parseInt).sorted().toArray();
        return a;
    }
}
