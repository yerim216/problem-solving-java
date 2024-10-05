import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[progresses.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<progresses.length; i++){
            int time = 100-progresses[i];
            if(time%speeds[i]==0){
                left[i] = time/speeds[i]; 
            } else {
                left[i] = time/speeds[i]+1;
            }
        }
        int cnt = 0;
        for(int i=0; i<left.length; i++){
            if(stack.isEmpty()){
                cnt ++;
                stack.add(left[i]);
            } else if(stack.peek()>=left[i]){
                cnt++;
            } else if(stack.peek()<left[i]){
                list.add(cnt);
                while(!stack.isEmpty()){
                    stack.pop();
                }
                stack.add(left[i]);
                cnt = 1;
            }
        }
        if(cnt!=0){
            list.add(cnt);
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
        //return left;
    }
}