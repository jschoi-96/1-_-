package baseball.model;

import java.util.List;
import java.util.stream.Stream;

public class Hint {

    private static String checkAll(List<Integer> computer, List<Integer> player) {
        if (checkNothing(computer,player)) {
            System.out.println("낫싱");
        }
    }

    private static boolean checkNothing (List<Integer> computer, List<Integer> player) {
        return Stream.concat(computer.stream(), player.stream())
                .distinct()
                .count() == computer.size() + player.size();
    }
}
