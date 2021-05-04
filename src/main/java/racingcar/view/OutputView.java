package racingcar.view;

public class OutputView {
	private static final String RACING_RESULT_MESSAGE = "실행 결과";
	private static final String RACING_DISTANCE = "-";
	private static final String DELIMETER = " : ";
	private static final String WINNER_MESSAGE = "가 최종 우승했습니다.";

	public static void printResultMessage() {
		System.out.println(RACING_RESULT_MESSAGE);
	}

	public static void printWinner(String winner) {
		System.out.println(winner + WINNER_MESSAGE);
	}

	public static void printCarDistance(String name, int position) {
		System.out.print(name + DELIMETER);

		for (int i = 0; i < position; i++) {
			System.out.print(RACING_DISTANCE);
		}

		System.out.println();
	}

	public static void printNextLine() {
		System.out.println();
	}
}
