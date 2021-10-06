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
		assertThat(computer.compareBall(new Ball(1, 3))).isEqualTo(DicisionCode.STRIKE);
	}

	@Test
	void 볼인가() {
		assertThat(computer.compareBall(new Ball(2, 3))).isEqualTo(DicisionCode.BALL);
	}

	@Test
	void 낫싱인가() {
		assertThat(computer.compareBall(new Ball(1, 2))).isEqualTo(DicisionCode.NOTHING);
	}
}
