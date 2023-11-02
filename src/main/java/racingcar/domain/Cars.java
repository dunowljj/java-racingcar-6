package racingcar.domain;

import java.util.HashSet;
import java.util.List;

public class Cars {
    public static final String LINE_BREAK = "\n";
    private List<Car> cars;

    public Cars(List<String> names) {
        validateNameDuplication(names);

        this.cars = names.stream()
                .distinct()
                .map((name) -> new Car(name.trim()))
                .toList();
    }

    private void validateNameDuplication(List<String> names) {
        if (isDuplicatedNameExist(names)) {
            throw new IllegalArgumentException("중복되는 이름이 존재합니다.");
        }
    }

    private boolean isDuplicatedNameExist(List<String> names) {
        int originSize = names.size();
        int duplicationRemovedSize =  new HashSet<>(names).size();
        return duplicationRemovedSize != originSize;
    }

    public void tryToMove(NumberGenerateStrategy numberGenerateStrategy) {
        cars.stream()
                .forEach((car) -> car.tryToMove(numberGenerateStrategy));
    }

    public List<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        cars.stream()
                .forEach((car) -> builder.append(car.toString()).append(LINE_BREAK));

        return lastLineBreakRemovedResult(builder);
    }

    private static String lastLineBreakRemovedResult(StringBuilder builder) {
        String result = builder.substring(0, builder.lastIndexOf(Cars.LINE_BREAK));
        return result;
    }
}
