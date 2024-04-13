import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main{
    //public static StringBuilder sb = new StringBuilder();
    public static int func(int n, int r, int c){
        if(n==0) return 0;
        int length = (int) Math.pow(2, n);
        int half = length/2;
        if(r<half && c<half){ //1번 사각형
            return func(n-1, r, c);
        } else if(r<half && c>=half){ //2번 사각형
            return half*half+func(n-1, r, c-half);
        } else if(r>=half && c<half){ //3번 사각형
            return 2*half*half+func(n-1, r-half, c);
       } else //if(r>=length/2 && c>=length/2){ //4번 사각형
            return 3*half*half+func(n-1, r-half, c-half);

    }

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        System.out.println(func(N, r, c));






    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}