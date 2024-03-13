
import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        long answer = 0;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int height = Integer.parseInt(st.nextToken());
                while(!stack.isEmpty()){
                    if(stack.peek()<=height){
                        stack.pop();
                    } else {
                        break;
                    }
                }
                answer += stack.size(); //0+1+1+2+0+1
                stack.add(height);
                //stack : 10 7 4 -> 12 2

        }
        System.out.println(answer);





    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}