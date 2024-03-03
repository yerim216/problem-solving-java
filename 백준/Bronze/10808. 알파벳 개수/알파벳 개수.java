import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;

import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String s = st.nextToken();
        int[] cnt = new int[26];
        for(int i=0; i<s.length(); i++){
            int idx = s.charAt(i)-'a';
            cnt[idx]++;
        }
        for(int i=0; i<26; i++) {
            sb.append(cnt[i] + " ");
        }
        System.out.println(sb);



    }
    public static void main(String[] args) throws Exception {
        solution();
    }

}
