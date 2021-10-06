package baseball;

public enum DicisionCode {
	STRIKE, BALL, NOTHING;

	public static boolean isStrike(DicisionCode strike) {
		return STRIKE.equals(strike);
	}
	public static boolean isBall(DicisionCode ball) {
		return BALL.equals(ball);
	}
}
