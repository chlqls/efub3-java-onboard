package onboard;

import java.util.ArrayList;
import java.util.List;

public class Problem2 {
    public static Integer[] solution(Integer[][] flipCards){
        Integer[] answer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        for(int i = 0; i < 10; i++) {
            int from = flipCards[i][0];
            int to = flipCards[i][1];

            while(from < to) {
                int temp = answer[from - 1];
                answer[from - 1] = answer[to - 1];
                answer[to - 1] = temp;
                from++;
                to--;
            }
        }
        return answer;
    }
}
