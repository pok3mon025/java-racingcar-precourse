package racingcar.controller;

import racingcar.domain.Cars;
import racingcar.service.RacingCarService;
import racingcar.view.InputView;

public class RacingCarController {
	private final RacingCarService racingCarService;

	public RacingCarController(RacingCarService racingCarService) {
		this.racingCarService = racingCarService;
	}

	public void gameStart() {
		String[] carNames = InputView.getRacingCarName();
		int racingCount = InputView.getRacingCount();

		Cars cars = new Cars(racingCarService.getCars(carNames));

		racingCarService.racing(cars, racingCount);
	}
}
