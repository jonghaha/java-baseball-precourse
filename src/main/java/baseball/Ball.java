package baseball;

public class Ball {

	private final int position;
	private final int value;

	public Ball(int position, int value) {
		this.position = position;
		this.value = value;
	}

	public String compareBall(Ball ball) {
		if (position == ball.position && value == ball.value) {
			return "STRIKE";
		}
		return "NOTHING";
	}
}
