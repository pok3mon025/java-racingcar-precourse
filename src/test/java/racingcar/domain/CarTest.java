package racingcar.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
	private Car car;

	@BeforeEach
	void setUp() {
		car = new Car("A");
	}

	@Test
	@DisplayName("자동차 이름 길이 유효성 체크")
	void validNameLengthTest() {
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
			() -> new Car("AAAAAA"));
		assertThat(exception.getMessage()).isEqualTo("[ERROR] 자동차 이름은 5자 이하만 가능합니다.");
	}

	@Test
	@DisplayName("자동차 전진 테스트")
	void carMoveTest() {
		CarStatus status = car.race();
		if (status == CarStatus.MOVE) {
			assertThat(car.position).isEqualTo(1);
		} else {
			assertThat(car.position).isEqualTo(0);
		}
	}
}
