package onboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem3 {
    public static List<Integer> solution(List<Integer> numbers){
        List<Integer> answer = new ArrayList<>();

        int sum = 0;
        for(int i = 0; i < 5; i++) {
            sum += numbers.get(i);
        }

        Collections.sort(numbers);

        answer = List.of(sum / 5, numbers.get(2));

        return answer;
    }
}
