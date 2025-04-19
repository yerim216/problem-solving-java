import java.util.*;

class Solution {
    static boolean[] visited;
    static HashSet<Integer> set;
    
    public int solution(String numbers) {
        visited = new boolean[8];
        set = new HashSet<>();
        int answer = 0;

        dfs("", 0, numbers);
        for(Integer numb : set){
            if(isPrime(numb))
                answer++;
        }
        //소수 판별 : 2부터 루트 제곱근까지 나눠서 나머지가 0이 되는게 있는지 확인
        //dfs로 모든 수를 조합해본다 -> 이걸 set에 넣는다
        //set을 돌면서 소수인 것의 개수를 센다.
        
        //소수 제외 : 0, 1

        return answer;
    }
    static void dfs(String s, int depth, String numbers){
        if(depth>numbers.length())
            return;
        for(int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                set.add(Integer.parseInt(s+numbers.charAt(i)));
                dfs(s+numbers.charAt(i), depth+1, numbers);
                visited[i] = false;
            }
        }
    }
    static boolean isPrime(int num){
        if(num<2)
            return false;
        if(num==2)
            return true;
        for(int i=2; i<=(int)Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}