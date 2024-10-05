import java.util.*;
import java.io.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        //boolean[] status = new boolean[10];
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty() || stack.peek()!=arr[i]){
                list.add(arr[i]);
                stack.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
     
    }
}