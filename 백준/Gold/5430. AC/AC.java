
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(st.nextToken());
        for(int i=0; i<t; i++){
            Deque<Integer> dq = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            String fun = st.nextToken();
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            s = s.replace("[", "").replace("]","");
            String[] splitted = s.split(",");

            for(int j=0; j<n; j++){
                dq.addLast(Integer.parseInt(splitted[j]));
            }
            boolean frontStatus = true;
            boolean status = true;
            for(int k=0; k<fun.length(); k++){
                if(fun.charAt(k)=='R'){
                    if(frontStatus==true){
                        frontStatus = false;
                    } else {
                        frontStatus = true;
                    }

                } else if(fun.charAt(k)=='D'){
                    if(dq.isEmpty()){
                        sb.append("error").append("\n");
                        status = false;
                        break;
                    } else {
                        if(frontStatus==true){
                            dq.pollFirst();
                        } else {
                            dq.pollLast();
                        }
                    }
                }
            }
            if(dq.isEmpty()){
                if(status==true){
                    sb.append("[]").append("\n");
                } continue;
            }
            sb.append("[");
            if(frontStatus==true) {
                int size = dq.size();
                for (int j = 0; j < size - 1; j++) {
                    sb.append(dq.pollFirst()).append(",");
                }
            } else {
                for (int j = dq.size()-1; j >0; j--) {
                    sb.append(dq.pollLast()).append(",");
                }
            }
            sb.append(dq.pollLast()).append("]").append("\n");


        }
        System.out.println(sb);




    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}