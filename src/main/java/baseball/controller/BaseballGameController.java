package baseball.controller;

import baseball.model.Player;
import baseball.model.ValidateInput;
import baseball.view.View;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class BaseballGameController {

    View outputView = new View();
    Player player = new Player();
    List<String> playerInput = player.getPlayer();

    public void startGame() {
        outputView.getInputNumber();
        getInputNumber();
    }

    public String getInputNumber() {
        String input = Console.readLine();
        ValidateInput.validateController(input);
        playerInput.add(input);
        return input;
    }
}
