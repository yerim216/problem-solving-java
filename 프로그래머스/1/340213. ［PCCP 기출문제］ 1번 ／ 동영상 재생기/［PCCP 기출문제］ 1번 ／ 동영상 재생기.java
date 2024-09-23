class Solution {
    static int convertMin(String time){
        int hour = Integer.parseInt(time.substring(0, 2));
        int min = Integer.parseInt(time.substring(3));
        return 60*hour+min;
    }
    static String convertHour(int time){
        int hour_num = time/60;
        int min_num = time%60;
        String hour = Integer.toString(hour_num);
        String min = Integer.toString(min_num);
        if(hour_num<10){
            hour = "0"+hour;
        }
        if(min_num<10){
            min = "0"+min;
        }
        return hour+":"+min;
    }
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        int videoMin = convertMin(video_len);
        int posMin = convertMin(pos);
        int startMin = convertMin(op_start);
        int endMin = convertMin(op_end);
       
        for(int i=0; i<commands.length; i++){
            if(posMin>=startMin && posMin<endMin){
                posMin = endMin;
            }
            if(commands[i].equals("prev")){
                if(posMin<10){
                    posMin = 0;
                } else {
                    posMin -= 10;
                }
                
            } else if(commands[i].equals("next")){
                if(posMin+10>=videoMin){
                    posMin = videoMin;
                } else {
                    posMin += 10;
                }
            }
            if(posMin>=startMin && posMin<endMin){
                posMin = endMin;
            }
        }
        String answer = convertHour(posMin);
        return answer;
    }
}