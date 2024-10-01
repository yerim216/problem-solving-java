import java.util.*;
import java.io.*;

class Solution {
    static int[] n_numbers;
    static int[] p_numbers;
    static int answers = 0;
    static int targets = 0;
    
    static public void dfs(int[] arr, int index, int sum){
        if(index==arr.length-1){
            if(sum+arr[index]==targets){
                answers ++;
            };
            //System.out.println(answer);
            return ;
        } 
            
        sum += arr[index];
        dfs(n_numbers, index+1, sum);
        dfs(p_numbers, index+1, sum);

    }
    public int solution(int[] numbers, int target) {
        n_numbers = new int[numbers.length];
        p_numbers = numbers;
        
        for(int i=0; i<numbers.length; i++){
            n_numbers[i] = numbers[i] * (-1);
        }
        
        targets = target;
        int sum = 0;
        int answer = 0;
        
        dfs(p_numbers, 0, sum);
        dfs(n_numbers, 0, sum);
        
        answer = answers;
        return answer;
    }
}