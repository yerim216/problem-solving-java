import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new LinkedList<>();
        List<Integer> answer = new LinkedList<>();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for(int i=1; i<=n; i++){
            list.add(i);
        }
        ListIterator<Integer> it = list.listIterator(0);
        for(int i=0; i<n; i++){
            for(int j=0; j<k-1; j++){
                if(it.hasNext())
                    it.next();
                else {
                    it = list.listIterator(0);
                    it.next();
                }
            }
            if(it.hasNext()){
                answer.add(it.next());
                it.remove();
            } else{
                it = list.listIterator(0);
                answer.add(it.next());
                it.remove();
            }
        }
        sb.append("<");
        for(int i=0; i<answer.size()-1; i++){
            sb.append(answer.get(i)).append(", ");
        }
        sb.append(answer.get(n-1));
        sb.append(">");

        System.out.println(sb);




    }
    public static void main(String[] args) throws Exception{
        solution();
    }
}