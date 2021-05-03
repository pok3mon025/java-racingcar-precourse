package racingcar.domain;

import racingcar.utils.RandomUtils;

public class Car {
	private static final int STOP_MAX_VALUE = 3;
	private static final int MAX_NAME_LENGTH = 5;

	protected int position = 0;
	protected final String name;

	public Car(String name) {
		validateNameLength(name);
		this.name = name;
	}

	private void validateNameLength(String name) {
		if (name.length() > MAX_NAME_LENGTH) {
			throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
		}
	}

	public CarStatus race() {

		if (RandomUtils.createRandomNumber() <= STOP_MAX_VALUE) {
			return CarStatus.STOP;
		}

		movePosition();

		return CarStatus.MOVE;
	}

	private void movePosition() {
		this.position++;
	}

}
