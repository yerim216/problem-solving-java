import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    static char[] ch;
    static char[] ans;
    static int l, c;
    public static StringBuilder sb = new StringBuilder();

    public static boolean check(String s){
        int c = 0;
        int v = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o'||s.charAt(i)=='u'){
                c++;
            } else
                v++;
        }
        if(c>=1 && v>=2)
            return true;
        else
            return false;
    }
    public static void func(int m, int last){
        String s="";
        if(l==m){
            for(char c : ans){
                    s+=c;
            }
            if(check(s))
                sb.append(s).append("\n");
            return;
        }
        for(int i=last; i<c; i++){
            ans[m] = ch[i];
            func(m+1, i+1);
        }

    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        l = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        ch = new char[c];
        ans = new char[l];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<c; i++){
            ch[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(ch);
        func(0, 0);
        System.out.print(sb);
    }
}
