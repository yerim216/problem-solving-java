import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int f, s, g, u, d;
        f = Integer.parseInt(st.nextToken()); //총 층수
        s = Integer.parseInt(st.nextToken()); //현재 위치
        g = Integer.parseInt(st.nextToken()); //이동 하고자 하는 위치
        u = Integer.parseInt(st.nextToken()); //위로 u칸
        d = Integer.parseInt(st.nextToken()); //아래로 g칸
        int[] arr = new int[f+1];
        for(int i=0; i<arr.length; i++){
            arr[i]=-1;
        }
        arr[s] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        while(!q.isEmpty()){
            int n = q.poll();
            if(n+u>0 && n+u<=f) {
                if(arr[n+u]==-1){
                    arr[n+u] = arr[n]+1;
                    q.add(n+u);
                }
            }
            if(n-d>0 && n-d<=f) {
                if(arr[n-d]==-1){
                    arr[n-d] = arr[n]+1;
                    q.add(n-d);
                }
            }

        }
        if(arr[g]==-1){
            System.out.println("use the stairs");
        } else {
            System.out.println(arr[g]);
        }








    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}