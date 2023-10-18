package baseball.controller;

import baseball.model.Computer;
import baseball.model.Player;
import baseball.model.ValidateInput;
import baseball.view.View;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class BaseballGameController {

    View outputView = new View();
    private static Player player = new Player();
    private static List<Integer> playerInput = player.getPlayer();

    public void startGame() {
        outputView.getInputNumber();
        getInputNumber();
        Computer.generateNumber();
        for (Integer integer : playerInput) {
            System.out.println(integer);
        }
    }

    private String getInputNumber() {
        String input = Console.readLine();
        ValidateInput.validateController(input);
        convertInt(input);
        return input;
    }

    private static void convertInt(String input) {
        for(int i = 0; i < input.length(); i++){
            char charInput = input.charAt(i);
            int intInput = Character.getNumericValue(charInput);
            playerInput.add(intInput);
        }
    }
}
