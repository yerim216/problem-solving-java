import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main{

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i=0; i<t; i++){
            Stack<Character> stack = new Stack<>();
            String s = br.readLine();
            boolean status = true;
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)=='('){
                    stack.add('(');
                } else if(s.charAt(j)==')'){
                    if(stack.isEmpty()){
                        status = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty())
                status = false;
            if(status){
                sb.append("YES").append("\n");
            } else{
                sb.append("NO").append("\n");
            }
        }
        System.out.println(sb);





    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}