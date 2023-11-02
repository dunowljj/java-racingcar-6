package racingcar.config;

import racingcar.domain.NumberGenerateStrategy;

public class GameConfig {

    private NumberGenerateStrategy numberGenerateStrategy;

    public GameConfig(NumberGenerateStrategy numberGenerateStrategy) {
        this.numberGenerateStrategy = numberGenerateStrategy;
    }

    public NumberGenerateStrategy getMovingStrategy() {
        return numberGenerateStrategy;
    }
}
