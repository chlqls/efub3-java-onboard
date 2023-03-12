package onboard;


import java.util.ArrayList;
import java.util.Comparator;

public class Problem4 {
    public static Integer solution(Integer number){
        Integer answer = 0;

        ArrayList<Integer> arrNum = new ArrayList<>();
        while(number > 0) {
            arrNum.add(number % 10);
            number /= 10;
        }
        arrNum.sort(Comparator.naturalOrder());

        for(int i = 0; i < arrNum.size(); i++) {
            answer += (int)(arrNum.get(i) * Math.pow(10, i));
        }

        return answer;
    }
}
