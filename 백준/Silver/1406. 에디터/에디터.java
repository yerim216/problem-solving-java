import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.StringTokenizer;

public class Main {
    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String s = st.nextToken();
        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        List<Character> list = new LinkedList<>();
        for(char c : s.toCharArray()){
            list.add(c);
        }
        ListIterator<Character> it = list.listIterator(list.size());
        //int cursor = s.length();
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();

            if(temp.charAt(0)=='L'){
                if(it.hasPrevious()){
                    it.previous();
                }
            } else if(temp.charAt(0)=='D'){
                if(it.hasNext()){
                    it.next();
                }
            } else if(temp.charAt(0)=='B'){
                if (it.hasPrevious()) {
                    it.previous();
                    it.remove();
                }

            } else if(temp.charAt(0)=='P'){
                it.add(st.nextToken().charAt(0));
            }
        }
        for(char c : list){
            sb.append(c);
        }

        System.out.println(sb);



    }
    public static void main(String[] args) throws Exception {
        solution();
    }

}
