import java.io.BufferedReader;
import java.io.InputStreamReader;
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

        for(int i=0; i<n; i++){
            List<Character> list = new LinkedList<>();
            ListIterator<Character> it = list.listIterator(0);
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            for(char c : s.toCharArray()){
              if(c=='<'){
                  if(it.hasPrevious()){
                      it.previous();
                  }
              } else if(c=='>'){
                  if(it.hasNext()){
                      it.next();
                  }

              } else if(c=='-'){
                  if(it.hasPrevious()){
                      it.previous();
                      it.remove();
                  }

              } else {
                  it.add(c);

              }
            }
            for(char c : list){
                sb.append(c);

            }
            System.out.println(sb);
            sb.setLength(0);



        }




    }
    public static void main(String[] args) throws Exception {
        solution();
    }

}
