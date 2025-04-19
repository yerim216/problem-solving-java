import java.util.*;
//O(n)으로 끊어야 함. 
class Solution {
    public int[] solution(int brown, int yellow) {
        //가로 : w  세로 : h
        // brown + yellow = 전체 넓이
        // 가로>=세로 니까 절반까지만 돌아보면 되겠다
        int span = brown + yellow;
        int[] arr = new int[2];
           for(int i=1; i<=Math.sqrt(span); i++){
            //h가 i라고 가정
            if(span%i!=0)
                continue;
            int h = i;
            int w = span/h;
            System.out.println("h :" +h);
            System.out.println("w :" +w);
            if(brown == (h+w)*2-4){
                //System.out.println("call");
                arr[0] = w;
                arr[1] = h;
               return arr;
            }
        }
        return arr;
    }
}