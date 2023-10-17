package baseball.controller;

import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseballGameController {

    InputView inputView = new InputView();
    OutputView outputView = new OutputView();

    public void startGame() {
        outputView.getInputNumber();
        inputView.getInputNumber();
    }
}
