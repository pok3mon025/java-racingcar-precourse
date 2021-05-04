package racingcar.view;

import java.util.Scanner;

public class InputView {
	private static final String INPUT_RACING_CAR_NAME_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String INPUT_RACING_COUNT_MESSAGE = "시도할 회수는 몇회인가요?";
	private static final String INPUT_RACING_COUNT_ERROR_MESSAGE = "[ERROR] 회수는 1 이상만 입력 가능합니다.";
	private static final int RACING_COUNT_MIN_VALUE = 1;
	private static final Scanner scanner = new Scanner(System.in);

	public static String[] getRacingCarName() {
		System.out.println(INPUT_RACING_CAR_NAME_MESSAGE);
		return scanner.nextLine().split(",");
	}

	public static int getRacingCount() {
		System.out.println(INPUT_RACING_COUNT_MESSAGE);
		return validationRacingCount(scanner.nextInt());
	}

	private static int validationRacingCount(int nextInt) {
		if (nextInt < RACING_COUNT_MIN_VALUE) {
			throw new IllegalArgumentException(INPUT_RACING_COUNT_ERROR_MESSAGE);
		}
		return nextInt;
	}
}
