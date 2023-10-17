package baseball.view;

import baseball.model.Computer;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);


    public String getInputNumber() {
        String input = scanner.next();
        List<Integer> test = Computer.generateNumber();
        for (Integer integer : test) {
            System.out.println(integer);
        }
        return input;
    }

}
