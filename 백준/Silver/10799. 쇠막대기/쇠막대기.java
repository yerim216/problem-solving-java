
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        String s = br.readLine();
        int answer = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                stack.add(i);
            } else if(s.charAt(i)==')'){
                    if(stack.peek()==i-1){
                        stack.pop();
                        answer+=stack.size();
                    } else {
                        stack.pop();
                        answer+=1;
                    }
            }
        }

        System.out.println(answer);


    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}