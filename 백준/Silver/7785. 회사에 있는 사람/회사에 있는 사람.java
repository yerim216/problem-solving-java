import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Set<String> set = new TreeSet<>();
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String command = st.nextToken();
            if(command.equals("enter")){
                set.add(s);
            } else if(command.equals("leave")){
                set.remove(s);
            }

        }
        List<String> list = new ArrayList<>(set);
        list.sort(Collections.reverseOrder());
        for (String s : list) {
            System.out.println(s);
        }


    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}