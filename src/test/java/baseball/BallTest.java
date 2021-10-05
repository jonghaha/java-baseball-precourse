package baseball;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BallTest {
	Ball computer;

	@BeforeEach
	void init() {
		computer = new Ball(1, 3);
	}

	@Test
	void 스트라이크인가() {
		String strike = computer.compareBall(new Ball(1, 3));
		assertThat(strike).isEqualTo("STRIKE");
	}

	@Test
	void 볼인가() {
		String ball = computer.compareBall(new Ball(2, 3));
		assertThat(ball).isEqualTo("BALL");
	}

	@Test
	void 낫싱인가() {
		String nothing = computer.compareBall(new Ball(1, 2));
		assertThat(nothing).isEqualTo("NOTHING");
	}
}
