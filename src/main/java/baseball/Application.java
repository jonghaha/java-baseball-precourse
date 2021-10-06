package baseball;

import java.util.List;

import nextstep.utils.Console;
import utils.VaildationUtils;

public class Application {
	public static int RSTART_FLAG = 1;
	public static void main(String[] args) {
		start();
	}

	public static void start() {
		VaildationUtils vaildationUtils = new VaildationUtils();
		Game game = new Game();
		BaseBall computer = new BaseBall(game.generateNumbers());

		do {
			try {
				System.out.print("숫자를 입력해주세요 : ");
				String userValue = Console.readLine();
				List<Integer> userNumber = vaildationUtils.validNumber(userValue);
				game.play(computer, userNumber);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while (RSTART_FLAG < 2);
	}
}
