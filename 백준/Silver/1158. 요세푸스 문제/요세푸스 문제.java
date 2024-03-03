import java.awt.print.Pageable;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new LinkedList<>();
        List<Integer> result = new LinkedList<>();
        for(int i=0; i<n; i++){
            list.add(i+1);
        }
        ListIterator<Integer> it = list.listIterator(0);
        for(int i=0; i<n; i++){
            for(int j=0; j<k-1; j++){
                if(it.hasNext()){
                    it.next();
                } else {
                    it = list.listIterator(0);
                    it.next();
                }

            }
            if(it.hasNext()){
                result.add(it.next());
                it.remove();
            } else {
                it = list.listIterator(0);
                result.add(it.next());
                it.remove();
            }

        }
        sb.append("<");
        for(int i=0; i<result.size()-1; i++){
            sb.append(result.get(i)).append(", ");
        }
        sb.append(result.get(n-1));
        sb.append(">");

        System.out.println(sb);






    }
    public static void main(String[] args) throws Exception {
        solution();
    }

}
