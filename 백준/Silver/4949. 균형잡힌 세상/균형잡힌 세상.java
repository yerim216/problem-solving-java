
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        while(true) {
            String inputLine = br.readLine();
            if(inputLine.equals(".")){
                break;
            }
            boolean status = true;
            for(int i=0; i<inputLine.length(); i++){
                if(inputLine.charAt(i)=='[' || inputLine.charAt(i)=='('){
                    stack.add(inputLine.charAt(i));
                } else if(inputLine.charAt(i)==']' || inputLine.charAt(i)==')'){
                    if(stack.isEmpty()){
                        sb.append("no").append("\n");
                        status =false;
                        break;
                    }
                    char c = stack.pop();
                    if(inputLine.charAt(i)==']'){
                        if(c!='['){
                            sb.append("no").append("\n");
                            status = false;
                            break;
                        }
                    } else {
                        if(c!='('){
                            sb.append("no").append("\n");
                            status = false;
                            break;
                        }
                    }
                }
            }
            if(status==false){
                stack.clear();
                continue;
            }
            if(!stack.isEmpty()){
                sb.append("no").append("\n");
                stack.clear();
            } else {
                sb.append("yes").append("\n");
            }

        }
        System.out.println(sb);


    }


    public static void main(String[] args) throws Exception {
        solution();
    }

}