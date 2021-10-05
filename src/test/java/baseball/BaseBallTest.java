package baseball;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BaseBallTest {
	BaseBall computer;

	@BeforeEach
	void init() {
		computer = new BaseBall(Arrays.asList(3, 5, 2));
	}

	@Test
	void 원스트라이크_확인() {
		computer.playBall(new Ball(2, 5));
		assertThat(computer.getResult().getStrike()).isEqualTo(1);
	}

	@Test
	void 원볼_확인() {
		computer.playBall(new Ball(2, 3));
		assertThat(computer.getResult().getBall()).isEqualTo(1);
	}

	@Test
	void 낫싱_확인() {
		computer.playBall(new Ball(1, 8));
		computer.playBall(new Ball(2, 7));
		computer.playBall(new Ball(3, 9));
		assertThat(computer.getResult().getBall()).isEqualTo(0);
		assertThat(computer.getResult().getStrike()).isEqualTo(0);
	}
}
