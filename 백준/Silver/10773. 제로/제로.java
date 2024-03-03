import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<k; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            if(num==0){
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int sum = 0;
        while(!stack.isEmpty()){
            sum+= stack.pop();
        }
        System.out.println(sum);

    }

    public static void main(String[] args) throws Exception {
        solution();
    }

}
