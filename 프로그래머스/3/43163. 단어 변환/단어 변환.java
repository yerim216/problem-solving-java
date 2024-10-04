import java.util.*;

class Solution {
    static Queue<String> q = new LinkedList<>();
    
    public int solution(String begin, String target, String[] words) {
        // words 배열에 target이 포함되어 있는지 확인
        boolean status = false;
        for (String s : words) {
            if (s.equals(target)) {
                status = true;
                break;
            }
        }

        // target이 words에 없으면 변환할 수 없음
        if (!status) {
            return 0;
        }

        // 방문 여부를 확인할 배열
        boolean[] visited = new boolean[words.length];
        q.add(begin);
        
        int answer = 0;

        // BFS 시작
        while (!q.isEmpty()) {
            int size = q.size();
            answer++;  // 현재 단계에서 변환된 단어의 수 만큼 확인 후 다음 단계로 진행

            for (int i = 0; i < size; i++) {
                String start = q.poll();

                // words 배열의 단어들을 하나씩 확인
                for (int k = 0; k < words.length; k++) {
                    if (visited[k]) continue;
                    
                    String s = words[k];
                    int diffCnt = 0;

                    // 한 글자만 다른 단어인지 확인
                    for (int j = 0; j < s.length(); j++) {
                        if (s.charAt(j) != start.charAt(j)) {
                            diffCnt++;
                        }
                    }

                    // 한 글자만 다르면 큐에 추가하고 방문 처리
                    if (diffCnt == 1) {
                        if (s.equals(target)) {
                            return answer;  // target을 찾으면 즉시 반환
                        }
                        q.add(s);
                        visited[k] = true;
                    }
                }
            }
        }
        
        return 0;  // target으로 변환 불가능한 경우
    }
}
