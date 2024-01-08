class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        //slice * 조각수 >= n
        //조각수 >= n/slice
        if(n%slice==0)
            answer = n/slice;
        else 
            answer = n/slice+1;
        return answer;
    }
}