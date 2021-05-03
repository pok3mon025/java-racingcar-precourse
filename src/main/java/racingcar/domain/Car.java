package racingcar.domain;

import racingcar.utils.RandomUtils;

public class Car {
	private static final int STOP_MAX_VALUE = 3;

	protected int position = 0;
	private final CarName name;

	public Car(int position, CarName name) {
		this.position = position;
		this.name = name;
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
