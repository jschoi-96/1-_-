package baseball.view;

import baseball.model.Computer;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);


    public String getInputNumber() {
        String input = scanner.next();
        validateSize(input);
        return input;
    }

    private static void validateSize(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("플레이어는 세자리 수를 입력해야 합니다.");
        }
    }

}
