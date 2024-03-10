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
        int top = 0;
        boolean[] status = new boolean[n+1];
        for(int i=0; i<=n; i++){
            status[i] = false;
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if(num<top){
                System.out.println("NO");
                return;
            } else if(num-top==1){
                stack.add(num);
                sb.append("+").append("\n");
            }
             else if(top<num){
                for(int j=top+1; j<=num; j++){
                    if(status[j]){
                        continue;
                    }
                    stack.add(j);
                    sb.append("+").append("\n");
                }
            }
            status[stack.pop()] = true;
            sb.append("-").append("\n");
            if(!stack.isEmpty()){
                top = stack.peek();
            } else {
                top = 0;
            }



        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        solution();
    }

}
