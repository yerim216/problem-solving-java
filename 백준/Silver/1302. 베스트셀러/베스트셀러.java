import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new TreeMap<>();
        for(int i=0; i<n; i++){
            String s = br.readLine();
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            } else{
                map.put(s, 1);
            }
        }
        Iterator<String> it = map.keySet().iterator();
        int max = -1;
        String result = null;
        while(it.hasNext()){
            String key = it.next();
            int value = map.get(key);
            if(value>max){
                max = value;
                result = key;
            }
        }
        System.out.println(result);

    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}