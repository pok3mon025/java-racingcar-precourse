package racingcar.domain;

public class CarName {
	private static final int MAX_LENGTH = 5;

	private String name;

	public CarName(String name) {
		if (name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
		}
		this.name = name;
	}
}
