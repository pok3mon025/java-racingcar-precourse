package racingcar.service;

import java.util.ArrayList;
import java.util.List;

import racingcar.domain.Car;
import racingcar.domain.Cars;
import racingcar.view.OutputView;

public class RacingCarService {
	public RacingCarService() {
	}

	public List<Car> getCars(String[] carNames) {
		List<Car> carList = new ArrayList<>();

		for (int i = 0; i < carNames.length; i++) {
			carList.add(new Car(carNames[i]));
		}

		return carList;
	}

	public void racing(Cars cars, int racingCount) {
		OutputView.printResultMessage();

		for (int i = 0; i < racingCount; i++) {
			cars.race();
		}

		OutputView.printWinner(cars.getWinner());
	}
}
