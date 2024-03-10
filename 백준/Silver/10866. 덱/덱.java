import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Deque<Integer> dq = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push_front")){
                int num = Integer.parseInt(st.nextToken());
                dq.addFirst(num);

            } else if(s.equals("push_back")){
                int num = Integer.parseInt(st.nextToken());
                dq.addLast(num);

            } else if(s.equals("pop_front")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.pollFirst()).append("\n");
                }

            } else if(s.equals("pop_back")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.pollLast()).append("\n");
                }
            } else if(s.equals("size")){
                sb.append(dq.size()).append("\n");

            } else if(s.equals("empty")){
                if(dq.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }

            } else if(s.equals("front")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.getFirst()).append("\n");
                }

            } else if(s.equals("back")){
                if(dq.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(dq.getLast()).append("\n");
                }

            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        solution();
    }

}