package racingcar.utils;

import java.util.Random;

public class RandomUtils {
	private static final int BOUND = 10;

	public static int createRandomNumber() {
		return new Random().nextInt(BOUND);
	}
}
