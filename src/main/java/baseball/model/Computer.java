package baseball.model;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;


public class Computer {

    private static final List<Integer> answer = new ArrayList<>();
    public static List<Integer> generateNumber () {
        while (answer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!answer.contains(randomNumber)) {
                answer.add(randomNumber);
                System.out.println(randomNumber);
            }
        }

        return answer;
    }


}
