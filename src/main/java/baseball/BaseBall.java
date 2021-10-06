package baseball;

import java.util.ArrayList;
import java.util.List;

public class BaseBall {
	private List<Ball> balls;
	private PlayResult result;

	public BaseBall(List<Integer> balls) {
		this.balls = createBalls(balls);
		this.result = new PlayResult();
	}

	public PlayResult getResult() {
		return result;
	}

	public void setResult(PlayResult result) {
		this.result = result;
	}

	private List<Ball> createBalls(List<Integer> balls) {
		List<Ball> ballList = new ArrayList<>();
		for (int i = 1; i <= 3; i++) {
			ballList.add(new Ball(i, balls.get(i - 1)));
		}
		return ballList;
	}

	public void playBall(Ball ball) {
		for (Ball b : balls) {
			if (DicisionCode.isStrike(b.compareBall(ball))) {
				result.accumulateStrike();
			}
			if (DicisionCode.isBall(b.compareBall(ball))) {
				result.accumulateBall();
			}
		}
	}
}
