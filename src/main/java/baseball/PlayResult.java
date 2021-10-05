package baseball;

public class PlayResult {
	private int strike;
	private int ball;

	public PlayResult() {
		this.strike = 0;
		this.ball = 0;
	}

	public int getStrike() {
		return strike;
	}

	public void accumulateStrike() {
		this.strike++;
	}

	public int getBall() {
		return ball;
	}

	public void accumulateBall() {
		this.ball++;
	}
}
