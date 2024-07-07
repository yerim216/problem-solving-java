import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.AbstractQueue;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int p = 0;
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            if(s.equals("push")){
                p = Integer.parseInt(st.nextToken());
                queue.add(p);
            } else if(s.equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.peek()).append("\n");
                }
            } else if(s.equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(queue.poll()).append("\n");
                }

            }else if(s.equals("size")){
                if(queue.isEmpty()){
                    sb.append(0).append("\n");
                } else {
                    sb.append(queue.size()).append("\n");
                }


            }else if(s.equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append("\n");
                } else {
                    sb.append(0).append("\n");
                }

            } else if(s.equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                } else {
                    sb.append(p).append("\n");
                }
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        solution();
    }

}