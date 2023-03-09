package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem1 {
    public static List<Integer> solution(Integer hour, Integer minute){
        List<Integer> answer = new ArrayList<>();
        if (minute >= 45) {
            minute -= 45;
        }
        else {
            minute += 60 - 45;
            hour -= 1;
            if(hour<0) {
                hour = 23;
            }
        }
        answer = List.of(hour, minute);
        return answer;
    }
}
