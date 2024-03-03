import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken();
        int[] status = new int[9];
        int cnt = 1;
        for(int i=0; i<9; i++){ //9 없음. 6을 대신 사용
            status[i] = 1;
        }
        status[6]++;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='9'){
               if(status[6]!=0){
                   status[6]--;
               } else {
                   cnt ++;
                   for(int j=0; j<9; j++){
                       status[j]++;
                   }
               }
            } else {
                int temp = s.charAt(i)-'0';
                if(status[temp]!=0){
                    status[temp]--;
                } else {
                    cnt++;
                    for(int j=0; j<9; j++){
                        status[j]++;
                    }
                    status[6]++;
                    status[temp]--;
                }

            }
        }

        System.out.println(cnt);

    }
    public static void main(String[] args) throws Exception {
        solution();
    }

}
