package baseball.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Computer {

    private static final List<Integer> answer = new ArrayList<>();
    private static Random random;


    public static List<Integer> generateNumber () {
        int randomNumber = random.nextInt(9) + 1;
        answer.add(randomNumber);
        return answer;
    }
}
