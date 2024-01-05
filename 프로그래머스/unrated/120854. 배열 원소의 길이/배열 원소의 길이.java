class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        int i = 0;
        for(String c : strlist){
            answer[i] = c.length();
            i++;
        }
        return answer;
    }
}