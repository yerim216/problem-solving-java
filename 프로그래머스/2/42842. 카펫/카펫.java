import java.util.*;

class Solution {
    // 테두리 한 줄만 갈색 : 가로*2 + (세로-2)*2
    // 노랑 : (가로-2) * (세로-2)
    public int[] solution(int brown, int yellow) {
        //int x = 0;
        //int y = 0;
        int width = brown + yellow;
        //int max = Math.sqrt(width);
        int[] answer = new int[2];
        //int width = x*y-4;
        for(int x=1; x<=width; x++){
            for(int y=1; y<= width; y++){
                if((x*2 + (y-2)*2) == brown && (x-2)*(y-2)==yellow){
                    answer[0] = y;
                    answer[1] = x;
                    return answer;
                }
            }
        }
        
        
        
        
        
        
        
        return answer;
    }
}