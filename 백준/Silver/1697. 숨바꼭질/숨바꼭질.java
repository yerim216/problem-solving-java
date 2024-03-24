import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{

    public static void solution() throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[100002];
        Arrays.fill(arr, -1);
        Queue<Integer> q = new LinkedList<>();
        arr[n] = 0;
        q.add(n);
        while(arr[k]==-1){
            int num = q.poll();
            int[] temp = new int[3];
            temp[0] = num+1;
            temp[1] = num-1;
            temp[2] = 2*num;
            for(int i=0; i<3; i++){
                if(temp[i]<0 || temp[i]>100000) continue;
                if(arr[temp[i]]!=-1) continue;
                arr[temp[i]]=arr[num]+1;
                q.add(temp[i]);
            }



        }
        System.out.println(arr[k]);





    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}