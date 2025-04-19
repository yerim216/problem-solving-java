import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 1번 : 주기 5
        // 2번 : 주기 6
        // 3번 : 주기 10
        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;
        
        int size = answers.length;
        for(int i=0; i<size; i++){
            if(answers[i]-stu1[i%5]==0)
                cnt1++;
            if(answers[i]-stu2[i%8]==0)
                cnt2++;
            if(answers[i]-stu3[i%10]==0)
                cnt3++;
        }
        //System.out.println("cnt1 :"+cnt1);
        //System.out.println("cnt2 :"+cnt2);
        //System.out.println("cnt3 :"+cnt3);
        
        int max = Math.max(cnt1, Math.max(cnt2, cnt3));
        //System.out.println("max :"+max);
        
        List<Integer> list = new ArrayList<>();
        if(max==cnt1){
            list.add(1);
        }
        if(max==cnt2){
            list.add(2);
        }
        if(max==cnt3){
            list.add(3);
        }
        Collections.sort(list);
        //System.out.println(list.toString());
        
        return list.stream().mapToInt(x->x).toArray();
    }
}