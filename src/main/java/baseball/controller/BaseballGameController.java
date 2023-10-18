package baseball.controller;

import baseball.model.ValidateInput;
import baseball.view.View;

import camp.nextstep.edu.missionutils.Console;
public class BaseballGameController {

    View outputView = new View();
    public void startGame() {
        outputView.getInputNumber();
        getInputNumber();
    }

    public String getInputNumber() {
        String input = Console.readLine();
        ValidateInput.validateController(input);
        return input;
    }
}
