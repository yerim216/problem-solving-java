import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new LinkedList<>();
        //List<Integer> list = new LinkedList<>();
        
        int index = 0;
        int count = 0;
        int b_weight = 0;
        int answer = 0;
        
        for(int i=0; i<bridge_length; i++){
            bridge.add(0);
        }
        
        while(index<truck_weights.length || b_weight>0){
            b_weight -= bridge.poll();
            
            if(index<truck_weights.length && b_weight+truck_weights[index]<=weight){
                bridge.add(truck_weights[index]);
                b_weight += truck_weights[index];
                index++;
            } else {
                bridge.add(0);
            }
            answer++;
        }
        return answer;
     
//         for(int i=0; i<truck_weights.length; i++){
//             wait.add(truck_weights[i]);
//         }
//         int seconds = 0;
//         while(!wait.isEmpty()){
//             answer ++;
//             boolean status = false;
           
//             //현재 차 진입 여부 결정
//             if(carCnt<bridge_length && b_weight + wait.peek()<= weight){
//                 status = true;
//             }
         
            
//             //한 칸씩 앞으로 이동
//             int[] copy = bridge;
//             for(int i=bridge_length-1; i>0; i--){
//                 bridge[i-1] = copy[i];
//             }
//             //출차
//             if(copy[0]!=0){
//                 bridge[0] = 0;
//                 carCnt--; 
//                 b_weight-=copy[0];
//             }
            
//             //새로운 차 진입
//             if(status){
//                 int pop = wait.poll();
//                 bridge[bridge.length-1] = pop;
//                 carCnt++; 
//                 b_weight+=pop;
//             }  else {
//                 bridge[bridge.length-1] = 0;
//             }
             
// //             
//         }
//         for(int i=bridge.length-1; i>=0; i--){
//             if(bridge[i]!=0){
//                 answer+= i+1;
//                 return answer;
//             }
//         }
// //         for(int i=0; i<truck_weights.legnth; i++){
// //             answer ++;
// //             boolean status = false;
           
// //             if(q.size()<bridge_length && b_weigth + truck_weights[i]<= weight){
// //                 status = true;
// //                 // q.add(truck_weights[i]);
// //                 // b_weight += truck_weights[i]; 
// //             }
// //              if(!q.isEmpty()){
// //                 int pop = q.poll();
// //                 b_weight -= pop;
// //             }
// //             if(status){
// //                 q.add(truck_weights[i]);
// //                  b_weight += truck_weights[i]; 
            
// //             }
             
           
// //         }
       
        //return answer;
    }
}