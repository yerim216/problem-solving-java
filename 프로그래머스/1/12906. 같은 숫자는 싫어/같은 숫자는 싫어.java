import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        //int[] answer = {};
        //Queue<Integer> q = new LinkedList<>();
        //Deque<Integer> dq = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        for(int num : arr){
            if(st.isEmpty()){
                st.add(num);
            } else if(st.peek()!=num){
                st.add(num);
            }
        }
        int[] ans = new int[st.size()];
        for(int i=st.size()-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
        //return dq.toString();
        // for(int num : arr){
        //     if(q.isEmpty()){
        //         q.add(num);
        //     } else if(q.peek()!=num){
        //         q.add(num);
        //     }
        // }
        // System.out.println(q.toString());
//         int[] answer = new int[q.size()];
//         int idx = 0;
//         while(q.isEmpty()){
//             answer[idx++] = q.poll();
//         }
        

        //System.out.println("Hello Java");

       // return answer;
    }
}