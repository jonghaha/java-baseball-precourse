package baseball;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import nextstep.utils.Console;
import nextstep.utils.Randoms;

public class Game {
	private final int START_INCLUSIVE = 1;
	private final int END_INCLUSIVE = 9;

	public void play(BaseBall computer, List<Integer> userNumber) {
		int position = 1;
		for (Integer num : userNumber) {
			computer.playBall(new Ball(position++, num));
		}

		checkResult(computer);
	}

	public List<Integer> generateNumbers() {
		Set<Integer> computerNumber = new LinkedHashSet<>();
		while (computerNumber.size() < 3) {
			computerNumber.add(Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE));
		}

		return new ArrayList<>(computerNumber);
	}

	private void checkResult(BaseBall computer) {
		showHint(computer);

		if (computer.getResult().getStrike() == 3) {
			end();
		}

		computer.setResult(new PlayResult());
	}

	private void showHint(BaseBall computer) {
		if (computer.getResult().getStrike() == 0 && computer.getResult().getBall() == 0) {
			System.out.println("낫싱");
			return;
		}

		if (computer.getResult().getStrike() > 0) {
			System.out.print(computer.getResult().getStrike() + "스트라이크 ");
		}

		if (computer.getResult().getBall() > 0) {
			System.out.println(computer.getResult().getBall() + "볼");
		}
	}

	private void end() {
		System.out.println("3개의숫자를모두맞히셨습니다!게임 끝");
		System.out.println("게임을새로시작하려면1,종료하려면2를입력하세요.");
		restart();
	}

	private void restart() {
		Application.RSTART_FLAG = Integer.parseInt(Console.readLine());
		if (Application.RSTART_FLAG < 2) {
			Application.start();
		}
	}

}
