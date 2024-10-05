import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> st = new Stack<>();
         boolean answer = true;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='('){
                st.add('(');
            } else {
                if(st.isEmpty()){
                    answer = false;
                    return answer;
                } else {
                    st.pop();
                }
            }
        }
        if(st.isEmpty())
            answer = true;
        else 
            answer = false;
        


        return answer;
    }
}