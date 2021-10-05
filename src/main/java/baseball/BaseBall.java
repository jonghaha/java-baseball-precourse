package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseBall {
	private final List<Ball> balls;
	private int strike;
	private int ball;

	public BaseBall(List<Integer> balls) {
		this.balls = createBalls(balls);
		this.strike = 0;
		this.ball = 0;
	}

	private List<Ball> createBalls(List<Integer> balls) {
		List<Ball> ballList = new ArrayList<>();
		for (int i = 1; i < 3; i++) {
			ballList.add(new Ball(i, balls.get(i - 1)));
		}
		return ballList;
	}

	public void playBall(Ball ball) {
		for (Ball b : balls) {
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
