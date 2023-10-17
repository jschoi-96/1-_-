package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    private static final List<Integer> answer = new ArrayList<>();
    private static Random random = new Random();
    public static List<Integer> generateNumber () {
        while (answer.size() < 3) {
            int randomNumber = random.nextInt(9) + 1;
            if (!answer.contains(randomNumber)) {
                answer.add(randomNumber);
            }
        }

        return answer;
    }


}
