import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String[] num = new String[numbers.length];
        
        for(int i=0; i<numbers.length; i++){
            num[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(num, (s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // 정렬된 문자열을 합쳐서 결과 생성
        //String result = String.join("", strNumbers);
        
        String answer = "";
        for(String s : num){
            answer += s;
        }
        if(answer.charAt(0)=='0'){
            return "0";
        }
       
        return answer;
    }
}