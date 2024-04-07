import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


public class Main{
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String word = br.readLine();

        String[] str = new String[word.length()];

        for (int i = 0; i < str.length; i++) {
            str[i] = word.substring(i);
        }

        Arrays.sort(str);

        for (int i = 0; i < str.length; i++) {
            sb.append(str[i] + "\n");
        }

        System.out.println(sb);
        


    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}