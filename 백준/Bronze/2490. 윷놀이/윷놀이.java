import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<3; i++){
            st = new StringTokenizer(br.readLine());
            int front = 0;
            int back = 0;
            for(int j=0; j<4; j++){
                int num = Integer.parseInt(st.nextToken());
                if(num==1){ // 등
                    back++;
                } else {
                    front++;
                }
            }
            if(back==1 && front == 3){ //등1 배 3
                sb.append("C").append("\n");
            } else if(back==2 && front ==2 ){ //등2 배 2 -> 개
                sb.append("B").append("\n");
            } else if(back ==3 && front ==1){ //등3 배 1
                sb.append("A").append("\n");
            } else if(back==4){ //배 4
                sb.append("E").append("\n");
            } else if(front==4){
                sb.append("D").append("\n");
            }


        }

        System.out.println(sb);
    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}