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
//        for(int i = 0; i < 4; i++) {
//            for(int j = i + 1; j < 5; j++) {
//                if(numbers.get(i) > numbers.get(j)){
//                    Collections.swap(numbers, i, j);
                    //int temp = numbers.get(i);
                    //numbers.set(i, numbers.get(j));
                    //numbers.set(j, temp);
//                }
//            }
//        }

        answer = List.of(sum / 5, numbers.get(2));

        return answer;
    }
}
