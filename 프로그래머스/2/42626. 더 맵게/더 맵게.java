import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        //K : 10억 
        //O(n)/O(nlogN)으로 끊어야 함. 
        //정렬!!
        //List<Long>list = new ArrayList<>();
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for(int num : scoville){
            pq.add(num+0L);
        }
 
        int cnt = 0;
        while(true){
            if(pq.size()==1){
                if(pq.peek()>=K){
                    return cnt;
                } else{
                    return -1;
                }
            }
            if(pq.peek()<K){
                long first = pq.poll();
                long second = pq.poll();
                pq.add(calculate(first, second));
                cnt++;
            } else if(pq.peek()>=K){
                return cnt;
            }
        }

    }
    static long calculate(long first, long second){
        return first + 2*second;
    }
}