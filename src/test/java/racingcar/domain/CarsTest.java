package racingcar.domain;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarsTest {
	@Test
	@DisplayName("우승한 자동차 이름 출력")
	public void getWinnerTest() {
		Car car1 = new Car("A");
		Car car2 = new Car("B");
		Cars cars = new Cars(Arrays.asList(car1, car2));

		if (car1.position == car2.position) {
			assertThat(cars.getWinner()).isEqualTo("A, B");
		} else if (car1.position > car2.position) {
			assertThat(cars.getWinner()).isEqualTo("A");
		} else {
			assertThat(cars.getWinner()).isEqualTo("B");
		}
	}
}
