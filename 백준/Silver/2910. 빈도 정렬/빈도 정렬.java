import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;


public class Main {

    public static void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] str = br.readLine().split(" ");

        int length = Integer.parseInt(str[0]);

        str = br.readLine().split(" ");
        HashMap<Integer, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<length; i++){
            int num = Integer.parseInt(str[i]);
            if(map.containsKey(num)){
                map.replace(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        ArrayList<Integer> arr = new ArrayList<>(map.keySet());
        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //내림차순 정렬
                return Integer.compare(map.get(o2), map.get(o1));
            }
        });

        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            Integer result = it.next();
            for(int i=0; i<map.get(result); i++){
                System.out.print(result+" ");
            }
        }


    }


    public static void main(String[] args) throws Exception {
        solution();
    }
}