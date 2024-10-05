import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Queue<Integer> q = new LinkedList<>();
        int[] answer = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            if(i==prices.length-1){
                answer[i] = 0;
            } else {
                answer[i] = 1;
                //q.add(i);
            }
            int price = prices[i];
            int size = q.size();
            while(size>0 && i!=prices.length-1){
                int temp = q.poll();
                if(prices[temp]<=price){
                    answer[temp]++;
                    q.add(temp);
                } 
                size--;
            }
            q.add(i);
        }
        // for(int i=0; i<answer.length-1; i++){
        //     if(answer[i]==0){
        //         answer[i] = 1;
        //     }
        // }
        
        return answer;
    }
}