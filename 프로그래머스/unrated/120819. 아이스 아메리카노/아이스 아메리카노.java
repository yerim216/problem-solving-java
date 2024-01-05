class Solution {
    public int[] solution(int money) {
        int[] answer = new int[2];
        int cnt = money/5500;
        answer[0] = cnt;
        int temp = money - cnt*5500;
        answer[1] = temp;
        return answer;
    }
}