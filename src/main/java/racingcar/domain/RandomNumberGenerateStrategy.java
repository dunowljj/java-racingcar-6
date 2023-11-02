package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerateStrategy implements NumberGenerateStrategy {
    @Override
    public int generateValue() {
        return Randoms.pickNumberInRange(0, 9);
    }
}
