package baseball.model;

import java.util.*;

public class Computer {

    private static final Set<Integer> answer = new HashSet<>();
    private static Random random = new Random();
    public static Set<Integer> generateNumber () {
        for(int i = 0; i < 3; i++) {
            int randomNumber = random.nextInt(9) + 1;
            answer.add(randomNumber);
        }

        return answer;
    }


}
