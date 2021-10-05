package baseball;

import java.util.List;

public class BaseBall {
	private final List<Ball> computerBall;
	private int strike;
	private int ball;

	public BaseBall(List<Ball> computerBall) {
		this.computerBall = computerBall;
		this.strike = 0;
		this.ball = 0;
	}

	public void playBall(Ball ball) {
		for (Ball b : computerBall) {
			if (b.compareBall(ball).equals("STRIKE")) {
				this.strike++;
			}
			if (b.compareBall(ball).equals("BALL")) {
				this.ball++;
			}
		}
	}

	public int getStrike() {
		return strike;
	}

	public int getBall() {
		return ball;
	}
}
