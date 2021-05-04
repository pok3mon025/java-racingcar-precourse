package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

import com.sun.deploy.util.StringUtils;

public class Cars {
	List<Car> cars = new ArrayList<>();

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public void race() {
		for (Car car : cars) {
			car.race();
		}
	}

	public String getWinner() {
		int maxPosition = getMaxPosition();

		cars.removeIf(car -> car.position < maxPosition);

		return getCarNames();
	}

	private String getCarNames() {
		List<String> carNames = new ArrayList<>();

		for (Car car : cars) {
			carNames.add(car.name);
		}

		return StringUtils.join(carNames, ", ");
	}

	public int getMaxPosition() {
		int position = -1;

		for (Car car : cars) {
			position = Math.max(position, car.position);
		}

		return position;
	}
}
