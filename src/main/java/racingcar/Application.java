package racingcar;

import racingcar.config.GameConfig;
import racingcar.controller.RacingCarGame;
import racingcar.domain.RandomNumberGenerateStrategy;

public class Application {
    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(new RandomNumberGenerateStrategy());

        RacingCarGame racingCarGame = new RacingCarGame(gameConfig);
        racingCarGame.play();
    }
}
