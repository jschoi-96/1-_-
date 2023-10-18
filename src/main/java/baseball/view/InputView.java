package baseball.view;

import baseball.model.Computer;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class InputView {

    private static Scanner scanner = new Scanner(System.in);


    public String getInputNumber() {
        String input = scanner.next();
        return input;
    }

    private static void validateSize(String input) {
        if (input.length() != 3) {
            throw new IllegalArgumentException("플레이어는 세자리 수를 입력해야 합니다.");
        }
    }

    private static void validateDuplicate(String input) {
        Set<Character> duplicate = new HashSet<>();
        for(int i = 0; i < input.length(); i++){
            duplicate.add(input.charAt(i));
        }
        if (duplicate.size() != 3) {
            throw new IllegalArgumentException("중복되는 숫자를 입력값으로 받을 수 없습니다.");
        }
    }

    private static void validateString(String input) {
        String pattern = "^[0-9]*$";
        if (!Pattern.matches(pattern , input)){
            throw new IllegalArgumentException("숫자 외의 값은 입력값으로 받을 수 없습니다.");
        }
    }

}
