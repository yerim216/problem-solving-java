import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;



public class Main {


    public static void solution() throws Exception {

            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

            StringTokenizer st = new StringTokenizer(in.readLine()," ");

            int N = Integer.parseInt(st.nextToken());

            int K = Integer.parseInt(st.nextToken());

            char arr[] = new char[N];

            ArrayList<Character> alpList = new ArrayList<>();

            // 초기값 '?'으로 초기화
            for(int i=0;i<N;i++) {
                arr[i] = '?';
            }

            // 값을 증가시켜가면서 집어넣고, 모두 집어넣은 뒤에는 값을 1씩 빼면서 출력하면 될 것 같다.
            int start = 0;
            for(int i=0;i<K;i++) {
                st = new StringTokenizer(in.readLine()," ");

                int move = Integer.parseInt(st.nextToken());

                start = (start + move )%N;

                char alp = st.nextToken().charAt(0);

                if(alpList.contains(alp) && arr[start] != alp) {
                    System.out.println("!");
                    return;
                }

                alpList.add(alp);
//			System.out.println(start+":"+alp);
                if(arr[start] == '?' || arr[start] == alp) {
                    arr[start] = alp;
                }else {
                    System.out.println('!');
                    return;
                }
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<N;i++) {
                sb.append(arr[start]);
                start--;
                if(start < 0) {
                    start = N-1;
                }
            }

            System.out.println(sb);

        }





    public static void main(String[] args) throws Exception {
        solution();
    }
}