package baseball.view;

import java.util.Scanner;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);

    public String getInputNumber() {
        String input = scanner.next();
        return input;
    }

}
