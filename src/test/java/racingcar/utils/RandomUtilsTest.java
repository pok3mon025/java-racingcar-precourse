package racingcar.utils;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RandomUtilsTest {

	@Test
	@DisplayName("0~9 사이의 랜덤 값 생성 테스트")
	void createRandomNumberTest() {
		assertThat(RandomUtils.createRandomNumber()).isLessThanOrEqualTo(9);
		assertThat(RandomUtils.createRandomNumber()).isGreaterThanOrEqualTo(0);
	}
}
